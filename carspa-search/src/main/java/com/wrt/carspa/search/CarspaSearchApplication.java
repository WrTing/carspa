package com.wrt.carspa.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wrt.carspa")
public class CarspaSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarspaSearchApplication.class, args);
    }
}
