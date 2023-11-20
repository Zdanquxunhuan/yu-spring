package com.yu.springframework.context.support;

import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.yu.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.yu.springframework.beans.factory.config.BeanPostProcessor;
import com.yu.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.yu.springframework.context.ApplicationEvent;
import com.yu.springframework.context.ApplicationListener;
import com.yu.springframework.context.ConfigurableApplicationContext;
import com.yu.springframework.context.event.ApplicationEventMulticaster;
import com.yu.springframework.context.event.ContextClosedEvent;
import com.yu.springframework.context.event.ContextRefreshedEvent;
import com.yu.springframework.context.event.SimpleApplicationEventMulticaster;
import com.yu.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * Abstract implementation of the {@link com.yu.springframework.context.ApplicationContext}
 * interface. Doesn't mandate the type of storage used for configuration; simply
 * implements common context functionality. Uses the Template Method design pattern,
 * requiring concrete subclasses to implement abstract methods.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    private ApplicationEventMulticaster applicationEventMulticaster;

    public static final String APPLICATION_EVENT_MULTICASTER_BEAN_NAME = "applicationEventMulticaster";

    @Override
    public void refresh() throws BeansException {

        createBeanFactoryAndLoadBeanDefinition();

        ConfigurableListableBeanFactory beanFactory = getBeanFactory();

        //Add ApplicationContextAwareProcessor so that Bean objects inherited from ApplicationContextAware
        //can be aware of the ApplicationContext they belong to.
        beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));

        // 3.Invoke factory processors registered as beans in the context before beans are instantiated
        invokeBeanFactoryPostProcessors(beanFactory);

        //4.Instantiate and register all BeanPostProcessor beans, respecting explicit order if given.
        //  Must be called before any instantiation of application beans.
        registerBeanPostProcessors(beanFactory);

        initApplicationEventMulticaster();

        registerListeners();

        // 5.Instantiate singleton Bean objects in advance
        beanFactory.preInstantiateSingletons();

        //Publish container refresh completion event
        finishRefresh();
    }

    private void finishRefresh() {
        publishEvent(new ContextRefreshedEvent(this));
    }

    @Override
    public void publishEvent(ApplicationEvent event) {
        applicationEventMulticaster.multicastEvent(event);
    }

    private void registerListeners() {
        Map<String, ApplicationListener> listenersMap = getBeansOfType(ApplicationListener.class);
        for (ApplicationListener listener : listenersMap.values()) {
            applicationEventMulticaster.addApplicationListener(listener);
        }
    }

    private void initApplicationEventMulticaster() {
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        applicationEventMulticaster = new SimpleApplicationEventMulticaster(beanFactory);
        beanFactory.registerSingleton(APPLICATION_EVENT_MULTICASTER_BEAN_NAME, applicationEventMulticaster);
    }

    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryBeansOfType = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryBeansOfType.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }

    }

    /**
     * get BeanFactory
     *
     * @return
     * @throws BeansException
     */
    protected abstract ConfigurableListableBeanFactory getBeanFactory() throws BeansException;


    /**
     * Create BeanFactory and load BeanDefinition
     *
     * @throws BeansException
     */
    protected abstract void createBeanFactoryAndLoadBeanDefinition() throws BeansException;

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return getBeanFactory().getBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }

    @Override
    public void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::close));
    }

    @Override
    public void close() {

        publishEvent(new ContextClosedEvent(this));

        getBeanFactory().destroySingletons();
    }
}
