package bookachive;

import adminachive.Updatesome;
import bean.Book;
import bean.User;
import dao.impl.BookDaolmpl;
import dao.impl.UserDaoImpl;
import ui.Adminlogin_menu;
import ui.Userlogin_menu;
import ui.userlogin;
import util.scanertool;

public class deletebook {
//    public static Book isexist(Book book){
//        BookDaolmpl bookDaolmpl=new BookDaolmpl();
//        if(bookDaolmpl.secectByid(book.getId())!=null){
//            return book;
//        }
//        else {
//            System.out.println("书籍为空");
//        }
//        return null;
//    }
    public static void main() {
    int m=0;
        System.out.println("请输入要删除的书籍的id");
        m= scanertool.getnumberinput();
        System.out.println(m);
        BookDaolmpl bookDaolmpl=new BookDaolmpl();
       if(bookDaolmpl.secectByid(m)!=null)
       {
            bookDaolmpl.delete(m);
           System.out.println("是否继续0/1");
           int l=0;
           l=scanertool.getnumberinput();
           if(l!=0){

               Adminlogin_menu.menu();
           }
        }
        else {
            System.out.println("书籍为空，请重新输入");
            deletebook.main();
        }

    }
}