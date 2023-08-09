package com.kuang.demo03;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //代理谁：被代理的接口
    private Rent rent;
    //现在还没有代理类,没法new
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类:参数1，代理的类在哪个位置； 参数2，代理的接口是哪一个； 参数3，调用InvocationHandler来处理
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //调用代理程序的执行方法：处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    //扩展功能
    public void seeHouse() {
        System.out.println("带房客看房");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}