package com.yu.springframework.test.step10.event;

import com.yu.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @Author zhongcanyu
 * @Date 2023/11/21
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
