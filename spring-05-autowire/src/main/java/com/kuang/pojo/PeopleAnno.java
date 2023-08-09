package com.kuang.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
@ToString
public class PeopleAnno {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    @Value("美宝")
    private String name;
}
