package Sign_up;

import Database.Database;
import Infomation.InforModel;
import User.User;

import javax.swing.*;

public class Sign_upModel {
    private static Sign_upModel instance;
    private String ID;
    private String ten;
    private String ngaySinh;
    private String sdt;
    private String diachi;
    private String cccd;
    private String username;
    private String password;

    Sign_upModel() {
    }

    public static Sign_upModel getInstanceModel() {
        if (instance == null) {
            instance = new Sign_upModel();
        }
        return instance;
    }

    public void setTen(String ten){this.ten = ten;};
    public void setNgaySinh(String ngaysinh){this.ngaySinh = ngaysinh;};
    public void setSdt(String sdt){this.sdt = sdt;};
    public void setDiachi(String diachi){this.diachi = diachi;};
    public void setCccd(String cccd){this.cccd = cccd;};
    public void setUsername(String username){this.username = username;};
    public void setPassword(String pass){this.password = pass;};
    public int insert(){
        Database db = new Database();
        db.connect();
        int countID = User.countId(db.conn);
        System.out.println(countID);
        String originalString = String.valueOf(countID);
        String paddedString = String.format("%10s", originalString).replace(' ', '0');
        System.out.println(paddedString);
        return User.signUp(db.conn, paddedString, this.ten, this.ngaySinh,
                this.sdt, this.diachi, this.cccd,
                this.username, this.password);
    }
}
