package com.yu.springframework.factory;

/**
 * @author zhongcanyu
 * @date 2023/11/1
 */
public interface BeanFactory {

    /**
     * get Bean
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * Get Bean through constructor
     * @param beanName
     * @param args
     * @return Bean
     * @throws BeansException
     */
    Object getBean(String beanName, Object... args) throws BeansException;
}
