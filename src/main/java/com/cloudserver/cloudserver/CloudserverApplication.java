package com.cloudserver.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudserverApplication.class, args);
	}

}
