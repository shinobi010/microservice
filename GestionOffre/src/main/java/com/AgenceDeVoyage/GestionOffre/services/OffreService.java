package com.AgenceDeVoyage.GestionOffre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgenceDeVoyage.GestionOffre.entities.Offre;
import com.AgenceDeVoyage.GestionOffre.repositories.OffreRepository;
@Service
public class OffreService implements OffreServiceImp {
	@Autowired
	OffreRepository offreRepository ;
	
	@Override
	public List<Offre> retrieveAllOffres() {
		return (List<Offre>) offreRepository.findAll();
	}

	@Override
	public Offre addOffre(Offre offre) {
		return offreRepository.save(offre);
	}

	@Override
	public void deleteOffre(Long idOffre) {
		offreRepository.deleteById(idOffre);
	}

	@Override
	public Offre updateOffre(Offre offre) {
		return offreRepository.save(offre);
	}

	@Override
	public Offre retrieveOffre(Long idOffre) {
		return offreRepository.findById(idOffre).get();
}

}
