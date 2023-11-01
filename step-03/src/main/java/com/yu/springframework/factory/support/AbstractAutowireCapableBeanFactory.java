package com.yu.springframework.factory.support;

import com.yu.springframework.factory.config.BeanDefinition;

/**
 * @author zhongcanyu
 * @date 2023/11/1
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        return null;
    }
}
