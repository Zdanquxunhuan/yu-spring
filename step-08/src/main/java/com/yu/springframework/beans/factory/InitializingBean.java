package com.yu.springframework.beans.factory;

/**
 * @author zhongcanyu
 * @date 2023/11/14
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
