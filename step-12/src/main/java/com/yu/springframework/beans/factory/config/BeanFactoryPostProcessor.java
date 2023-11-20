package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public interface BeanFactoryPostProcessor {

    /**
     * Provides a mechanism to modify BeanDefinition properties after all BeanDefinitions
     * are loaded and before the Bean object is instantiated.
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
