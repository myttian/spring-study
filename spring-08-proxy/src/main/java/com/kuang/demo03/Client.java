package com.kuang.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色：现在没有,要通过处理程序生成一个代理类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理我们要调用的接口对象
        //设置要代理的对象
        pih.setRent(host);
        //这里的proxy是动态生成的，我们并没有写
        //动态生成代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
