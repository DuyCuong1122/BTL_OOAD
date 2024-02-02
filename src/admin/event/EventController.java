package admin.event;

import java.util.Date;

import admin.homepage_admin.HomepageController;

public class EventController {
    private static EventController instance;
    private static EventModel instanceModel;

    EventController()
    {
        instanceModel = EventModel.getInstanceModel();
    }

    public static EventController getInstance()
    {
        if (instance == null)
        {
            instance = new EventController();
        }
        return instance;
    }

    public static String getId_event()
    {
        return instanceModel.getId_event();
    }


    public static String getTen()
    {
        return instanceModel.getTen();
    }


    public static String getNoiDung()
    {
        return instanceModel.getNoiDung();
    }

    public static String getLink()
    {
        return instanceModel.getLink();
    }

    public static String getViTri()
    {
        return instanceModel.getViTri();
    }

    public static String getSdt()
    {
        return instanceModel.getSdt();
    }

    public static Date getNgayBatdau()
    {
        return instanceModel.getNgayBatdau();
    }

    public static Date getNgayKetthuc()
    {
        return instanceModel.getNgayKetthuc();
    }

    public static void setId_event(String id_event)
    {
        instanceModel.setId_event(id_event);
    }

    public static void setTen(String ten)
    {
        instanceModel.setTen(ten);
    }

    public static void setNoiDung(String noiDung)
    {
        instanceModel.setNoiDung(noiDung);
    }

    public static void setLink(String link)
    {
        instanceModel.setLink(link);
    }

    public static void setViTri(String viTri)
    {
        instanceModel.setViTri(viTri);
    }

    public static void setSdt(String sdt)
    {
        instanceModel.setSdt(sdt);
    }

    public static void setNgayBatdau(Date ngayBatdau)
    {
        instanceModel.setNgayBatdau(ngayBatdau);
    }


    public static void setNgayKetthuc(Date ngayKetthuc)
    {
        instanceModel.setNgayKetthuc(ngayKetthuc);
    }

    public void showInfoEvent()
    {
        HomepageController.getInstance().showInfoEventPage(); //;
    }

    public void showAddEvent()
    {
        HomepageController.getInstance().showAddEventPage();
    }
}
