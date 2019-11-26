package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * gateway网关
 */

@SpringBootApplication
@EnableEurekaClient
public class SpringGateway {
    public static void main(String[] args) {
        SpringApplication.run(SpringGateway.class,args);
    }
}
