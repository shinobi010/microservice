package com.AgenceDeVoyage.GestionVols.controller;

import com.AgenceDeVoyage.GestionVols.entity.Plane;
import com.AgenceDeVoyage.GestionVols.service.PlaneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plane")
public class PlaneController {

    @Autowired
    private PlaneServiceImpl planeService;

    @PostMapping("/add-plane")
    public Plane AddPlane(@RequestBody Plane plane) {
        return planeService.AddPlane(plane);
    }

    @PostMapping("/update-plane")
    public Plane UpdatePlane(@RequestBody Plane plane) {
        return planeService.updatePlane(plane);
    }
    @DeleteMapping("/remove-plane/{identifier}")
    public void removePlane(@PathVariable("identifier") Long identifier) {
        planeService.deletePlane(identifier);
    }
    @GetMapping("/get-plane/{identifier}")
    public Plane getPlane(@PathVariable("identifier") Long identifier) {
        return planeService.getPlaneById(identifier);
    }
    @GetMapping("/get-all")
    public List<Plane> getClients() {
        return planeService.GetAllPlanes();
    }
}
