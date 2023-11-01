package com.yu.step02.bean;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public class UserService {

    String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }

}
