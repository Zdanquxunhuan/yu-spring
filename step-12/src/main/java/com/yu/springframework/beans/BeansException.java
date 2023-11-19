package com.yu.springframework.beans;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}

