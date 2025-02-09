package bookachive;

import adminachive.getsomeone;
import bean.Book;
import bean.User;
import dao.impl.BookDaolmpl;
import dao.impl.UserDaoImpl;
import ui.Userlogin_menu;
import ui.userlogin;
import util.scanertool;

public class selectbook {
    public static void main() {
        BookDaolmpl bookDaolmpl=new BookDaolmpl();
        System.out.println("请输入id");
        int m = 0;
        m = scanertool.getnumberinput();
        Book book=new Book();
        book =bookDaolmpl.secectByid(m);

        if (book!= null) {
            System.out.println("id\t\tname\t\tuser\t");
            System.out.print(book.getId());
            System.out.print("\t");
            System.out.print(book.getName());
            System.out.print("\t\t");
            System.out.println(book.getUser());
            System.out.println("是否继续0/1");
            int l=scanertool.getnumberinput();
            if(l!=0){
                Userlogin_menu.menu(userlogin.getLoggedInUsers().getLoginname());
            }
        }
        else {
            System.out.println("id有误/书本为空，请重新输入");
            getsomeone.main();
        }
}}
