package com.yu.springframework;

import com.yu.springframework.bean.UserDao;
import com.yu.springframework.bean.UserService;
import com.yu.springframework.factory.PropertyValue;
import com.yu.springframework.factory.PropertyValues;
import com.yu.springframework.factory.config.BeanDefinition;
import com.yu.springframework.factory.config.BeanReference;
import com.yu.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author zhongcanyu
 * @date 2023/11/2
 */
public class Step04Test {

    @Test
    public void test_beanFactory(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId","10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        UserService userService= (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
