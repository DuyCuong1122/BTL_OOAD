package Sign_up;

import Database.Database;

import java.sql.*;

public class Sign_upModel {
    private static Sign_upModel instance;
    private String ID;
    private String ten;
    private String ngaySinh;
    private String sdt;
    private String diachi;
    private String cccd;
    private String username;
    private String password;

    Sign_upModel() {
    }

    public static Sign_upModel getInstanceModel() {
        if (instance == null) {
            instance = new Sign_upModel();
        }
        return instance;
    }

    public void setTen(String ten){this.ten = ten;};
    public void setNgaySinh(String ngaysinh){this.ngaySinh = ngaysinh;};
    public void setSdt(String sdt){this.sdt = sdt;};
    public void setDiachi(String diachi){this.diachi = diachi;};
    public void setCccd(String cccd){this.cccd = cccd;};
    public void setUsername(String username){this.username = username;};
    public void setPassword(String pass){this.password = pass;};
    public int insert(){
        Database db = new Database();
        db.connect();
        int countID = Sign_upModel.countId(db.conn);
        System.out.println(countID);
        String originalString = String.valueOf(countID);
        String paddedString = String.format("%10s", originalString).replace(' ', '0');
        System.out.println(paddedString);
        return Sign_upModel.signUp(db.conn, paddedString, this.ten, this.ngaySinh,
                this.sdt, this.diachi, this.cccd,
                this.username, this.password);
    }
    public static int signUp(Connection conn, String id, String ten, String ngaySinh, String sdt,
                             String diachi, String cccd, String tenDangnhap, String matKhau){
        try {
            boolean accountExists = false;
            String sql = "SELECT * FROM user WHERE tenDangnhap = ?";
            PreparedStatement stmt3 = conn.prepareStatement(sql);

            // Set the parameter value
            stmt3.setString(1, tenDangnhap);

            // Execute the query
            ResultSet rs = stmt3.executeQuery();

            // Check if the result set has any rows
            if (rs.next()) {
                // Account exists
                accountExists = true;
                System.out.println("Account exists.");
            } else {
                // Account does not exist
                System.out.println("Account does not exist.");
                conn.setAutoCommit(false);
                String sql1 = "INSERT INTO person (ID, ten, ngaySinh, sdt, diachiThuongtru, CCCD) " +
                        "VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt1 = conn.prepareStatement(sql1);
                stmt1.setString(1, id);
                stmt1.setString(2, ten);
                Date date = Date.valueOf(ngaySinh);
                stmt1.setDate(3, date);
                stmt1.setString(4, sdt);
                stmt1.setString(5, diachi);
                stmt1.setString(6, cccd);
                int rowsAffected1 = stmt1.executeUpdate();

                String sql2 = "INSERT INTO user (tenDangnhap, matKhau, vaiTro, dangKi, ID) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, tenDangnhap);
                stmt2.setString(2, matKhau);
                stmt2.setString(3, "volunteer");
                stmt2.setInt(4, 0);
                stmt2.setString(5, id);
                stmt2.executeUpdate();
                int rowsAffected2 = stmt2.executeUpdate();
                conn.commit(); // Commit the transaction
                if (rowsAffected1 == 1 && rowsAffected2 == 1) {
                    System.out.println("Sign up successfully!");
                    return 1;
                } else {
                    return 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int countId(Connection conn){
        int count = 0;
        try {
            String sql = "SELECT * FROM user";
            PreparedStatement stmt3 = conn.prepareStatement(sql);
            // Execute the query
            ResultSet rs = stmt3.executeQuery();

            // Check if the result set has any rows
            while (rs.next()) {
                // Account exists
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
