package com.AgenceDeVoyage.GestionVols;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GestionVolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionVolsApplication.class, args);
	}

}
