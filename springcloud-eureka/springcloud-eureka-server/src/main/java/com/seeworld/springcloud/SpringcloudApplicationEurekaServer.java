package com.seeworld.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudApplicationEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplicationEurekaServer.class, args);
	}

}
