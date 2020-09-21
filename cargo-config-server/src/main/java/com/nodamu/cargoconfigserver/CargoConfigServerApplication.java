package com.nodamu.cargoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CargoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CargoConfigServerApplication.class, args);
	}

}
