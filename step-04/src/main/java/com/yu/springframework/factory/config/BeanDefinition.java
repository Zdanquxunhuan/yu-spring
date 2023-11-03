package com.yu.springframework.factory.config;

import com.yu.springframework.factory.PropertyValues;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongcanyu
 * @date 2023/11/2
 */
@Data
@AllArgsConstructor
public class BeanDefinition {
    private Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }
}
