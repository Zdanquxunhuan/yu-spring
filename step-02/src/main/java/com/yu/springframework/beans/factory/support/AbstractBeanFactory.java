package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.exception.BeansException;
import com.yu.springframework.beans.factory.BeanFactory;
import com.yu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public abstract class AbstractBeanFactory extends DefaultSingtonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);

    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
