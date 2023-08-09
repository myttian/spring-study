package com.kuang.service;
import com.kuang.Dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    //利用set动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        //业务层调Dao层
        userDao.getUser();
    }
}
