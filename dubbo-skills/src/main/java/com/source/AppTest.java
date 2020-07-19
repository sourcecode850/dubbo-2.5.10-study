package com.source;

import com.source.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @date:2020/7/19 13:39
 **/
public class AppTest {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Object myRuntimeRefManual = applicationContext.getBean("myRuntimeRefManual");
        Object propStringAndRef = applicationContext.getBean("propStringAndRef");
        System.out.println("-------------------------");

    }

}
