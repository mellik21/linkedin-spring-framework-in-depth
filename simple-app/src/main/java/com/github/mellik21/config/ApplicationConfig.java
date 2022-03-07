package com.github.mellik21.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "application.properties")
@ComponentScan(basePackages = "com.github.mellik21")
public class ApplicationConfig {

}
