package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
