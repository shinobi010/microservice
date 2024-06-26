package com.AgenceDeVoyage.GestionOffre.services;

import java.util.List;

import com.AgenceDeVoyage.GestionOffre.entities.Offre;



public interface OffreServiceImp {
	List<Offre> retrieveAllOffres();

	Offre addOffre( Offre offre);

	void deleteOffre(Long idOffre);

	Offre updateOffre(Offre offre);

	Offre retrieveOffre(Long idOffre);

}
