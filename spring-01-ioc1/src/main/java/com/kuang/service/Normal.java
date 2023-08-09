package com.kuang.service;
import com.kuang.Dao.UserDao;

public class Normal {
    //    private UserDao userDao= new UserDaoImpl();
//    public void getUser() {
//        userDao.getUser();
//    }
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
