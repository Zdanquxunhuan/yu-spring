package com.yu.springframework.exception;

/**
 * @author zhongcanyu
 * @date 2023/11/1
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
