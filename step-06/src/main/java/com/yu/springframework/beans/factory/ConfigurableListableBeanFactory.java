package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.config.AutowireCapableBeanFactory;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 *
 * @author zhongcanyu
 * @date 2023/11/8
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory ,ConfigurableBeanFactory{

    /**
     * get BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * Ensure that all non-lazy-init singletons are instantiated, also considering FactoryBeans.
     * Typically invoked at the end of factory setup, if desired
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;
}
