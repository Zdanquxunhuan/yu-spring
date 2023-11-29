package com.yu.springframework.aop.framework;

/**
 * Delegate interface for a configured AOP proxy, allowing for the creation
 * of actual proxy objects.
 *
 * <p>Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 *
 *
 * <p>
 *
 * @Author zhongcanyu
 * @Date 2023/11/26
 */
public interface AopProxy {

    /**
     * Create a new proxy object.
     *
     * @return
     */
    Object getProxy();

}
