package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;

/**
 * @author zhongcanyu
 * @date 2023/11/7
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;

    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;
}
