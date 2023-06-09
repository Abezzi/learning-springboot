package com.alex;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alex.learnspringframework.HelloWorldConfiguration;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1) Launch spring context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2) Configure the things that we want spring to manage
            // @configuration
            // @bean

            // 3) retrieve bean managed by spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBeanDefinitionCount());
        }
    }
}
