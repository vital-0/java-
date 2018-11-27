package service;

import dao.IUserDao;
import dao.UserDao;

public class UserService {
    public boolean loginUser(String userName,String password) {
    	boolean flag = false;
    	IUserDao userDao = new UserDao();
    	flag = userDao.loginUser(userName, password);
    	return flag;
    }
    
    public static void main(String[] args) {
    	UserService userService = new UserService();
    	userService.loginUser("aaa", "123321");
    }
}
