package com.example.webfrontservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WebFrontServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFrontServiceApplication.class, args);
    }

}
