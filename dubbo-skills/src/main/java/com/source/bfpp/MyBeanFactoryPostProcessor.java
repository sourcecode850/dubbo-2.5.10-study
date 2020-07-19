package com.source.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @date:2020/7/19 13:34
 **/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition propStringAndRef = beanFactory.getBeanDefinition("propStringAndRef");
        propStringAndRef.getPropertyValues().addPropertyValue("munualStr", "手动注入的字符属性");
        propStringAndRef.getPropertyValues().addPropertyValue("manualRef", new RuntimeBeanReference("myRuntimeRefManual"));
    }

}
