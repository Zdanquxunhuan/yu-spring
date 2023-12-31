package com.yu.springframework.factory.support;

import com.yu.springframework.factory.BeanFactory;
import com.yu.springframework.factory.BeansException;
import com.yu.springframework.factory.config.BeanDefinition;

/**
 * @author zhongcanyu
 * @date 2023/11/1
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    protected <T> T doGetBean(String beanName, Object... args) throws BeansException {

        Object bean = getSingleton(beanName);
        if (bean != null)
            return (T) bean;

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T) createBean(beanName, beanDefinition, args);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String beanName);
}
