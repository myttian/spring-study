package com.kuang.demo02;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    //spring不建议用有参构造，建议用get/set注入对象
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }
    public void delete() {
        log("delete");
        userService.delete();
    }
    public void update() {
        log("update");
        userService.update();
    }
    public void query() {
        log("query");
        userService.query();
    }
    //日志方法
    private void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
