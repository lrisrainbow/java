package adminachive;

import bean.User;
import dao.impl.UserDaoImpl;
import ui.starmenu;
import util.scanertool;

public class insertsomeone {
    public static void main() {

            User user=new User();
            UserDaoImpl userDao=new UserDaoImpl();
            int m=0;
            String string1=null;
            String string2=null;
            System.out.println("请输入id");
            m=scanertool.getnumberinput();
            user.setId(m);
        System.out.println("请输入loginname");
        string1=scanertool.getstringinput();
        user.setLoginname(string1);
        System.out.println("请输入password");
            string2=scanertool.getstringinput();
            user.setPassword(string2);
            if(user!=null) {
                userDao.insert(user);
                System.out.println("是否继续0/1");
                int l=0;
                l=scanertool.getnumberinput();
                if(l!=0){
                    starmenu.menu();
                }
            }else {
                System.out.println("user为空请重新输入");
                insertsomeone.main();
            }

    }
}
