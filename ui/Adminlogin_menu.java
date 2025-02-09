package ui;
import util.*;
import bookachive.*;
import adminachive.*;
public class Adminlogin_menu {
   public static void menu(){
        System.out.println("------管理员界面--------");
        System.out.println("1.添加图书");
        System.out.println("2.删除图书");
        System.out.println("3.删除会员");
       System.out.println("4.显示所有会员");
       System.out.println("5.显示所有图书");
        System.out.println("0.返回上一级");
        System.out.println("------------------");
        int m=0;
        m=scanertool.getnumberinput();
        switch (m){
            case 1: insertbook.main();break;
            case 2:deletebook.main();break;
            case 3:deletesomeone.main();break;
            case 4:getallUser.main();break;
            case 5:selectallbook.main();break;
            case 0:starmenu.menu();break;
            default:
                System.out.println("输入错误请重新选择");
                Adminlogin_menu.menu();
                break;
        }

    }

}