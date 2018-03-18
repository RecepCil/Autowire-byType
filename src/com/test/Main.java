package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Person person = (Person) ctx.getBean("person");
        System.out.println(person.toString());

        ((ClassPathXmlApplicationContext)ctx).close();

    }

}
