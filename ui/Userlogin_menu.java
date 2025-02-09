package ui;

import adminachive.deletesomeone;
import bookachive.deletebook;
import bookachive.insertbook;
import util.scanertool;

import util.*;
import bookachive.*;
import adminachive.*;
public class Userlogin_menu {

    public static void menu(String s) {
        System.out.println("------用户界面--------");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.返回上一级");
        System.out.println("------------------");
        int m = 0;
        m = scanertool.getnumberinput();
        switch (m) {
            case 1:
                selectbook.main();
                break;
            case 2:
                borrowbook.main(s);
                break;
            case 3:
                returnbook.main(s);
                break;
            case 4:
                selectallbook.main();break;
            case 0:
                starmenu.menu();
                break;
            default:
                System.out.println("输入错误请重新选择");
                Userlogin_menu.menu(s);
                break;
        }
    }

}