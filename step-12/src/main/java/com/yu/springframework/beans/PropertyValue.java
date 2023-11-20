package com.yu.springframework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
@AllArgsConstructor
@Data
public class PropertyValue {

    private final String name;
    private final Object value;
}
