package user.homepage_user;

public class HomepageModel{
    private static HomepageModel instance;
    private String data;
    private String title;

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
    
}

