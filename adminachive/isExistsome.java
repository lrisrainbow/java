package adminachive;

import bean.User;
import dao.impl.UserDaoImpl;
import util.scanertool;

import java.util.ArrayList;

public class isExistsome {
    public static int main() {
        ArrayList<User> Userlist=new ArrayList<>();
        UserDaoImpl userDao=new UserDaoImpl();
        String string1=null;
        System.out.println("请输入loginname");
        string1= scanertool.getstringinput();
        if(userDao.isExist(string1)){
            System.out.println("该用户存在");
        return 1;}
        else
            System.out.println("该用户不存在");
        return 0;
    }
}
