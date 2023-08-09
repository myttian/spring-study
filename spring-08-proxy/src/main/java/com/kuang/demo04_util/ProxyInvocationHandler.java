package com.kuang.demo04_util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //代理谁：被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    //生成代理类:参数1，代理的类在哪个位置； 参数2，代理的接口是哪一个； 参数3，调用InvocationHandler来处理
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    //调用代理程序的执行方法：处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
    //扩展日志功能
    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
