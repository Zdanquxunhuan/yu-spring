package com.yu.springframework.factory.support;

import com.yu.springframework.exception.BeansException;
import com.yu.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class SimpleInstantiationStrategy implements InstantiationStrategy {


    @Override
    public Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor constructor, Object[] args) {

        Class beanClass = beanDefinition.getBeanClass();
        try {
            if (constructor != null) {
                return beanClass.getConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                //调用默认构造函数来实例化对象，如果类没有默认构造函数或者默认构造函数不可访问，则会抛出 InstantiationException 异常
                return beanClass.newInstance();
            }
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
