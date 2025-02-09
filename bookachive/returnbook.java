package bookachive;

import bean.Book;
import dao.impl.BookDaolmpl;
import dao.impl.UserDaoImpl;
import ui.Userlogin_menu;
import ui.starmenu;
import ui.userlogin;
import util.JDBCtool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.*;

public class returnbook {
    public static void main(String username) {
        int m = 0;
        Book book = new Book();
        System.out.println("请输入借书的id");
        m = scanertool.getnumberinput();
        BookDaolmpl bookDao = new BookDaolmpl();
        book = bookDao.secectByid(m);
        if (book != null && book.getUser().equals(username)) {
              a1(book);
              String string=book.getName();
              a2(book);
            System.out.println("是否继续0/1");
            int l = scanertool.getnumberinput();
            if (l != 0) {
                Userlogin_menu.menu(username);
            } else {
                starmenu.menu();
            }
        }
    }
    public static void a1(Book book){
        String sql = "UPDATE books SET name=?,user=?,number=? WHERE id=?";
        Connection connection = JDBCtool.getConnection();
        int num = 0;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(4, book.getId());
            statement.setString(1, book.getName());
            statement.setString(2, null);
            statement.setInt(3,book.getNumber()+1);
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
    }
    public static void a2(Book book){
        String sql = "delete brtable from brtable where bookname=? and user=?";
        Connection connection = JDBCtool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, book.getName());
            statement.setString(2, book.getUser());

            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }

    }

}
