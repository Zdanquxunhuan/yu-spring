package com.yu.step02.bean;

import lombok.ToString;

/**
 * @author zhongcanyu
 * @date 2023/10/31
 */
@ToString
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
