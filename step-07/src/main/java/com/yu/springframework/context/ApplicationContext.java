package com.yu.springframework.context;

import com.yu.springframework.beans.factory.ListableBeanFactory;

/**
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 *
 * @author zhongcanyu
 * @date 2023/11/12
 */
public interface ApplicationContext extends ListableBeanFactory {
}
