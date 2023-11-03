package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;

public interface BeanFactory {

    /**
     * get Bean
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * Get Bean through constructor
     *
     * @param beanName
     * @param args
     * @return Bean
     * @throws BeansException
     */
    Object getBean(String beanName, Object... args) throws BeansException;


    <T> T getBean(String beanName, Class<T> requireType) throws BeansException;
}
