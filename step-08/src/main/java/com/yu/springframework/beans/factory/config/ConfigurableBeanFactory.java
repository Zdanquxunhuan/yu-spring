package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author zhongcanyu
 * @date 2023/11/14
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
