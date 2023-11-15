package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.DisposableBean;
import com.yu.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhongcanyu
 * @date 2023/11/13
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> stringObjectMap = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeanMap = new HashMap<>();

    @Override
    public void registerSingleton(String beanName, Object sinletonObject) {
        stringObjectMap.put(beanName, sinletonObject);
    }

    public void registerDisposableBean(String beanName, DisposableBean disposableBean) {
        disposableBeanMap.put(beanName, disposableBean);
    }

    @Override
    public Object getSingleton(String beanName) {
        return stringObjectMap.get(beanName);
    }

    @Override
    public void destroySingleton() {
        Set<String> ketSet = this.disposableBeanMap.keySet();
        Object[] disposableBeanNames = ketSet.toArray();

        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object disposableBeanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeanMap.remove(disposableBeanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + disposableBeanName + "' threw an exception", e);
            }
        }
    }
}
