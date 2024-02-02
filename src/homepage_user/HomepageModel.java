package homepage_user;

public class HomepageModel{
    private static HomepageModel instance;
    private String data;
    private String title;
    private String id;

    HomepageModel()
    {
        data = "Hello from Homepage Model";
        title = "Ứng dụng quản lý tham gia hiến máu";
    }

    public static HomepageModel getInstance()
    {
        if (instance == null)
        {
            instance = new HomepageModel();
        }
        return instance;
    }

    public String getData()
    {
        return data;
    }

    public String getTitle()
    {
        return title;
    }

    public String getID()
    {
        return id;
    }
    public void setID(String id)
    {
         this.id = id;
         System.out.println(this.id);
    }
    
}

