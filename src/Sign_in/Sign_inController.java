package Sign_in;

public class Sign_inController {
    private static Sign_inController instance;
    private static Sign_inModel sign_inModel = Sign_inModel.getInstanceModel();;
    private Sign_inController() {
    }
    public static Sign_in.Sign_inController getInstance() {
        if (instance == null) {
            instance = new Sign_inController();
        }
        return instance;
    }
    public static int checkAcc() {
        return sign_inModel.checkAcc();
    }
    public static String getRole(){
        return sign_inModel.role();
    }
    public static String getID(){
         return sign_inModel.ID();
    }
    public static void setUser(String username){sign_inModel.setUser(username);}
    public static void setPass(String pass){sign_inModel.setPass(pass);}
}
