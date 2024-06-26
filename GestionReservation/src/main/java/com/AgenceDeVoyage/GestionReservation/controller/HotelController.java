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

import com.AgenceDeVoyage.GestionReservation.entities.Hotel;
import com.AgenceDeVoyage.GestionReservation.service.HotelServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	HotelServiceImpl hotelService;
	
	// http://localhost:8761/Hotel/retrieve-all-Hotels
		@GetMapping("/retrieve-all-Hotels")
	    @ResponseBody
		public List<Hotel> getHotels() {
			List<Hotel> listHotels = hotelService.retrieveAllHotels();
			return listHotels ;
		}
		
		// http://localhost:8761/Hotel/retrieve-Hotel/8
		@GetMapping("/retrieve-Hotel/{Hotel-id}")
		@ResponseBody
		public Hotel retrieveHotel(@PathVariable("Hotel-id") Long idHotel) {
		return hotelService.retrieveHotel(idHotel);
		}
		
		// http://localhost:8761/Hotel/add-Hotel

		@PostMapping("/add-Hotel")
		@ResponseBody
		public Hotel addHotel(@RequestBody Hotel p)
		{
			Hotel Hotel = hotelService.addHotel(p);
		return Hotel;
		}
		
		// http://localhost:8761/Hotel/remove-Hotel/{Hotel-id}
		@DeleteMapping("/remove-Hotel/{idHotel}")
		@ResponseBody
		public void removeHotel(@PathVariable("idHotel") Long idHotel) {
			hotelService.deleteHotel(idHotel);
		}
		
		// http://localhost:8761/Hotel/modify-Hotel
		@PutMapping("/modify-Hotel")
		@ResponseBody
		public Hotel modifyHotel(@RequestBody Hotel Hotel) {
			return hotelService.updateHotel(Hotel);
		}
}
