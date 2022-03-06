package com.github.mellik21.config;

import com.github.mellik21.service.OutputService;
import com.github.mellik21.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.mellik21.service.GreetingService;

@Configuration
public class ApplicationConfig {

    @Value("Hello")
    private String greeting;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;


    @Bean
    public TimeService timeService() {
        return new TimeService(true);
    }

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("Hello");
    }

    @Bean
    public OutputService outputService() {
        return new OutputService(greetingService, timeService);
    }


}
