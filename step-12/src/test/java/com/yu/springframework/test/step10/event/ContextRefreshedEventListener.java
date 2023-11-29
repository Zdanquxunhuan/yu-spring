package com.yu.springframework.test.step10.event;

import com.yu.springframework.context.ApplicationListener;
import com.yu.springframework.context.event.ContextRefreshedEvent;

/**
 * @Author zhongcanyu
 * @Date 2023/11/21
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新时间" + this.getClass().getName());

    }
}
