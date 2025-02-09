package dao;

import bean.Book;

public interface BookDao extends Basedao{

    int insert(Book book);
}
