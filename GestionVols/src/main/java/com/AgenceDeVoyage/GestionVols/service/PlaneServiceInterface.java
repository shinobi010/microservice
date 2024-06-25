package com.AgenceDeVoyage.GestionVols.service;

import com.AgenceDeVoyage.GestionVols.entity.Plane;

import java.util.List;

public interface PlaneServiceInterface {

    Plane AddPlane(Plane plane);
    Plane getPlaneById(Long identifier);
    List<Plane> GetAllPlanes();
    Plane updatePlane(Plane plane);
    void deletePlane(Long identifier);
}
