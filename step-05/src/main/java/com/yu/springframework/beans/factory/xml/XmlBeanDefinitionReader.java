package com.yu.springframework.beans.factory.xml;

/**
 * Bean definition reader for XML bean definitions.
 *
 * @author zhongcanyu
 * @date 2023/11/6
 */
import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import com.yu.springframework.beans.factory.support.BeanDefinitionRegistry;
import com.yu.springframework.core.io.Resource;
import com.yu.springframework.core.io.ResourceLoader;

import java.io.InputStream;

public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry){
        super(registry);
    }

    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader){
        super(registry,resourceLoader);
    }


    protected void doLoadBeanDefinitions(InputStream inputStream) throws ClassNotFoundException {

    }

    @Override
    public void loadBeanDefinitions(Resource resource) throws BeansException {

    }

    @Override
    public void loadBeanDefinitions(Resource... resources) throws BeansException {

    }

    @Override
    public void loadBeanDefinitions(String location) throws BeansException {

    }
}
