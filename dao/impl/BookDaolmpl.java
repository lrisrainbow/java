package dao.impl;

import bean.User;
import dao.BookDao;
import util.JDBCtool;
import bean.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BookDaolmpl implements BookDao {
    @Override
    public int insert(Book book) {
        String sql = "INSERT INTO books(id,name,user,number)VALUES(?,?,?,?)";
        Connection connection = JDBCtool.getConnection();
        int num = 0;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, book.getId());
            statement.setString(2, book.getName());
            statement.setString(3, book.getUser());
            statement.setInt(4,book.getNumber());
            num = statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句有误");
        }

        return num;
    }

    public int delete(int id) {
        String sql = "DELETE FROM books WHERE id=?";
        Connection connection = JDBCtool.getConnection();
        int num = 0;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            num = statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
        return num;
    }

    public Book secectByid(Integer id) {
        String sql = "SELECT id,name,user,number FROM books WHERE id=?";
        Connection connection = JDBCtool.getConnection();
        Book book =new Book();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setUser(resultSet.getString("user"));
                book.setNumber(resultSet.getInt("number"));
            }
            else {
                System.out.println("书本不存在");
                return null;
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句异常");
        }
        return book;
    }

    @Override
    public List<Book> selectAll() {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        Connection connection = JDBCtool.getConnection();

        try {

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setUser(resultSet.getString("user"));
                book.setId(resultSet.getInt("number"));
                books.add(book);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql语句有误");
        }
        return books;
    }

    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public int update(Object entity) {
        return 0;
    }
}
