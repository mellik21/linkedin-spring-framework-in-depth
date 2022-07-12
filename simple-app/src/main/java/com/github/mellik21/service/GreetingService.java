package com.github.mellik21.service;

import com.github.mellik21.aspect.Loggable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class GreetingService {
    @Value("${app.greeting}")
    private String greeting;

    @Loggable
    public String getGreeting(String name) {
        return greeting + " " + name;
    }
}
