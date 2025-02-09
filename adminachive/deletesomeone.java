package adminachive;

import bean.User;
import dao.impl.UserDaoImpl;
import ui.Adminlogin_menu;
import util.scanertool;

public class deletesomeone {
    public static User isexist(User user){
        UserDaoImpl userDao=new UserDaoImpl();
        if(userDao.secectByid(user.getId())!=null){
            return user;
        }
        else {
            System.out.println("用户为空");
        }
        return null;
    }
    public static void main() {
        User user=new User();
        int m=0;
        String string1=null;
        String string2=null;
        System.out.println("请输入要删除的用户的id");
        m= scanertool.getnumberinput();
        user.setId(m);
        if(deletesomeone.isexist(user)!=null){
            UserDaoImpl userDao=new UserDaoImpl();
            userDao.delete(user.getId());
            System.out.println("是否继续0/1");
            int l=0;
            l=scanertool.getnumberinput();
            if(l!=0){
                Adminlogin_menu.menu();
            }
        }
        else {
            System.out.println("用户为空，请重新输入");
            Updatesome.main();
        }

    }
}
