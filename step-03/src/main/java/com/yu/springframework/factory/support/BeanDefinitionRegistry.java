package com.yu.springframework.factory.support;

import com.yu.springframework.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * registe rBeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
