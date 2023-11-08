package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author zhongcanyu
 * @date 2023/11/8
 */
public interface InstantiationStrategy {

    /**
     * 实例化bean
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
