package com.AgenceDeVoyage.GestionReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgenceDeVoyage.GestionReservation.entities.Hotel;
import com.AgenceDeVoyage.GestionReservation.repository.HotelRepository;


@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelRepository ;
	
	@Override
	public List<Hotel> retrieveAllHotels() {
		return (List<Hotel>) hotelRepository.findAll();
	}

	@Override
	public Hotel addHotel(Hotel r) {
		return hotelRepository.save(r);
	}

	@Override
	public void deleteHotel(Long idHotel) {
		hotelRepository.deleteById(idHotel);
	}

	@Override
	public Hotel updateHotel(Hotel r) {
		return hotelRepository.save(r);
	}

	@Override
	public Hotel retrieveHotel(Long idHotel) {
		return hotelRepository.findById(idHotel).get();
	}
	
}
