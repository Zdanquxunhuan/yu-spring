package com.yu.springframework.beans.factory;

/**
 * @author zhongcanyu
 * @date 2023/11/14
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
