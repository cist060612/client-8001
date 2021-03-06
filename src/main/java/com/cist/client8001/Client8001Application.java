package com.cist.client8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Client8001Application.class, args);
        System.out.println(1);
        System.out.println(2);

    }
}
