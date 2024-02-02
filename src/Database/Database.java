package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    public Connection conn = null;
    //    Connect database function
    public void connect() {
        try{
            String url = "jdbc:mysql://localhost:3306/apphienmau2";
            String username = "root";
            String password = "toilason1";
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println(this.conn);
            System.out.println("Connect database success!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void disconnect(){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
