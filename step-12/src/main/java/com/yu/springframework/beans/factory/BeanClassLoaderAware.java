package com.yu.springframework.beans.factory;

import cn.hutool.core.bean.BeanException;

/**
 * Callback that allows a bean to be aware of the bean
 * {@link ClassLoader class loader}; that is, the class loader used by the
 * present bean factory to load bean classes.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader) throws BeanException;
}
