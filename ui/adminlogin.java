package ui;


import adminachive.deletesomeone;
import bean.Admain;
import bookachive.deletebook;
import bookachive.insertbook;
import util.scanertool;

import util.*;
import bookachive.*;
import adminachive.*;
public class adminlogin {
  public static void login(){
      System.out.println("------管理员登录界面--------");
      System.out.println("请输入名称");
      String string1=new String();
      string1=scanertool.getstringinput();
      System.out.println("请输入密码");
      String string2=new String();
      string2=scanertool.getstringinput();
      Admain admain=new Admain();
      if(string1.equals("admin")&&string2.equals("admin"))
      {
          Adminlogin_menu.menu();
      }
else {
          System.out.println("登录失败,请重新输入");
          adminlogin.login();
      }

  }
}
