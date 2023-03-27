package com.gowittgroup.kyn.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KynCentralServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KynCentralServerApplication.class, args);
	}

}
