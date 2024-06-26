package com.AgenceDeVoyage.GestionReservation.service;

import java.util.List;

import com.AgenceDeVoyage.GestionReservation.entities.Hotel;


public interface HotelService {

	List<Hotel> retrieveAllHotels();

	Hotel addHotel(Hotel h);

	void deleteHotel(Long idHotel);

	Hotel updateHotel(Hotel h);

	Hotel retrieveHotel(Long idHotel);
}
