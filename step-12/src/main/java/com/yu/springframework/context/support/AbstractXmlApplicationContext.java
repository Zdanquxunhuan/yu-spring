package com.yu.springframework.context.support;

import com.yu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yu.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Convenient base class for {@link com.yu.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link com.yu.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        reader.loadBeanDefinitions(configLocations);
    }

    protected abstract String[] getConfigLocations();

}
