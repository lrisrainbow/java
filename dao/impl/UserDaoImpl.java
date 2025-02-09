package dao.impl;

import bean.User;
import dao.UserDao;
import util.JDBCtool;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class UserDaoImpl implements UserDao {

    @Override
    public int insert(User user) {
        String sql ="INSERT INTO user(id,loginname,password)VALUES(?,?,?)";
        Connection connection= JDBCtool.getConnection();
        int num=0;
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
             statement.setInt(1,user.getId());
             statement.setString(2,user.getLoginname());
statement.setString(3,user.getPassword());
num=statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句有误");
        }
        return num;
    }

    @Override
    public int delete(Integer id) {
        String sql="DELETE FROM USER WHERE id=?";
        Connection connection=JDBCtool.getConnection();
        int num=0;
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            num=statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
return num;

    }

    @Override
    public int update(User user) {
        String sql="UPDATE user SET loginname=?,password=? WHERE id=?";
        Connection connection=JDBCtool.getConnection();
        int num=0;
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(3,user.getId());
            statement.setString(1,user.getLoginname());
            statement.setString(2,user.getPassword());
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
        return num;
    }

    @Override
    public List<User> selectAll() {
       List<User> users=new ArrayList<>();
        String sql="SELECT * FROM User";
        Connection connection=JDBCtool.getConnection();

        try {

            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setLoginname(resultSet.getString("loginname"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句有误");
        }
return users;
    }

    @Override
    public User secectByid(Integer id) {
        String sql="SELECT id,loginname,password FROM user WHERE id=?";
        Connection connection=JDBCtool.getConnection();
        User user=null;
        user=new User();
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
        statement.setObject(1,id);
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setLoginname(resultSet.getString("loginname"));
                user.setPassword(resultSet.getString("password"));
            }else {
                System.out.println("用户不存在");
                return null;
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
return user;
    }

    @Override
    public boolean isExist(String loginname) {
        String sql="SELECT id,loginname,password FROM user WHERE loginname=?";
        Connection connection=JDBCtool.getConnection();
        boolean flag=false;
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setObject(1,loginname);
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                flag=true;
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句·异常");
        }

        return flag;
    }
}
