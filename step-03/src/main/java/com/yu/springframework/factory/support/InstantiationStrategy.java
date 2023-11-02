package com.yu.springframework.factory.support;

import com.yu.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    /**
     * instantiate Bean
     * @param beanName
     * @param beanDefinition
     * @param constructor
     * @param args
     * @return
     */
    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor constructor,Object[] args);
}
