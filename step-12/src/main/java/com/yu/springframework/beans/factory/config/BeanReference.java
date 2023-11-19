package com.yu.springframework.beans.factory.config;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
@AllArgsConstructor
@Data
public class BeanReference {

    private final String beanName;
}
