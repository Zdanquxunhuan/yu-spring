package com.yu.springframework.test.step10.event;

import com.yu.springframework.context.ApplicationListener;
import com.yu.springframework.context.event.ContextClosedEvent;

/**
 * @Author zhongcanyu
 * @Date 2023/11/21
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件" + this.getClass().getName());
    }
}
