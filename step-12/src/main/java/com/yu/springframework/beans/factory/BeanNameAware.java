package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;

/**
 * Interface to be implemented by beans that want to be aware of their
 * bean name in a bean factory. Note that it is not usually recommended
 * that an object depend on its bean name, as this represents a potentially
 * brittle dependence on external configuration, as well as a possibly
 * unnecessary dependence on a Spring API.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String beanName) throws BeansException;
}
