package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETO = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    /**
     * Add a new BeanPostProcessor that will get applied to beans created by this factory.
     * To be invoked during factory configuration.
     *
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * Destroy all singleton beans in this factory, including inner beans that have been registered as disposable.
     * To be called on shutdown of a factory.
     */
    void destroySingletons();
}
