package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author zhongcanyu
 * @date 2023/11/13
 */
public interface BeanDefinitionRegistry {

    /**
     * register BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * get BeanDefinition
     * @param beanName
     * @return
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * Determine whether a BeanDefinition with the specified name is included
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     *
     */
    String[] getBeanDefinitionNames();
}
