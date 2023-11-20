package com.yu.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhongcanyu
 * @Date 2023/11/18
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList=new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue){
        propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
