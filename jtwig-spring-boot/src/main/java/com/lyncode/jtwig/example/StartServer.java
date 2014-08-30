package com.lyncode.jtwig.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class StartServer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartServer.class, args);
    }
}
