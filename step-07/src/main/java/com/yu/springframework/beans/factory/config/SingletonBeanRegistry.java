package com.yu.springframework.beans.factory.config;

/**
 * @author zhongcanyu
 * @date 2023/11/11
 */
public interface SingletonBeanRegistry {

    void registerSingleton(String beanName, Object sinletonObject);

    Object getSingleton(String beanName);

    void destroySingleton();
}
