package com.yu.springframework.factory.config;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongcanyu
 * @date 2023/11/1
 */
@Data
@AllArgsConstructor
public class BeanDefinition {

    private Class beanClass;
}
