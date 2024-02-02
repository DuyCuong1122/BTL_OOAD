package Infomation;

import Database.Database;
import homepage_user.HomepageController;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InforModel {
    private static InforModel instance;
    private String ID;
    private String ten;
    private String ngaySinh;
    private String sdt;
    private String diachiThuongtru;
    private String cccd;
    private String ngheNghiep;
    private String noiCongtac;
    private String nhomMau;

    InforModel() {
//        ID = "123456789";
//        ten = "Nguyễn Văn 9";
//        ngaySinh = "01/01/2000";
//        sdt = "0123456789";
//        diachiThuongtru = "123 Nguyễn Văn A, P.1, Q.1, TP.HCM";
//        cccd = "123456789";
//        ngheNghiep = "Sinh viên";
//        noiCongtac = "Đại học Khoa học Tự nhiên";
//        nhomMau = "A";
        String id = "";
        Database db = new Database();
        try {
            db.connect();
            String sql = "SELECT * from temp";
            PreparedStatement stmt1 = db.conn.prepareStatement(sql);
            // Execute the query
            ResultSet rs = stmt1.executeQuery();
            // Process the result set
            while (rs.next()) {
                id = rs.getString("ID");
            }
            System.out.println("Record read ID successfully!" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            db.connect();
            String sql = "SELECT * from person WHERE ID = ?";
            PreparedStatement stmt1 = db.conn.prepareStatement(sql);
            stmt1.setString(1, id);
            // Execute the query
            ResultSet rs = stmt1.executeQuery();
            // Process the result set
            while (rs.next()) {
                ten = rs.getString("ten");
                sdt = rs.getString("sdt");
                ngaySinh = String.valueOf(rs.getDate("ngaySinh"));
                diachiThuongtru = rs.getString("diachiThuongtru");
                cccd = rs.getString("CCCD");
                ngheNghiep = rs.getString("ngheNghiep");
                noiCongtac = rs.getString("noiCongtac");

//                System.out.println("ID: " + id);
//                System.out.println("Ten: " + ten);
//                System.out.println("Ngay sinh: " + sdt);
//                System.out.println("So dien thoai: " + ngaySinh);
//                System.out.println("Dia chi thuong tru: " + diachiThuongtru);
//                System.out.println("CCCD: " + cccd);
//                System.out.println("Nghe nghiep: " + ngheNghiep);
//                System.out.println("Noi cong tac: " + noiCongtac);
            }
            System.out.println("Record read successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            db.disconnect();
        }
    }

    public static InforModel getInstanceModel() {
        if (instance == null) {
            instance = new InforModel();
        }
        return instance;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachiThuongtru() {
        return diachiThuongtru;
    }

    public void setDiachiThuongtru(String diachiThuongtru) {
        this.diachiThuongtru = diachiThuongtru;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getNoiCongtac() {
        return noiCongtac;
    }

    public void setNoiCongtac(String noiCongtac) {
        this.noiCongtac = noiCongtac;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

}
