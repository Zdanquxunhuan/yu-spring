package com.yu.springframework.beans.factory;

import com.yu.springframework.beans.BeansException;

import java.util.Map;

/**
 * Extension of the {@link BeanFactory} interface to be implemented by bean factories
 * that can enumerate all their bean instances, rather than attempting bean lookup
 * by name one by one as requested by clients. BeanFactory implementations that
 * preload all their bean definitions (such as XML-based factories) may implement
 * this interface.
 *
 * @author zhongcanyu
 * @date 2023/11/11
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * get Beans of Type
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String,T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     * @return
     */
    String[] getBeanDefinitionNames();
}
