package com.yu.springframework.beans.factory.config;

/**
 * @author zhongcanyu
 * @date 2023/11/14
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
