package user.Infomation;

public class InforModel  {
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
        // ID = "123456789";
        // ten = "Nguyễn Văn 9";
        // ngaySinh = "01/01/2000";
        // sdt = "0123456789";
        // diachiThuongtru = "123 Nguyễn Văn A, P.1, Q.1, TP.HCM";
        // cccd = "123456789";
        // ngheNghiep = "Sinh viên";
        // noiCongtac = "Đại học Khoa học Tự nhiên";
        // nhomMau = "A";
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
