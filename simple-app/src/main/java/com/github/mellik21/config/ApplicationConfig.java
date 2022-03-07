package com.github.mellik21.config;

import com.github.mellik21.service.OutputService;
import com.github.mellik21.service.TimeService;
import com.github.mellik21.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "application.properties")
public class ApplicationConfig {

    @Value("${app.greeting}")
    private String greeting;

    @Value("${app.name}")
    private String name;

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
        return new GreetingService(greeting);
    }

    @Bean
    public OutputService outputService() {
        return new OutputService(name, greetingService, timeService);
    }


}
