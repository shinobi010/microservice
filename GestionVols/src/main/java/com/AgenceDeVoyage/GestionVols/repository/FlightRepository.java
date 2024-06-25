package com.AgenceDeVoyage.GestionVols.repository;

import com.AgenceDeVoyage.GestionVols.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}

