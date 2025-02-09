package bookachive;

import adminachive.insertsomeone;
import bean.Book;
import bean.User;
import dao.impl.BookDaolmpl;
import dao.impl.UserDaoImpl;
import ui.Adminlogin_menu;
import util.scanertool;

public class insertbook {
    public static void main() {
        Book book=new Book();
        BookDaolmpl bookDaolmpl=new BookDaolmpl();
        int m=0;
        String string1=null;
        String string2=null;
        int p=0;
        System.out.println("请输入id");
        m= scanertool.getnumberinput();
        book.setId(m);
        System.out.println("请输入name");
        string1=scanertool.getstringinput();
        book.setName(string1);
        System.out.println("请输入数量");
        p=scanertool.getnumberinput();
        book.setNumber(p);
        if(book!=null) {
            bookDaolmpl.insert(book);
            System.out.println("是否继续0/1");
            int l=0;
            l=scanertool.getnumberinput();
            if(l!=0){
                Adminlogin_menu.menu();
            }

        }else {
            System.out.println("book为空请重新输入");
            insertbook.main();
        }

    }
}
