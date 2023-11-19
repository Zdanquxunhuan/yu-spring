package com.yu.springframework.beans.factory;

/**
 * Interface to be implemented by objects used within a {@link BeanFactory}
 * which are themselves factories. If a bean implements this interface,
 * it is used as a factory for an object to expose, not directly as a bean
 * instance that will be exposed itself.
 *
 * @param <T>
 * @Author zhongcanyu
 * @Date 2023/11/19
 */
public interface FactoryBean<T> {

    /**
     * Return an instance (possibly shared or independent) of the object managed by this factory.
     *
     * @return
     * @throws Exception
     */
    T getObject() throws Exception;

    /**
     * Return the type of object that this FactoryBean creates, or null if not known in advance.
     *
     * @return
     */
    Class<T> getObjectType();

    /**
     * Is the object managed by this factory a singleton? That is, will getObject()
     * always return the same object (a reference that can be cached)
     *
     * @return
     */
    boolean isSingleton();
}
