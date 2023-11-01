package com.yu.step02;

import com.yu.springframework.beans.factory.BeanFactory;
import com.yu.springframework.beans.factory.config.BeanDefinition;
import com.yu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yu.step02.bean.Student;
import com.yu.step02.bean.UserService;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {

        // 1.Initialize BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2.register bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.Get the bean for the first time
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

    @Test
    public void testInstance() throws Exception {

        Constructor<Student> constructor = Student.class.getConstructor(String.class);
        System.out.println(constructor.newInstance("yuge"));
    }
}
