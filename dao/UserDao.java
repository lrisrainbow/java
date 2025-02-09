package dao;

import bean.User;

public interface UserDao extends Basedao<User>{
    public boolean isExist(String loginname);
}
