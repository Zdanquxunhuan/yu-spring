package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.PropertyValues;
import lombok.Getter;

/**
 * @author zhongcanyu
 * @date 2023/11/11
 */
@Getter
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    private String initMethodName;

    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }
}
