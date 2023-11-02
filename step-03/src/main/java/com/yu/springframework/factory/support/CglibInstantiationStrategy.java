package com.yu.springframework.factory.support;

import com.yu.springframework.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

public class CglibInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor constructor, Object[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if(null==constructor)
            return enhancer.create();
        return enhancer.create(constructor.getParameterTypes(),args);
    }
}
