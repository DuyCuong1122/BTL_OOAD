package Event;

import Database.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventModel {
    private static EventModel instance;
    private String id_event;
    private String ten;
    private String noiDung;
    private String link;
    private String viTri;
    private String sdt;
    private String ngayBatdau;
    private String ngayKetthuc;
    private LocalDateTime thoigianTao;
    private String id_ad;

    EventModel(String id_event) {
        Database db = new Database();
        db.connect();
        try {
            String sql = "SELECT * from event WHERE ID_sukien = ?";
            PreparedStatement stmt1 = db.conn.prepareStatement(sql);
            stmt1.setString(1, id_event);
            // Execute the query
            ResultSet rs = stmt1.executeQuery();
            // Process the result set
            while (rs.next()) {
//                String id_event = rs.getString("ID_sukien");
                ten = rs.getString("tenSukien");
                noiDung = rs.getString("noiDung");
                link = rs.getString("link");
                viTri = rs.getString("viTri");
                ngayBatdau = rs.getDate("ngayBatdau").toString();
                ngayKetthuc = rs.getDate("ngayKetthuc").toString();
                sdt = rs.getString("sdt");
                id_ad = rs.getString("ID_ad");

                System.out.println("ID_sukien: " + id_event);
                System.out.println("Ten su kien: " + ten);
                System.out.println("Noi dung: " + noiDung);
                System.out.println("Link: " + link);
                System.out.println("Vi tri: " + viTri);
                System.out.println("Ngay bat dau: " + ngayBatdau);
                System.out.println("Ngay ket thuc: " + ngayKetthuc);
            }
            System.out.println("Record read successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        ten = "Chu nhat do";
//        noiDung = "Hien mau nhan dao kiem nguoi yeu";
//        link = "abc.com";
//        viTri = "123 Nguyễn Văn A, P.1, Q.1, TP.HCM";
//        sdt = "123456789";
//        ngayBatdau = new Date();
//        ngayKetthuc = new Date();
//        thoigianTao = LocalDateTime.now();
//        id_ad = "A";
    }

    public static EventModel getInstanceModel(String id) {
        instance = new EventModel(id);
        return instance;
    }

    public static List<String> readallEvent(){
        List<String> list_id_event = new ArrayList<>();
        Database db = new Database();
        db.connect();
        try {
            String sql = "SELECT * from event";
            PreparedStatement stmt1 = db.conn.prepareStatement(sql);
            // Execute the query
            ResultSet rs = stmt1.executeQuery();
            // Process the result set
            while (rs.next()) {
                String id_event = rs.getString("ID_sukien");

                System.out.println("ID_sukien: " + id_event);
                list_id_event.add(id_event);
            }
            System.out.println("Record read successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_id_event;
    }
    public String getId_event() {
        return id_event;
    }

    public void setId_event(String id_event) {
        this.id_event = id_event;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgayBatdau() {
        return ngayBatdau;
    }

    public void setNgayBatdau(String ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }

    public String getNgayKetthuc() {
        return ngayKetthuc;
    }

    public void setNgayKetthuc(String ngayKetthuc) {
        this.ngayKetthuc = ngayKetthuc;
    }

    public LocalDateTime getThoigianTao() {
        return thoigianTao;
    }

    public void setThoigianTao(LocalDateTime thoigianTao) {
        this.thoigianTao = thoigianTao;
    }

    public String getId_ad() {
        return id_ad;
    }

    public void setId_ad(String id_ad) {
        this.id_ad = id_ad;
    }

}
