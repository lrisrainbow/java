package adminachive;

import bean.User;
import dao.impl.UserDaoImpl;
import util.scanertool;

public class Updatesome {

    public static void main() {
        User user=new User();
        int m=0;
        String string1=null;
        String string2=null;
        System.out.println("请输入要更改的用户的id");
        m=scanertool.getnumberinput();
        user.setId(m);
        System.out.println("请输入loginname");
        string1=scanertool.getstringinput();
        System.out.println("请输入password");
        string2=scanertool.getstringinput();
        user.setId(m);
        user.setLoginname(string1);
        user.setPassword(string2);
        if(user!=null){
        UserDaoImpl userDao=new UserDaoImpl();
         userDao.update(user);

        }
        else {
            System.out.println("用户为空，请重新输入");
            Updatesome.main();
        }

    }
}
