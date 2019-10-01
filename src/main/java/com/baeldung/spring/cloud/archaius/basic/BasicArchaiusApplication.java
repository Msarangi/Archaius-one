package com.baeldung.spring.cloud.archaius.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class BasicArchaiusApplication extends SpringBootServletInitializer{

    @Override
    public static void main(String[] args) {
        SpringApplication.run(BasicArchaiusApplication.class, args);
    }
}
