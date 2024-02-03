package user.form_dang_ky;

import admin.homepage_admin.HomepageController;

public class FormController {
    private static FormController instance;
    private FormModel formModel;
    FormController() {
        formModel = formModel.getInstanceModel();
    }

    public static FormController getInstance() {
        if (instance == null) {
            instance = new FormController();
        }
        return instance;
    }

    public void showInfoEventPage() {
        HomepageController.getInstance().showInfoEventPage();
    }

    public void set_luongMauHien(String luongMauHien) 
    {
        formModel.set_luongMauHien(luongMauHien);
    }

    public void set_ngayThamGia(String thoiGian)
    {
        formModel.set_ngayThamGia(thoiGian);
    }
}
