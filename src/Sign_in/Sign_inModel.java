package Sign_in;

import Database.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sign_inModel {
    private static Sign_inModel instance;
    private String username;
    private String password;
    Sign_inModel() {
    }
    public static Sign_inModel getInstanceModel() {
        if (instance == null) {
            instance = new Sign_inModel();
        }
        return instance;
    }
    public void setUser(String username){this.username = username;};
    public void setPass(String pass){this.password = pass;};
    public int checkAcc(){
        Database db = new Database();
        db.connect();
        int checkAcc = 0;
        try{
            String sql1 = "DELETE FROM temp";
            PreparedStatement stmt1 = db.conn.prepareStatement(sql1);
            stmt1.executeUpdate();
            System.out.println("Reset all ID");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            String sql = "SELECT * FROM user WHERE tenDangnhap = ? AND matKhau = ?";
            PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            // Execute the query
            ResultSet rs = stmt.executeQuery();
            // Check if the result set has any rows
            if (rs.next()) {
                // Account exists
                checkAcc = 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            db.disconnect();
        }
        return checkAcc;
    }
    public String ID(){
        Database db = new Database();
        db.connect();
        String id = "";
        try {
            String sql = "SELECT * from user WHERE tenDangnhap = ? AND matKhau = ?";
            PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            // Execute the query
            ResultSet rs = stmt.executeQuery();
            // Process the result set
            if (rs.next()) {
                id = rs.getString("ID");
                try{
                    String sql1 = "INSERT INTO temp (ID) VALUES (?)";
                    PreparedStatement stmt1 = db.conn.prepareStatement(sql1);
                    stmt1.setString(1, id);
                    stmt1.executeUpdate();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                finally {
                    db.disconnect();
                }
                System.out.println("ID: " + id);
            }
            System.out.println("Record read successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            db.disconnect();
        }
        return id;
    }

    public String role(){
        Database db = new Database();
        db.connect();
        String role = "";
        try {
            String sql = "SELECT * from user WHERE tenDangnhap = ? AND matKhau = ?";
            PreparedStatement stmt = db.conn.prepareStatement(sql);
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            // Execute the query
            ResultSet rs = stmt.executeQuery();
            // Process the result set
            while (rs.next()) {
                role = rs.getString("vaiTro");
                System.out.println("Vai tro: " + role);
            }
            System.out.println("Record read successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            db.disconnect();
        }
        return role;
    }
}
