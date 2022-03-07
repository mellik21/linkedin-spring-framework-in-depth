package com.github.mellik21.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
@NoArgsConstructor
public class GreetingService {
    @Value("${app.greeting}")
    private String greeting;

}
