package com.AgenceDeVoyage.GestionOffre.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgenceDeVoyage.GestionOffre.entities.Offre;
@Repository
public interface OffreRepository extends CrudRepository<Offre, Long> {

}
