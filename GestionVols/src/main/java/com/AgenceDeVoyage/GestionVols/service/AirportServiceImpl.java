package com.AgenceDeVoyage.GestionVols.service;

import com.AgenceDeVoyage.GestionVols.entity.Airport;
import com.AgenceDeVoyage.GestionVols.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportServiceInterface {

    @Autowired
    AirportRepository airportRepository;
    @Override
    public Airport AddAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public Airport getAirportById(Long identifier) {
        return airportRepository.findById(identifier).get();
    }

    @Override
    public List<Airport> GetAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport updateAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(Long identifier) {
        airportRepository.deleteById(identifier);
    }
}
