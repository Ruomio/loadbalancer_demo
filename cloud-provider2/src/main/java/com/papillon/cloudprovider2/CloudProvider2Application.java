package com.papillon.cloudprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudProvider2Application.class, args);
	}

}
