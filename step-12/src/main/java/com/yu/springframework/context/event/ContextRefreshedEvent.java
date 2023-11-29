package com.yu.springframework.context.event;

/**
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 *
 * @Author zhongcanyu
 * @Date 2023/11/20
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}