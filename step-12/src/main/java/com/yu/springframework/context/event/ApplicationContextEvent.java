package com.yu.springframework.context.event;

import com.yu.springframework.context.ApplicationContext;
import com.yu.springframework.context.ApplicationEvent;

/**
 * Base class for events raised for an <code>ApplicationContext</code>.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
