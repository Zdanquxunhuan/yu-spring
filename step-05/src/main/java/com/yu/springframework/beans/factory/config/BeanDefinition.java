package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.PropertyValues;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;
}
