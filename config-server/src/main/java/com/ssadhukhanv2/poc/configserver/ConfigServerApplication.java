package com.ssadhukhanv2.poc.configserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("http://localhost:8888/limit-service/default");
        System.out.println("Config Server URL: http://localhost:8888/limit-service/default");
        System.out.println("Config Server URL: http://localhost:8888/limit-service/qa");
        System.out.println("Config Server URL: http://localhost:8888/limit-service/dev");
    }
}
