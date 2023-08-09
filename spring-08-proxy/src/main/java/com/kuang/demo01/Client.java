package com.kuang.demo01;

public class Client {
    public static void main(String[] args) {
        //房东传给代理,执行代理的方法
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
