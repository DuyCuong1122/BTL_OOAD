package Sign_up;

import Infomation.InforController;
import Infomation.InforModel;

public class Sign_upController {
    private static Sign_upController instance;
    private static Sign_upModel sign_upModel = Sign_upModel.getInstanceModel();;
    private Sign_upController() {
    }
    public static Sign_upController getInstance() {
        if (instance == null) {
            instance = new Sign_upController();
        }
        return instance;
    }
    public static int check() {
        return sign_upModel.insert();
    }
    public static void setTen(String ten){sign_upModel.setTen(ten);}
    public static void setNgaySinh(String ngaysinh){sign_upModel.setNgaySinh(ngaysinh);}
    public static void setSdt(String sdt){sign_upModel.setSdt(sdt);}
    public static void setDiachi(String diachi){sign_upModel.setDiachi(diachi);}
    public static void setCccd(String cccd){sign_upModel.setCccd(cccd);}
    public static void setUsername(String username){sign_upModel.setUsername(username);}
    public static void setPassword(String pass){sign_upModel.setPassword(pass);}
}
