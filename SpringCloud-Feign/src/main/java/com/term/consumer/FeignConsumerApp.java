package com.term.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.term"})
@ComponentScan("com.term")
public class FeignConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApp.class, args);
    }
}
