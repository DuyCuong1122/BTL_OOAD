package Infomation;

import Event.EventModel;
import homepage_user.HomepageController;

public class InforController {
    private static InforController instance;
    private static InforModel infoModel;

    InforController(String id)
    {
        infoModel = InforModel.getInstanceModel(id);
    }

    public static InforController getInstance(String id) {
        if (instance == null) {
            instance = new InforController(id);
        }
        return instance;
    }

    public String name() {
        return infoModel.getTen();
    }

    public String ngaySinh() {
        return infoModel.getNgaySinh();
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
