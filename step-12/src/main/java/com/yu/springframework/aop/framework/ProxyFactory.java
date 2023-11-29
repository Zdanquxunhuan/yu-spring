package com.yu.springframework.aop.framework;

import com.yu.springframework.aop.AdvisedSupport;

/**
 * Factory for AOP proxies for programmatic use, rather than via a bean
 * factory. This class provides a simple way of obtaining and configuring
 * AOP proxies in code.
 *
 * @Author zhongcanyu
 * @Date 2023/11/27
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy(){
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy(){
        if(advisedSupport.isProxyTargetClass())
            return new Cglib2AopProxy(advisedSupport);

        return new JdkDynamicAopProxy(advisedSupport);
    }
}
