package com.github.mellik21.service;

public class OutputService {

    private GreetingService greetingService;
    private TimeService timeService;

    public OutputService(GreetingService greetingService, TimeService timeService) {
        this.greetingService = greetingService;
        this.timeService = timeService;
    }

    public void generateOutput(String message) {
        System.out.print(timeService.getTime()+" ");
        System.out.print(greetingService.getGreeting()+" ");
        System.out.println(message);
    }
}
