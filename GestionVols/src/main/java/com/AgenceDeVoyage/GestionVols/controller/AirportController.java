package com.AgenceDeVoyage.GestionVols.controller;


import com.AgenceDeVoyage.GestionVols.entity.Airport;
import com.AgenceDeVoyage.GestionVols.service.AirportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportServiceImpl airportService;

    @PostMapping("/add-airport")
    public Airport AddAirport(@RequestBody Airport airport) {
        return airportService.AddAirport(airport);
    }

    @PostMapping("/update-airport")
    public Airport UpdateAirport(@RequestBody Airport airport) {
        return airportService.updateAirport(airport);
    }
    @DeleteMapping("/remove-airport/{identifier}")
    public void removeAirport(@PathVariable("identifier") Long identifier) {
        airportService.deleteAirport(identifier);
    }
    @GetMapping("/get-airport/{identifier}")
    public Airport getAirport(@PathVariable("identifier") Long identifier) {
        return airportService.getAirportById(identifier);
    }
    @GetMapping("/get-all")
    public List<Airport> getClients() {
        return airportService.GetAllAirports();
    }

}
