package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 *
 * @author zhongcanyu
 * @date 2023/11/12
 */
public interface BeanFactoryPostProcessor {

    /**
     * Modify the application context's internal bean factory after its standard initialization.
     * All bean definitions will have been loaded, but no beans will have been instantiated yet.
     * This allows for overriding or adding properties even to eager-initializing beans.
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
