package com.yu.springframework.beans.factory.support;

import com.yu.springframework.beans.factory.config.BeanDefinition;
import com.yu.springframework.core.io.DefaultResourceLoader;
import com.yu.springframework.core.io.ResourceLoader;

/**
 * @author zhongcanyu
 * @date 2023/11/6
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
