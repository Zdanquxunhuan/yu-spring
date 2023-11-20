package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;

/**
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
