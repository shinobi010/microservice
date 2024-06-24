package com.AgenceDeVoyage.GestionDesClients;

import java.util.stream.Stream;

import com.AgenceDeVoyage.GestionDesClients.entity.Client;
import com.AgenceDeVoyage.GestionDesClients.repository.ClientRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@EnableEurekaServer
@SpringBootApplication
public class GestionDesClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesClientsApplication.class, args);
	}
	@Bean
	ApplicationRunner init (ClientRepository repository) { return args -> {

		Stream.of("Marwen", "Eya", "Melek").forEach (nomClient -> { repository.save(new Client(nomClient));

			});

		repository.findAll().forEach (System.out::println);
	};

	}
}
