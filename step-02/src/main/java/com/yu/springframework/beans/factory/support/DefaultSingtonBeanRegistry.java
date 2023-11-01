package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public class DefaultSingtonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String,Object> singletonObjects=new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
