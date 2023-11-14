package com.yu.springframework.beans.factory.config;

/**
 * @author zhongcanyu
 * @date 2023/11/14
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
