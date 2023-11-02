package com.yu.springframework.bean;

import com.yu.springframework.factory.config.BeanDefinition;
import com.yu.springframework.factory.support.BeanDefinitionRegistry;
import com.yu.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class Step03Test {

    @Test
    public void testtest() {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(Uservice.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        Uservice uservice = (Uservice) beanFactory.getBean("userService", "yuge666");
        uservice.queryUserInfo();
    }
}
