package com.seeworld.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringcloudApplicationEurekaClientConsumer {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplicationEurekaClientConsumer.class, args);
	}

}
