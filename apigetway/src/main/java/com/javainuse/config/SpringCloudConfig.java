package com.javainuse.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/client/**")
                        .uri("lb://gestionclient-service")
                        .id("marwen"))
                .route(r -> r.path("/airport/**")
                        .uri("lb://GestionVols")
                        .id("oumaima"))
                .route(r -> r.path("/plane/**")
                        .uri("lb://GestionVols")
                        .id("oumaima"))
                .route(r -> r.path("/flight/**")
                        .uri("lb://GestionVols")
                        .id("oumaima"))

                .route(r -> r.path("/offre/**")
                        .uri("lb://offre-service")
                        .id("melek"))
                .route(r -> r.path("/promotion/**")
                        .uri("lb://offre-service")
                        .id("melek"))
                .route(r -> r.path("/hotel/**")
                        .uri("lb://reservation-service")
                        .id("eya"))
                .route(r -> r.path("/reservation/**")
                        .uri("lb://reservation-service")
                        .id("eya"))
                .route(r -> r.path("/Voiture/**")
                        .uri("lb://gestionVoitures")
                        .id("hadhemi"))
                .route(r -> r.path("/partenaires/**")
                        .uri("lb://NodeAPI-Partenaire")
                        .id("ghassen"))
                .build();
    }

}