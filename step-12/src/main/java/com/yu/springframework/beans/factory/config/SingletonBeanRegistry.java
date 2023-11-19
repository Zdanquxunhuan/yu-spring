package com.yu.springframework.beans.factory.config;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
