package com.kuang.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter@Setter
@ToString
public class User {
    @Value("天王星")
    private String name;
}
