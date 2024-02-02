package Infomation;

import homepage_user.HomepageController;

public class InforController {
    private static InforController instance;
    private static InforModel infoModel =InforModel.getInstanceModel();

    private InforController() {
    }

    public static InforController getInstance() {
        if (instance == null) {
            instance = new InforController();
        }
        return instance;
    }

    public static String name() {
        return infoModel.getTen();
    }

    public static String ngaySinh() {
        return infoModel.getNgaySinh();
    }

    public static String sdt() {
        return infoModel.getSdt();
    }

    public static String diaChi() {
        return infoModel.getDiachiThuongtru();
    }

    public static String CCCD() {
        return infoModel.getCccd();
    }

    public static String ngheNghiep() {
        return infoModel.getNgheNghiep();
    }

    public static String noiCongTac() {
        return infoModel.getNoiCongtac();
    }

    public static String nhomMau() {
        return infoModel.getNhomMau();
    }

    public static void set_Ten(String ten) {
        infoModel.setTen(ten);
    }

    public static void set_sdt(String sdt) {
        infoModel.setSdt(sdt);
    }

    public static void set_ngaySinh(String ngaySinh) {
        infoModel.setNgaySinh(ngaySinh);
    }

    public static void set_nhomMau(String nhomMaur) {
        infoModel.setNhomMau(nhomMaur);
    }

    public static void set_diaChi(String diaChi) {
        infoModel.setDiachiThuongtru(diaChi);
    }

    public static void set_CCCD(String CCCD) {
        infoModel.setCccd(CCCD);
    }

    public static void set_ngheNghiep(String ngheNghiep) {
        infoModel.setNgheNghiep(ngheNghiep);
    }

    public static void set_noiCongTac(String noiCongTac) {
        infoModel.setNoiCongtac(noiCongTac);
    }

    public void showChangeInfo() {
        
        HomepageController.getInstance().showChangeInfoPage();
        System.out.println("Data from Model: Change Infomation ");
    }
}
