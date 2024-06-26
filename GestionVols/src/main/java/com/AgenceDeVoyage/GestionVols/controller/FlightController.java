package com.AgenceDeVoyage.GestionVols.controller;

import com.AgenceDeVoyage.GestionVols.entity.Flight;
import com.AgenceDeVoyage.GestionVols.service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightServiceImpl flightService;

    @PostMapping("/add-flight")
    public Flight AddFlight(@RequestBody Flight flight) {
        return flightService.AddFlight(flight);
    }

    @PostMapping("/update-flight")
    public Flight UpdateFlight(@RequestBody Flight flight) {
        return flightService.updateFlight(flight);
    }
    @DeleteMapping("/remove-flight/{identifier}")
    public void removeFlight(@PathVariable("identifier") Long identifier) {
        flightService.deleteFlight(identifier);
    }
    @GetMapping("/get-flight/{identifier}")
    public Flight getFlight(@PathVariable("identifier") Long identifier) {
        return flightService.getFlightById(identifier);
    }
    @GetMapping("/get-all")
    public List<Flight> getClients() {
        return flightService.GetAllFlights();
    }

}
