package com.yu.springframework.test.step10;

import com.yu.springframework.context.support.ClassPathXmlApplicationContext;
import com.yu.springframework.test.step10.event.CustomEvent;
import org.junit.Test;

/**
 * @Author zhongcanyu
 * @Date 2023/11/21
 */
public class ApiTest {

    @Test
    public void test_event(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring10.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext,91842583473212381L,"你在干嘛"));
        applicationContext.registerShutdownHook();
    }

}
