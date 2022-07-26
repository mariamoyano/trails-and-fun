package com.ironhack.outdoorplacesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class OutdoorPlacesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutdoorPlacesServiceApplication.class, args);
	}

}
