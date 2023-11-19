package com.yu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
public interface Resource {

    /**
     * Get the inputStream of class from various resources
     *
     * @return
     */
    public InputStream getInputStream() throws IOException;
}
