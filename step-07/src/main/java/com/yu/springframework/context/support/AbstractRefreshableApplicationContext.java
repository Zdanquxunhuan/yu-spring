package com.yu.springframework.context.support;

import com.yu.springframework.beans.BeansException;

/**
 * Base class for {@link com.yu.springframework.context.ApplicationContext}
 * implementations which are supposed to support multiple calls to {@link #refresh()},
 * creating a new internal bean factory instance every time.
 * Typically (but not necessarily), such a context will be driven by
 * a set of config locations to load bean definitions from.
 *
 * @author zhongcanyu
 * @date 2023/11/13
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    @Override
    protected void refreshBeanFactory() throws BeansException {

    }
}
