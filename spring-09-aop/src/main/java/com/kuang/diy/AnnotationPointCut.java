package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：注解方式实现AOP
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("==========方法执行前============");
    }
    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("==========方法执行后============");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取,处理切入的点
    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        //执行前
        System.out.println("==========环绕前============");
        //获取签名
        Signature signature = jp.getSignature();
        System.out.println("获取签名signature:" + signature);

        //真正执行方法
        Object proceed = jp.proceed();
        System.out.println("真正执行方法:"+proceed);
        //执行后
        System.out.println("==========环绕后============");
    }
}
