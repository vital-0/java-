package dao;
import dao.IUserDao;

public class UserDao implements IUserDao{
    public boolean loginUser(String userName, String password) {
    	System.out.println("通过jdbc的登陆验证");
    	return true;
    }
}
