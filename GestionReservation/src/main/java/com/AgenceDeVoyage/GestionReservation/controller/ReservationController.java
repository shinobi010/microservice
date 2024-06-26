package com.AgenceDeVoyage.GestionReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.AgenceDeVoyage.GestionReservation.entities.Reservation;
import com.AgenceDeVoyage.GestionReservation.entities.Reservation;
import com.AgenceDeVoyage.GestionReservation.service.ReservationServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	ReservationServiceImpl reservationService;
	
	// http://localhost:8761/Reservation/retrieve-all-Reservations
			@GetMapping("/retrieve-all-Reservations")
		    @ResponseBody
			public List<Reservation> getReservations() {
				List<Reservation> listReservations = reservationService.retrieveAllReservations();
				return listReservations ;
			}
			
			// http://localhost:8761/Reservation/retrieve-Reservation/8
			@GetMapping("/retrieve-Reservation/{Reservation-id}")
			@ResponseBody
			public Reservation retrieveReservation(@PathVariable("Reservation-id") Long idReservation) {
			return reservationService.retrieveReservation(idReservation);
			}
			
			// http://localhost:8761/Reservation/add-Reservation
			@PostMapping("/add-Reservation")
			@ResponseBody
			public Reservation addReservation(@RequestBody Reservation r)
			{
				Reservation Reservation = reservationService.addReservation(r);
			return Reservation;
			}
			
			// http://localhost:8761/Reservation/remove-Reservation/{Reservation-id}
			@DeleteMapping("/remove-Reservation/{idReservation}")
			@ResponseBody
			public void removeReservation(@PathVariable("idReservation") Long idReservation) {
				reservationService.deleteReservation(idReservation);
			}
			
			// http://localhost:8761/Reservation/modify-Reservation
			@PutMapping("/modify-Reservation")
			@ResponseBody
			public Reservation modifyReservation(@RequestBody Reservation Reservation) {
				return reservationService.updateReservation(Reservation);
			}
}
