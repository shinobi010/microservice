package com.AgenceDeVoyage.GestionReservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgenceDeVoyage.GestionReservation.entities.Hotel;
@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long>  {

}
