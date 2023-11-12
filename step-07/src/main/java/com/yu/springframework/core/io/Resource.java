package com.yu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhongcanyu
 * @date 2023/11/11
 */
public interface Resource {

    /**
     * 获取Class的stream流
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}
