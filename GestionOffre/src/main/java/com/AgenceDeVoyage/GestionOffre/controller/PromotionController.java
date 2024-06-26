package com.AgenceDeVoyage.GestionOffre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.AgenceDeVoyage.GestionOffre.entities.Promotion;
import com.AgenceDeVoyage.GestionOffre.services.PromotionService;

@RestController
	@RequestMapping("/promotion")
	public class PromotionController {

		@Autowired
		PromotionService promotionService;
		
		// http://localhost:8761/SpringMVC/Promotion/retrieve-all-Promotions
			@GetMapping("/retrieve-all-Promotions")
		    @ResponseBody
			public List<Promotion> getPromotions() {
				List<Promotion> listPromotions = promotionService.retrieveAllPromotions();
				return listPromotions ;
			}
			
			// http://localhost:8761/SpringMVC/Promotion/retrieve-Promotion/8
			@GetMapping("/retrieve-Promotion/{Promotion-id}")
			@ResponseBody
			public Promotion retrievePromotion(@PathVariable("Promotion-id") Long idPromotion) {
			return promotionService.retrievePromotion(idPromotion);
			}
			
			// http://localhost:8761/SpringMVC/Promotion/add-Promotion
			@PostMapping("/add-Promotion")
			@ResponseBody
			public Promotion addPromotion(@RequestBody Promotion p)
			{
				Promotion Promotion = promotionService.addPromotion(p);
			return Promotion;
			}
			
			// http://localhost:8761/SpringMVC/Promotion/remove-Promotion/{Promotion-id}
			@DeleteMapping("/remove-Promotion/{idPromotion}")
			@ResponseBody
			public void removePromotion(@PathVariable("idPromotion") Long idPromotion) {
				promotionService.deletePromotion(idPromotion);
			}
			
			// http://localhost:8761/SpringMVC/Promotion/modify-Promotion
			@PutMapping("/modify-Promotion")
			@ResponseBody
			public Promotion modifyPromotion(@RequestBody Promotion Promotion) {
				return promotionService.updatePromotion(Promotion);
			}
	}

