package com.yu.springframework.context;

import com.yu.springframework.beans.factory.HierarchicalBeanFactory;
import com.yu.springframework.beans.factory.ListableBeanFactory;
import com.yu.springframework.core.io.ResourceLoader;

/**
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher{
}
