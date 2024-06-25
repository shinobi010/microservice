package com.AgenceDeVoyage.GestionVols.service;

import com.AgenceDeVoyage.GestionVols.entity.Flight;
import com.AgenceDeVoyage.GestionVols.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightServiceInterface {

    @Autowired
    FlightRepository flightRepository;
    @Override
    public Flight AddFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight getFlightById(Long identifier) {
        return flightRepository.findById(identifier).get();
    }

    @Override
    public List<Flight> GetAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long identifier) {
        flightRepository.deleteById(identifier);
    }
}
