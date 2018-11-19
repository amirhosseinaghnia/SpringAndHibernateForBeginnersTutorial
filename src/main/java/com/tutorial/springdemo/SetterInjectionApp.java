package com.tutorial.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

    public static void main(String[] args) {

        //load configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from config file
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call bean methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close context
        context.close();

    }
}
