package com.AgenceDeVoyage.GestionReservation.service;

import java.util.List;

import com.AgenceDeVoyage.GestionReservation.entities.Reservation;

public interface ReservationService {

	List<Reservation> retrieveAllReservations();

	Reservation addReservation(Reservation r);

	void deleteReservation(Long idReservation);

	Reservation updateReservation(Reservation r);

	Reservation retrieveReservation(Long idReservation);
}
