package com.AgenceDeVoyage.GestionOffre;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.AgenceDeVoyage.GestionOffre.entities.Offre;
import com.AgenceDeVoyage.GestionOffre.entities.Promotion;
import com.AgenceDeVoyage.GestionOffre.repositories.OffreRepository;
import com.AgenceDeVoyage.GestionOffre.repositories.PromotionRepository;
@EnableEurekaServer
@SpringBootApplication
public class GestionOffreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionOffreApplication.class, args);
		
	}
	
	@Bean
	ApplicationRunner init (OffreRepository repository) { return args -> {

		Stream.of("Soft", "Inclusive", "DemiPension").forEach (code -> { repository.save(new Offre(code));

			});

		repository.findAll().forEach (System.out::println);
	};

	}
}
