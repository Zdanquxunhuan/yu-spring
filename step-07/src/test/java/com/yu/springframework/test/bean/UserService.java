package com.yu.springframework.test.bean;

import com.yu.springframework.beans.factory.DisposableBean;
import com.yu.springframework.beans.factory.InitializingBean;

public class UserService implements DisposableBean, InitializingBean {

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行：UserService.afterPropertiesSet");
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }
}
