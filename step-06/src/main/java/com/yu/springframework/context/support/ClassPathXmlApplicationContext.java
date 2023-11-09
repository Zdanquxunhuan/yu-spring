package com.yu.springframework.context.support;

import com.yu.springframework.beans.BeansException;

/**
 * Standalone XML application context, taking the context definition files
 * from the class path, interpreting plain paths as class path resource names
 * that include the package path (e.g. "mypackage/myresource.txt"). Useful for
 * test harnesses as well as for application contexts embedded within JARs.
 *
 * @author zhongcanyu
 * @date 2023/11/8
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }

    /**
     * Load the BeanDefinition from the XML and refresh the context
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    /**
     * Load the BeanDefinition from the XML and refresh the context
     *
     * @param configLocation
     */
    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[]{configLocation});
    }


}
