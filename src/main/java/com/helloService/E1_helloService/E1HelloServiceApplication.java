package com.helloService.E1_helloService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class E1HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(E1HelloServiceApplication.class, args);
	}
	
	@RequestMapping
	public String hello() {
		return "hello Service";
	}

}
