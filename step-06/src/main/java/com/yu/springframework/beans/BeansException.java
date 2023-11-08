package com.yu.springframework.beans;

/**
 * @author zhongcanyu
 * @date 2023/11/7
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
