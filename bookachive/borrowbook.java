package bookachive;

import bean.Book;
import dao.impl.BookDaolmpl;
import ui.Userlogin_menu;
import ui.userlogin;
import util.JDBCtool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ui.*;

import util.*;

public class borrowbook {
    public static void main(String username){
        int m=0;
        System.out.println("请输入借书的id");
        m=scanertool.getnumberinput();
        System.out.println(username+"借书");
        BookDaolmpl bookDao=new BookDaolmpl();
        Book book=bookDao.secectByid(m);
        System.out.println(book.getName());
        System.out.println("数量为"+book.getNumber());
        if(book.getNumber()>1){
            book.setUser(username);
             a1(book);
             a2(book);

        }
        System.out.println("是否继续0/1");
        int l=scanertool.getnumberinput();
        if(l!=0){
            Userlogin_menu.menu(username);
        }
        else {
            starmenu.menu();
        }
    }
    public static void a1(Book book){
        String sql="UPDATE books SET name=?,user=?,number=? where id=?";
        Connection connection=JDBCtool.getConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(4,book.getId());
            statement.setString(1,book.getName());
            statement.setString(2,book.getUser());
            statement.setInt(3,(book.getNumber()-1));
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
    }
    public static void a2(Book book){
        String sql = "INSERT INTO brtable (bookname,user,id)VALUES(?,?,?)";
        Connection connection = JDBCtool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, book.getName());

            statement.setString(2, book.getUser());
            statement.setInt(3,book.getId());
          statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句有误");
        }

    }

}
