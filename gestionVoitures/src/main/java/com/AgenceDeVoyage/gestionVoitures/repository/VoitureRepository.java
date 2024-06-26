package com.AgenceDeVoyage.gestionVoitures.repository;

import com.AgenceDeVoyage.gestionVoitures.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository <Voiture, Long> {

}