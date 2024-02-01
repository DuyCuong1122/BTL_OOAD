package jjj;

public class Model {
    private static Model instance;
    private String data; // Dữ liệu đơn giản cho mục đích minh họa

    private Model() {
        data = "Hello from Model!";
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String newData) {
        this.data = newData;
    }
}
