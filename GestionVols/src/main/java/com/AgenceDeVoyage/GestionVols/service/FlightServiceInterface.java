package com.AgenceDeVoyage.GestionVols.service;

import com.AgenceDeVoyage.GestionVols.entity.Flight;

import java.util.List;

public interface FlightServiceInterface {

    Flight AddFlight(Flight flight);
    Flight getFlightById(Long identifier);
    List<Flight> GetAllFlights();
    Flight updateFlight(Flight flight);
    void deleteFlight(Long identifier);

}
