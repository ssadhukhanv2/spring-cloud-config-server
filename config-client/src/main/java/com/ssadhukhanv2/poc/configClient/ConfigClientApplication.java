package com.ssadhukhanv2.poc.configClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
		System.out.println("View the Config Properties in: http://localhost:8080/actuator/configprops/");
		System.out.println("Limits(Client) URL: http://localhost:8080/limits-from-prop");
	}

}
