package com.AgenceDeVoyage.GestionVols.service;

import com.AgenceDeVoyage.GestionVols.entity.Plane;
import com.AgenceDeVoyage.GestionVols.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneServiceInterface {

    @Autowired
    PlaneRepository planeRepository;
    @Override
    public Plane AddPlane(Plane plane) {
        return planeRepository.save(plane);
    }

    @Override
    public Plane getPlaneById(Long identifier) {
        return planeRepository.findById(identifier).get();
    }

    @Override
    public List<Plane> GetAllPlanes() {
        return planeRepository.findAll();
    }

    @Override
    public Plane updatePlane(Plane plane) {
        return planeRepository.save(plane);
    }

    @Override
    public void deletePlane(Long identifier) {
        planeRepository.deleteById(identifier);
    }
}
