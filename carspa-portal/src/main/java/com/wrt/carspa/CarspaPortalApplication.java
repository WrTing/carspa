package com.wrt.carspa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wrt.carspa")
public class CarspaPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarspaPortalApplication.class, args);
    }

}