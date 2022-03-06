package com.github.mellik21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.mellik21.config.ApplicationConfig;
import com.github.mellik21.service.OutputService;

public class Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i = 0; i < 5; i++) {
            outputService.generateOutput("Anastasia");
            Thread.sleep(5000);
        }

    }
}
