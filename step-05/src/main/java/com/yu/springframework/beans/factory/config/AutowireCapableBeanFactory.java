package com.yu.springframework.beans.factory.config;

import com.yu.springframework.beans.factory.BeanFactory;

/**
 * Extension of the {@link com.yu.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
