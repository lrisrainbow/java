package adminachive;

import bean.User;
import dao.impl.UserDaoImpl;

import java.util.ArrayList;

public class getallUser {
    public static void main() {
        ArrayList<User> Userlist=new ArrayList<>();
        UserDaoImpl userDao=new UserDaoImpl();
       Userlist= (ArrayList<User>) userDao.selectAll();
        System.out.println("id\tloginname\tpassword\t");
       for(int i=0;i<Userlist.size();i++){

           System.out.print(Userlist.get(i).getId());
           System.out.print("\t\t");
           System.out.print(Userlist.get(i).getLoginname());
           System.out.print("\t\t");
           System.out.println(Userlist.get(i).getPassword());
           System.out.println("---------------");
       }
    }
}
