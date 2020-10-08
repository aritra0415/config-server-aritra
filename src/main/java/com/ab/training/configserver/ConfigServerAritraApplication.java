package com.ab.training.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerAritraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAritraApplication.class, args);
	}

}
