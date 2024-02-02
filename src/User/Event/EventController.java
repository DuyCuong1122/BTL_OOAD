package Event;

import java.util.Date;
import java.util.List;

import Event.EventModel;
import homepage_user.HomepageController;

public class EventController {
    private static EventController instance;
    private static EventModel instanceModel;

    EventController(String id)
    {
        instanceModel = EventModel.getInstanceModel(id);
    }

    public static EventController getInstance(String id)
    {
        instance = new EventController(id);
        return instance;
    }

    public static String getId_event()
    {
        return instanceModel.getId_event();
    }

    public static List<String> getallEvent(){return instanceModel.readallEvent();}
    public String getTen()
    {
        return instanceModel.getTen();
    }


    public String getNoiDung()
    {
        return instanceModel.getNoiDung();
    }

    public String getLink()
    {
        return instanceModel.getLink();
    }

    public String getViTri()
    {
        return instanceModel.getViTri();
    }

    public String getSdt()
    {
        return instanceModel.getSdt();
    }

    public String getNgayBatdau()
    {
        return instanceModel.getNgayBatdau();
    }

    public String getNgayKetthuc()
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

    public static void setNgayBatdau(String ngayBatdau)
    {
        instanceModel.setNgayBatdau(ngayBatdau);
    }


    public static void setNgayKetthuc(String ngayKetthuc)
    {
        instanceModel.setNgayKetthuc(ngayKetthuc);
    }

    public void showInfoEvent(String id)
    {
        System.out.println("Here" + id);
        HomepageController.getInstance().showInfoEventPage(id);
    }


}
