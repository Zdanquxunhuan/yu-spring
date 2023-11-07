package com.yu.springframework.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Uservice {
    private String name;
    private Integer age;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name + "，年龄：" + age);
    }
}
