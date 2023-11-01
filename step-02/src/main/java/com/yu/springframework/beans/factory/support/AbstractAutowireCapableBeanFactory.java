package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.exception.BeansException;
import com.yu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            //TODO  How to deal with objects that have constructor parameters
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        registerSingleton(beanName, bean);
        return bean;
    }
}
