package com.AgenceDeVoyage.GestionVols.service;

import com.AgenceDeVoyage.GestionVols.entity.Airport;

import java.util.List;

public interface AirportServiceInterface {

    Airport AddAirport(Airport airport);
    Airport getAirportById(Long identifier);
    List<Airport> GetAllAirports();
    Airport updateAirport(Airport airport);
    void deleteAirport(Long identifier);

}
