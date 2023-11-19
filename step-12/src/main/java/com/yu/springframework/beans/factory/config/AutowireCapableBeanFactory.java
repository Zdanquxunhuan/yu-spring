package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.BeanFactory;

/**
 * @Author zhongcanyu
 * @Date 2023/11/19
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * Apply BeanPostProcessors to the given existing bean instance,
     * invoking their postProcessBeforeInitialization methods.
     * The returned bean instance may be a wrapper around the original.
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * Apply BeanPostProcessors to the given existing bean instance,
     * invoking their postProcessAfterInitialization methods.
     * The returned bean instance may be a wrapper around the original.
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
