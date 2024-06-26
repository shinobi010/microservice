package com.AgenceDeVoyage.GestionReservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgenceDeVoyage.GestionReservation.entities.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
