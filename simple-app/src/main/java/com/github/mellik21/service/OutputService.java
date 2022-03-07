package com.github.mellik21.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OutputService {

    @Value("${app.name}")
    private String name;

    private final GreetingService greetingService;
    private  final TimeService timeService;

    public OutputService(GreetingService greetingService, TimeService timeService) {
        this.greetingService = greetingService;
        this.timeService = timeService;
    }

    public void generateOutput() {
        System.out.print(timeService.getTime()+" ");
        System.out.print(greetingService.getGreeting()+" ");
        System.out.println(name);
    }
}
