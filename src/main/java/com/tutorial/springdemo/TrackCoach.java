package com.tutorial.springdemo;

public class TrackCoach implements Coach {

    //define private field for dependency
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    //create constructor for inject dependency
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    //init method
    public void myStratupMethod() {
        System.out.println("From startupMethod: hello !!!!!!");
    }

    //init method
    public void myCleanupMethod() {
        System.out.println("From CleanupMethod: hello ?????");
    }
}
