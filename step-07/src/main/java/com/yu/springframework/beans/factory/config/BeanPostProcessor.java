package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.BeansException;

/**
 * Factory hook that allows for custom modification of new bean instances,
 * e.g. checking for marker interfaces or wrapping them with proxies.
 *
 * @author zhongcanyu
 * @date 2023/11/11
 */
public interface BeanPostProcessor {

    /**
     * This method is executed before the Bean object executes the initialization method
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException;

    /**
     * This method is executed after the Bean object executes the initialization method
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException;
}
