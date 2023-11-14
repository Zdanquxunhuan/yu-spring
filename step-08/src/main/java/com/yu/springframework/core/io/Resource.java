package com.yu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhongcanyu
 * @date 2023/11/14
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
