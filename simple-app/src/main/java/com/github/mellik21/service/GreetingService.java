package com.github.mellik21.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GreetingService {
    private String greeting;

    public GreetingService(String greeting){
        this.greeting=greeting;
    }
}
