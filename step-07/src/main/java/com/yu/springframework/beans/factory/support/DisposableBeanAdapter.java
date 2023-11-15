package com.yu.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.DisposableBean;
import com.yu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @author zhongcanyu
 * @date 2023/11/13
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;
    private final String beanName;
    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {

        // 1. Implement the interface DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2. Annotation configuration destroy-method {The judgment is to avoid secondary execution of destruction}
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (destroyMethod == null) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
