package com.yu.springframework.factory.config;

/**
 * @author zhongcanyu
 * @date 2023/11/1
 */
public interface SingletonBeanRegistry {

    /**
     * get Singleton bean
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * register Singleton Object
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName, Object singletonObject);
}
