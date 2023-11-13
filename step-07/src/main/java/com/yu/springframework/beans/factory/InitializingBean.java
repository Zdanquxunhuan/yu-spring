package com.yu.springframework.beans.factory;

/**
 * Interface to be implemented by beans that need to react once all their
 * properties have been set by a BeanFactory: for example, to perform custom
 * initialization, or merely to check that all mandatory properties have been set.
 *
 * @author zhongcanyu
 * @date 2023/11/13
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
