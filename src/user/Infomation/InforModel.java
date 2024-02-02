package user.Infomation;

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
    private String thongTinYTe;
    private float chieuCao;
    private float canNang;

    InforModel() {
        ID = "123456789";
        ten = "Nguyễn Văn 9";
        ngaySinh = "01/01/2000";
        sdt = "0123456789";
        diachiThuongtru = "123 Nguyễn Văn A, P.1, Q.1, TP.HCM";
        cccd = "123456789";
        ngheNghiep = "Sinh viên";
        noiCongtac = "Đại học Khoa học Tự nhiên";
        nhomMau = "A";
        thongTinYTe = "Khong co tien su benh ly, chi thieu moi nguoi yeu dien hinh nhu Son";
        chieuCao = 1.7f;
        canNang = 60.0f;
    }

    public static InforModel getInstanceModel() {
        if (instance == null) {
            instance = new InforModel();
        }
        return instance;
    }

    public String getChieuCao() {
        String a = String.valueOf(chieuCao);
        return a;
    }

    public void setChieuCao(String chieuCao) {
        this.chieuCao = Float.valueOf(chieuCao);
    }

    public String getCanNang() {
        String a = String.valueOf(canNang);
        return a;
    }

    public void setCanNang(String canNang) {
        this.canNang = Float.valueOf(canNang);
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

    public String getThongTinYTe() {
        return thongTinYTe;
    }

    public void setThongTinYTe(String thongTinYTe) {
        this.thongTinYTe = thongTinYTe;
    }
}
