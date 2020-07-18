package com.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description:
 * @author:niepu
 * @version:1.0
 * @date:2020/6/7 19:48
 **/
public class ConsumerStrap {


    public static void main(String[] args) throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");

        AService aService = context.getBean("aService", AService.class);
        BService bService = context.getBean("bService", BService.class);

        System.out.println(aService.sayAHello());
        System.out.println(aService.sayAHello());
        System.out.println(bService.sayBHello("bbbb111"));
        System.out.println(bService.sayBHello("bbbb222"));
        System.out.println(aService.sayAHello());
        System.out.println(aService.sayAHello());
        System.out.println(bService.sayBHello("bbbb111"));
        System.out.println(bService.sayBHello("bbbb222"));

    }

}
