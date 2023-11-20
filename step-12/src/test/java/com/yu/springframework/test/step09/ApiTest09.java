package com.yu.springframework.test.step09;

import com.yu.springframework.context.support.ClassPathXmlApplicationContext;
import com.yu.springframework.test.step09.bean.UserService;
import org.junit.Test;

/**
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public class ApiTest09 {

    @Test
    public void test_factory_bean() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring9.xml");
        applicationContext.registerShutdownHook();
        // 2. 调用代理方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
