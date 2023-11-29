package com.yu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @Author zhongcanyu
 * @Date 2023/11/25
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
