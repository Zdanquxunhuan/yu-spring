package com.yu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.PropertyValues;
import com.yu.springframework.beans.factory.PropertyValue;
import com.yu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.yu.springframework.beans.factory.config.BeanDefinition;
import com.yu.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * Abstract bean factory superclass that implements default bean creation,
 * with the full capabilities specified by the class.
 * Implements the {@link com.yu.springframework.beans.factory.config.AutowireCapableBeanFactory}
 * interface in addition to AbstractBeanFactory's {@link #createBean} method.
 * <p>
 *
 * @Author zhongcanyu
 * @Date 2023/11/19
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {

        Object bean = null;

        try {
            //TODO resolveBeforeInstantiation 第13章代理

            bean = createBeanInstance(beanDefinition, beanName, args);

            populatePropertyValues(beanName, bean, beanDefinition);

            //Performs the Bean's initialization methods and the BeanPostProcessor's pre - and post-processing methods
            bean=initializeBean(beanName,bean,beanDefinition);

        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        return bean;
    }

    private Object initializeBean(String beanName, Object bean, BeanDefinition beanDefinition) {
        return null;
    }

    private void populatePropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {

        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }

                BeanUtil.setFieldValue(bean, beanName, value);
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values" + beanName);
        }
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }
}
