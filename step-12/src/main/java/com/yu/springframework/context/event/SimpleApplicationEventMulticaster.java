package com.yu.springframework.context.event;

import com.yu.springframework.context.ApplicationEvent;
import com.yu.springframework.context.ApplicationListener;

public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener applicationListener : getApplicationListeners(event)) {
            applicationListener.onApplicationEvent(event);
        }
    }
}
