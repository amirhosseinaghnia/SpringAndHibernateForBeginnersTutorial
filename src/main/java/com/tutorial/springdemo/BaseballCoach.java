package com.tutorial.springdemo;

public class BaseballCoach implements Coach {

    //define private field for the dependency
    private FortuneService fortuneService;

    //define costructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend at least 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
