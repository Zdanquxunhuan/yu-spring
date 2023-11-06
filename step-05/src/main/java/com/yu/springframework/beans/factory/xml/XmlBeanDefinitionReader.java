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

    @Override
    public void loadBeanDefinitions(Resource resource) throws BeansException {
        try(InputStream inputStream=resource.getInputStream()){
            doLoadBeanDefinitions(inputStream);
        }catch (Exception e){
            throw new BeansException("IOException parsing XML document from " + resource, e);
        }
    }

    @Override
    public void loadBeanDefinitions(Resource... resources) throws BeansException {
        for (Resource resource : resources) {
            loadBeanDefinitions(resource);
        }
    }

    @Override
    public void loadBeanDefinitions(String location) throws BeansException {
        Resource resource = getResourceLoader().getResource(location);
        loadBeanDefinitions(resource);
    }

    private void doLoadBeanDefinitions(InputStream inputStream) {


    }
}
