package bookachive;

import bean.Book;
import bean.User;
import dao.impl.BookDaolmpl;
import dao.impl.UserDaoImpl;

import java.util.ArrayList;

public class selectallbook {
    public static void main() {
        ArrayList<Book> Booklist=new ArrayList<>();
        BookDaolmpl bookDaolmpl=new BookDaolmpl();
        Booklist= (ArrayList<Book>) bookDaolmpl.selectAll();
        System.out.println("id\t\tname\t\tuser\t\tnumber");
        for(int i=0;i<Booklist.size();i++){

            System.out.print(Booklist.get(i).getId());
            System.out.print("\t\t");
            System.out.print(Booklist.get(i).getName());
            System.out.print("\t\t");
            System.out.println(Booklist.get(i).getUser());
            System.out.print("\t\t");
            System.out.print(Booklist.get(i).getNumber());
            System.out.print("\t\t");
            System.out.println("-------------------------------");
        }
    }
}
