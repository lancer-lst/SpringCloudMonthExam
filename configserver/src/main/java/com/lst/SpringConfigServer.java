package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config服务中心
 */
@SpringBootApplication
@EnableConfigServer
public class SpringConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServer.class,args);
    }
}
