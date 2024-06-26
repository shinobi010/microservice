package com.AgenceDeVoyage.GestionVols.repository;

import com.AgenceDeVoyage.GestionVols.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {

}

