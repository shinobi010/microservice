package com.AgenceDeVoyage.GestionReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgenceDeVoyage.GestionReservation.entities.Reservation;
import com.AgenceDeVoyage.GestionReservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationRepository reservationRepository ;

	@Override
	public List<Reservation> retrieveAllReservations() {
		return (List<Reservation>) reservationRepository.findAll();
	}

	@Override
	public Reservation addReservation(Reservation r) {
		return reservationRepository.save(r);
	}

	@Override
	public void deleteReservation(Long idReservation) {
		reservationRepository.deleteById(idReservation);
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		return reservationRepository.save(r);
	}

	@Override
	public Reservation retrieveReservation(Long idReservation) {
		return reservationRepository.findById(idReservation).get();
	}
	
	
}
