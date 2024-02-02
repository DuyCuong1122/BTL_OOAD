package user.Infomation;

import user.homepage_user.HomepageController;

public class InforController {
    private static InforController instance;
    private static InforModel infoModel;

    InforController() {
        infoModel = InforModel.getInstanceModel();
    }

    public static InforController getInstance() {
        if (instance == null) {
            instance = new InforController();

        }
        return instance;
    }

    public String name() {
        return infoModel.getTen();
    }

    public String thongTinYTe()
    {
        return infoModel.getThongTinYTe();
    }

    public void set_thongTinYTe(String thongTinYTe)
    {
        infoModel.setThongTinYTe(thongTinYTe);
    }

    public String ngaySinh() {
        return infoModel.getNgaySinh();
    }

    public String canNang()
    {
        return infoModel.getCanNang();
    }

    public String chieuCao()
    {
        
        return infoModel.getChieuCao();
    }

    public void set_chieuCao(String chieuCao)
    {
        infoModel.setChieuCao(chieuCao);
    }

    public void set_canNang(String canNang)
    {
        infoModel.setCanNang(canNang);
    }

    public String sdt() {
        return infoModel.getSdt();
    }

    public String diaChi() {
        return infoModel.getDiachiThuongtru();
    }

    public String CCCD() {
        return infoModel.getCccd();
    }

    public String ngheNghiep() {
        return infoModel.getNgheNghiep();
    }

    public String noiCongTac() {
        return infoModel.getNoiCongtac();
    }

    public String nhomMau() {
        return infoModel.getNhomMau();
    }

    public void set_Ten(String ten) {
        infoModel.setTen(ten);
    }

    public void set_sdt(String sdt) {
        infoModel.setSdt(sdt);
    }

    public void set_ngaySinh(String ngaySinh) {
        infoModel.setNgaySinh(ngaySinh);
    }

    public void set_nhomMau(String nhomMaur) {
        infoModel.setNhomMau(nhomMaur);
    }

    public void set_diaChi(String diaChi) {
        infoModel.setDiachiThuongtru(diaChi);
    }

    public void set_CCCD(String CCCD) {
        infoModel.setCccd(CCCD);
    }

    public void set_ngheNghiep(String ngheNghiep) {
        infoModel.setNgheNghiep(ngheNghiep);
    }

    public void set_noiCongTac(String noiCongTac) {
        infoModel.setNoiCongtac(noiCongTac);
    }

    public void showChangeInfo() {
        HomepageController.getInstance().showChangeInfoPage();
        System.out.println("Data from Model: Change Infomation ");
    }
}
