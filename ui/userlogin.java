package ui;

import bean.Admain;
import bean.User;
import bookachive.borrowbook;
import bookachive.selectbook;
import dao.impl.UserDaoImpl;
import util.scanertool;

import java.util.ArrayList;
import java.util.List;

public class userlogin {
    private static User loggedInUsers = new User();
    private String string2;
    private int m;

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public static User login() {
        userlogin userlogin=new userlogin();
        System.out.println("------用户登录界面--------");
        System.out.println("请输入id");
        loggedInUsers.setId(scanertool.getnumberinput());
//       userlogin.setM( scanertool.getnumberinput());
        System.out.println("请输入密码");
        loggedInUsers.setPassword(scanertool.getstringinput());
//        userlogin.setString2( scanertool.getstringinput());
        UserDaoImpl userDao = new UserDaoImpl();
        User user=null;
//        user = userDao.secectByid(userlogin.getM());
        user=userDao.secectByid(loggedInUsers.getId());
        if (user != null) {
            Userlogin_menu.menu(user.getLoginname());
            return user;
        } else {
            System.out.println("用户为空,重新输入");
            userlogin.login();
        }

        return null;
    }


    public static User getLoggedInUsers() {
        return loggedInUsers;
    }

}

