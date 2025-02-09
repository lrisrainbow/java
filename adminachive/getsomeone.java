package adminachive;

import bean.User;
import dao.impl.UserDaoImpl;
import util.scanertool;

public class getsomeone {
    public static void main() {
        User user = new User();
        UserDaoImpl userDao = new UserDaoImpl();
        int m = 0;
        System.out.println("请输入id");
        m = scanertool.getnumberinput();
        user = userDao.secectByid(m);
        if (user != null) {
            System.out.println("id\tloginname\tpassword\t");
            System.out.print(user.getId());
            System.out.print("\t");
            System.out.print(user.getLoginname());
            System.out.print("\t\t");
            System.out.println(user.getPassword());
        }
        else {
            System.out.println("id有误请重新输入");
            getsomeone.main();
        }
    }
}
