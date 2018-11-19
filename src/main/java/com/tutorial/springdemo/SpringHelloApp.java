package com.tutorial.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        //call dependency(helper) methods
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();

    }
}