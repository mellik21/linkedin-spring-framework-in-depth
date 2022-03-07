package com.github.mellik21.service;

public class OutputService {

    private final String name;

    private final GreetingService greetingService;
    private  final TimeService timeService;

    public OutputService(String name, GreetingService greetingService, TimeService timeService) {
        this.name = name;
        this.greetingService = greetingService;
        this.timeService = timeService;
    }

    public void generateOutput() {
        System.out.print(timeService.getTime()+" ");
        System.out.print(greetingService.getGreeting()+" ");
        System.out.println(name);
    }
}
