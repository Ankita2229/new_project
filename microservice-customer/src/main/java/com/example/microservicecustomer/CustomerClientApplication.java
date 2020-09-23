package com.example.microservicecustomer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerClientApplication.class, args);
	}

}
