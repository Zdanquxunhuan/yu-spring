package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public interface BeanDefinitionRegistry {

    /**
     * Register a BeanDefinition in the registry
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) ;
}
