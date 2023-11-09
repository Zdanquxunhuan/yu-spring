package com.yu.springframework.test.config;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.PropertyValue;
import com.yu.springframework.beans.PropertyValues;
import com.yu.springframework.beans.factory.BeanDefinition;
import com.yu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.yu.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：爱婴岛"));
    }

}
