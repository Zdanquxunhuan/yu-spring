package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.exception.BeansException;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;
}
