package com.yu.springframework.aop.framework.autoproxy;

import com.yu.springframework.aop.*;
import com.yu.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import com.yu.springframework.aop.framework.ProxyFactory;
import com.yu.springframework.beans.BeansException;
import com.yu.springframework.beans.factory.BeanFactory;
import com.yu.springframework.beans.factory.BeanFactoryAware;
import com.yu.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import com.yu.springframework.beans.factory.support.DefaultListableBeanFactory;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;

import java.util.Collection;

/**
 * @Author zhongcanyu
 * @Date 2023/11/27
 */
public class DefaultAdvisorAutoProxyCreator implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {

    private DefaultListableBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory= (DefaultListableBeanFactory) beanFactory;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if(isInfrastructureClass(beanClass))
            return null;

        Collection<AspectJExpressionPointcutAdvisor> advisors = beanFactory.getBeansOfType(AspectJExpressionPointcutAdvisor.class).values();

        for (AspectJExpressionPointcutAdvisor advisor : advisors) {
            ClassFilter classFilter = advisor.getPointcut().getClassFilter();
            if(!classFilter.matches(beanClass)) continue;

            AdvisedSupport advisedSupport = new AdvisedSupport();

            TargetSource targetSource=null;
            try{
                targetSource=new TargetSource(beanClass.getDeclaredConstructor().newInstance());
            }catch (Exception e){
                System.out.println("Default instantiation class exception");
                e.printStackTrace();
            }
            advisedSupport.setTargetSource(targetSource);
            advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
            advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
            advisedSupport.setProxyTargetClass(false);

            return new ProxyFactory(advisedSupport).getProxy();
        }

        return null;
    }

    private boolean isInfrastructureClass(Class<?> beanClass) {
        return Advice.class.isAssignableFrom(beanClass) || Pointcut.class.isAssignableFrom(beanClass) || Advisor.class.isAssignableFrom(beanClass);
    }
}
