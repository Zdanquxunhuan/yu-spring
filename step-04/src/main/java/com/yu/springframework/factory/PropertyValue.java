package com.yu.springframework.factory;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongcanyu
 * @date 2023/11/2
 */
@Data
@AllArgsConstructor
public class PropertyValue {
    private final String name;
    private final Object value;
}
