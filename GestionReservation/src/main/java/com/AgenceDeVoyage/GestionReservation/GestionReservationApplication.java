package com.AgenceDeVoyage.GestionReservation;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.AgenceDeVoyage.GestionReservation.entities.Hotel;
import com.AgenceDeVoyage.GestionReservation.repository.HotelRepository;

@EnableEurekaServer
@SpringBootApplication
public class GestionReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionReservationApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init (HotelRepository repository) { return args -> {

		Stream.of("Mariem", "Sarra", "Mohamed").forEach (libelle -> { repository.save(new Hotel (libelle));

			});

		repository.findAll().forEach (System.out::println);
	};

	}

}
