package com.yu.springframework.aop;

import lombok.Data;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * Base class for AOP proxy configuration managers.
 * These are not themselves AOP proxies, but subclasses of this class are
 * normally factories from which AOP proxy instances are obtained directly.
 * <p>
 *
 * @Author zhongcanyu
 * @Date 2023/11/26
 */
@Data
public class AdvisedSupport {

    /**
     * ProxyConfig
     */
    private boolean proxyTargetClass = false;

    /**
     * the proxied target object
     */
    private TargetSource targetSource;

    /**
     * method Interceptor
     */
    private MethodInterceptor methodInterceptor;

    /**
     * Method matcher (checks whether the target method meets the notification conditions)
     */
    private MethodMatcher methodMatcher;

    public boolean isProxyTargetClass() {
        return proxyTargetClass;
    }
}
