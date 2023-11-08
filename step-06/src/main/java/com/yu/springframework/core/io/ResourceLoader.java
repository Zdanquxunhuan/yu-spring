package com.yu.springframework.core.io;

/**
 * @author zhongcanyu
 * @date 2023/11/8
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
