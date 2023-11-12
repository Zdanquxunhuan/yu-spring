package com.yu.springframework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhongcanyu
 * @date 2023/11/11
 */
@AllArgsConstructor
@Data
public class PropertyValue {
    private final String name;
    private final Object value;
}
