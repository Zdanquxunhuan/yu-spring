package com.yu.springframework.beans.factory.config;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 *
 * Singleton registry
 */
public interface SingletonBeanRegistry {

    /**
     * get Singleton
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * register Singleton
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName, Object singletonObject);
}
