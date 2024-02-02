package Form;

import java.sql.*;

public class Form {
    public String id_form;
    public float luongMau;
    public String thoigianGui;
    public String thoigianKham;
    public int khamSuckhoe;
    public int thamGia;
    public String id_tnv;
    public String id_event;
    public Form(String id_form, float luongMau, String thoigianGui,
                String thoigianKham, int thamGia, int khamSuckhoe, String id_tnv, String id_event){
        this.id_form = id_form;
        this.luongMau = luongMau;
        this.thoigianGui = thoigianGui;
        this.thoigianKham = thoigianKham;
        this.thamGia = thamGia;
        this.khamSuckhoe = khamSuckhoe;
        this.id_tnv = id_tnv;
        this.id_event = id_event;
    }
    public void insertForm(Connection conn){
        try {
            String sql = "INSERT INTO register (ID_bieumau, luongMau, thoigianGui, thoigianKham, khamSuckhoe, thamGia, ID_tnv, ID_sukien) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, this.id_form);
            stmt.setFloat(2, this.luongMau);
            stmt.setString(3, this.thoigianGui);
            stmt.setDate(4, Date.valueOf(this.thoigianKham));
            stmt.setInt(5, this.khamSuckhoe);
            stmt.setInt(6, this.thamGia);
            stmt.setString(7, this.id_tnv);
            stmt.setString(8, this.id_event);
            System.out.println(stmt);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new form was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void readForm(Connection conn, String id){
        try {
            String sql = "SELECT * from register WHERE ID_bieumau = ?";
            PreparedStatement stmt1 = conn.prepareStatement(sql);
            stmt1.setString(1, id);
            // Execute the query
            ResultSet rs = stmt1.executeQuery();
            // Process the result set
            while (rs.next()) {
                String retrievedId = rs.getString("ID_bieumau");
                float column1 = rs.getFloat("luongMau");
                Timestamp column2 = rs.getTimestamp("thoigianGui");
                Timestamp column3 = rs.getTimestamp("thoigianKham");

                System.out.println("ID_bieumau: " + retrievedId);
                System.out.println("luong mau: " + column1);
                System.out.println("Thoi gian gui: " + column2);
                System.out.println("Thoi gian kham: " + column3);
            }
            System.out.println("Record read successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteForm(Connection conn, String id_form){
        try {
            String sql1 = "DELETE from register WHERE id_bieumau = ?";
            PreparedStatement stmt1 = conn.prepareStatement(sql1);
            stmt1.setString(1, id_form);
            int rowsDeleted = stmt1.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A volunteer was deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
