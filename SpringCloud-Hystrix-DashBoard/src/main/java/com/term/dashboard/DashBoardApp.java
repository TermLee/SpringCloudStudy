package com.term.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication

//允许Hystrix Dashboard启动
@EnableHystrixDashboard
public class DashBoardApp {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApp.class, args);
    }
}
