package User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class User {
    public String tenDangnhap;
    public String matKhau;
    public String vaitro;
    public int dangKi;
    public String ID;

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
    public void signIn(Connection conn){
        ;
    }
}
