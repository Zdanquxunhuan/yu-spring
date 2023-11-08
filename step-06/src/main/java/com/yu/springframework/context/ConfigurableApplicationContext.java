package com.yu.springframework.context;

import com.yu.springframework.beans.BeansException;

/**
 * SPI interface to be implemented by most if not all application contexts.
 * Provides facilities to configure an application context in addition
 * to the application context client methods in the
 * {@link com.yu.springframework.context.ApplicationContext} interface.
 *
 * @author zhongcanyu
 * @date 2023/11/8
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * refresh container
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
