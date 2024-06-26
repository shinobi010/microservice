package com.AgenceDeVoyage.GestionOffre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.AgenceDeVoyage.GestionOffre.entities.Offre;
import com.AgenceDeVoyage.GestionOffre.services.OffreService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/offre")
public class OffreController {

	@Autowired
	OffreService offreService;
	
	// http://localhost:8761/SpringMVC/Offre/retrieve-all-Offres
		@GetMapping("/retrieve-all-Offres")
	    @ResponseBody
		public List<Offre> getOffres() {
			List<Offre> listOffres = offreService.retrieveAllOffres();
			return listOffres ;
		}
		
		// http://localhost:8761/SpringMVC/Offren/retrieve-Offre/8
		@GetMapping("/retrieve-Offre/{Offre-id}")
		@ResponseBody
		public Offre retrieveOffre(@PathVariable("Offre-id") Long idOffre) {
		return offreService.retrieveOffre(idOffre);
		}
		
		// http://localhost:8761/SpringMVC/Offre/add-Offre
		@PostMapping("/add-Offre")
		@ResponseBody
		public Offre addOffre(@RequestBody Offre o)
		{
			Offre Offre = offreService.addOffre(o);
		return Offre;
		}
		
		// http://localhost:8761/SpringMVC/Offre/remove-Offre/{Offre-id}
		@DeleteMapping("/remove-Offre/{idOffre}")
		@ResponseBody
		public void removePromotion(@PathVariable("idOffre") Long idOffre) {
			offreService.deleteOffre(idOffre);
		}
		
		// http://localhost:8761/SpringMVC/Offre/modify-Offre
		@PutMapping("/modify-Offre")
		@ResponseBody
		public Offre modifyOffre(@RequestBody Offre Offre) {
			return offreService.updateOffre(Offre);
		}
}
