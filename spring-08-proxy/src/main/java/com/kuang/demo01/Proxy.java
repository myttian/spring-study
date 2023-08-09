package com.kuang.demo01;

//代理角色
public class Proxy implements Rent{
    //帮房东出租房子,先把房东拿过来
    private Host host;

    public Proxy() {
    }
    //代理类有参构造： 创建对象时，把房东拿过来
    public Proxy(Host host) {
        this.host=host;
    }

    @Override
    public void rent() {
        //传进来哪个房东，就调哪个房东租房
        host.rent();
    }
}
