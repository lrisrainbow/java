package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtool {
    private JDBCtool(){}
    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("数据库加载失败");
        }

    }
    public  static Connection getConnection()  {
        Connection connection=null;
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/libraries","root","123456");
        }
      catch (SQLException e){
          System.out.println("数据库连接失败");

      }
        return connection;
    }

public static void releaseConnection(Connection connection){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("释放数据库失败");
            }
        }
}
}
