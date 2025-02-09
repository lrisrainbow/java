package ui;

import adminachive.deletesomeone;
import bean.User;
import bookachive.deletebook;
import bookachive.insertbook;
import util.scanertool;

import util.*;
import bookachive.*;
import adminachive.*;
public class starmenu {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public  static void menu() {
        System.out.println("------开始界面--------");
        System.out.println("1.admin登录");
        System.out.println("2.用户登录");
        System.out.println("3.用户注册");
        System.out.println("0.退出系统:");
        System.out.println("------------------");
        System.out.println(" ");
        int m=0;
m=scanertool.getnumberinput();
       starmenu starmenu=new starmenu();
        switch (m){

            case 1:
               adminlogin.login();break;
            case 2:
              starmenu.setUser(userlogin.login());break;
            case 3:
                insertsomeone.main();break;
            case 4:
                System.out.println("感谢使用");
                System.exit(0);
        }

    }


}

