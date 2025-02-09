package a1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch ( ClassNotFoundException e){
            System.out.println("classforname异常");
        }
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/xkgl","root","123456");
            String sql="UPDATE tb_user SET stuid=?,name=?,sex=?,email=?where stuid=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,3);
            statement.setString(2,"ross");
            statement.setString(3,"00");
            statement.setString(4,"000");
            statement.setInt(5,3);
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
