package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于在xml里写一个bean,<bean id="user" class="com.kuang.pojo.User"/>
@Component
@Scope("singleton")
public class User {
    @Value("秦疆")
    public String name ;
}
