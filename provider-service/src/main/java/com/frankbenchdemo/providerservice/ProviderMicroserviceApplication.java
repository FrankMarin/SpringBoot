package com.frankbenchdemo.providerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderMicroserviceApplication.class, args);
	}

}
