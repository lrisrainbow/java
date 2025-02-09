package dao;
import bean.*;
import java.util.List;

public interface Basedao <T>{
    public int insert(T entity);
    public int delete(Integer id);
    public  int update(T entity);
    public List<User> selectAll();
    public T secectByid(Integer id);
}
