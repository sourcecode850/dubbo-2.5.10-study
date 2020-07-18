package com.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @date:2020/6/7 19:12
 **/
public class ServerStrap {

    public static void main(String[] args) throws IOException {
        System.out.println("-----------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server.xml");

        System.out.println("服务注册成功..");
        System.in.read();

    }

}
