package admin.event_join;

import java.time.LocalDateTime;
import java.util.Date;

public class Event_joinModel {
    private static Event_joinModel instance;
    private String id_event;
    private String ten;
    private String noiDung;
    private String link;
    private String viTri;
    private String sdt;
    private Date ngayBatdau;
    private Date ngayKetthuc;
    private LocalDateTime thoigianTao;
    private String id_ad;

    Event_joinModel() {
        id_event = "123456789";
        ten = "Chu nhat do";
        noiDung = "Hien mau nhan dao kiem nguoi yeu";
        link = "abc.com";
        viTri = "123 Nguyễn Văn A, P.1, Q.1, TP.HCM";
        sdt = "123456789";
        ngayBatdau = new Date();
        ngayKetthuc = new Date();
        thoigianTao = LocalDateTime.now();
        id_ad = "A";
    }

    public static Event_joinModel getInstanceModel() {
        if (instance == null) {
            instance = new Event_joinModel();
        }
        return instance;
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

    public Date getNgayBatdau() {
        return ngayBatdau;
    }

    public void setNgayBatdau(Date ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }

    public Date getNgayKetthuc() {
        return ngayKetthuc;
    }

    public void setNgayKetthuc(Date ngayKetthuc) {
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
