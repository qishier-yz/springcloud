package com.gateway.xianliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayXianliuApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayXianliuApplication.class, args);
	}

}
