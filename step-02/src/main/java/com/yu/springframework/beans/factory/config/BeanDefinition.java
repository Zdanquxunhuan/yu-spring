package com.yu.springframework.beans.factory.config;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongcanyu
 * @date 2023/10/29
 *
 * Bean instantiation operations can be handled in the container
 */
@AllArgsConstructor
@Data
public class BeanDefinition {

    private Class beanClass;
}
