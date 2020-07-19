package com.source.prop;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @date:2020/7/19 13:32
 **/
@Data
@Service("propStringAndRef")
public class PropStringAndRef {

    /**
     * 需要有setter才行
     */
    private String munualStr;

    // @Autowired
    /**
     * populateBean时候，负责解析
     * AbstractAutowireCapableBeanFactory#applyPropertyValues(String, BeanDefinition, BeanWrapper, PropertyValues)
     * org.springframework.beans.factory.support.BeanDefinitionValueResolver#resolveValueIfNecessary
     * (java.lang.Object, java.lang.Object) 自行解析
     */
    private MyRuntimeRefManual manualRef;

}
