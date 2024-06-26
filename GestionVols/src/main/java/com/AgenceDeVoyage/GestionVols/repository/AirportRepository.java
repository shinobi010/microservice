package com.AgenceDeVoyage.GestionVols.repository;

import com.AgenceDeVoyage.GestionVols.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

}
