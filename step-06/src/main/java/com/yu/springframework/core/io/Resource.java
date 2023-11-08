package com.yu.springframework.core.io;

import com.yu.springframework.beans.BeansException;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhongcanyu
 * @date 2023/11/8
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
