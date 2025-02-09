package a1;

import util.JDBCtool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateuser {
    public static void update(tb_user tb_user)  {
        Connection connection= JDBCtool.getConnection();
        String sql="UPDATE tb_user SET name=?,sex=?,email=? WHERE stuid=?";
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            System.out.println(tb_user.getStuid());
            System.out.println(tb_user.getSec());
statement.setString(1,tb_user.getName());
statement.setString(2,tb_user.getSec());
statement.setString(3,tb_user.getEmail());
statement.setInt(4,tb_user.getStuid());
statement.executeUpdate();
statement.close();
connection.close();
        }catch (SQLException e){
            System.out.println("语句有误。");
        }
    }
}
