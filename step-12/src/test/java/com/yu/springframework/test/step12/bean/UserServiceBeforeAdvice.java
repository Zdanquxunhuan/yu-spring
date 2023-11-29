package com.yu.springframework.test.step12.bean;

import com.yu.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author zhongcanyu
 * @Date 2023/11/27
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }

}
