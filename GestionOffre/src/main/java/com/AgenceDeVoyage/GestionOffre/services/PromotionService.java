package com.AgenceDeVoyage.GestionOffre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgenceDeVoyage.GestionOffre.entities.Promotion;
import com.AgenceDeVoyage.GestionOffre.repositories.PromotionRepository;
@Service
public class PromotionService implements PromotionServiceImp{
	@Autowired
	PromotionRepository promotionRepository ;
	
	@Override
	public List<Promotion> retrieveAllPromotions() {
		return (List<Promotion>) promotionRepository.findAll();
	}

	@Override
	public Promotion addPromotion(Promotion promotion) {
		return promotionRepository.save(promotion);
	}

	@Override
	public void deletePromotion(Long idPromotion) {
		promotionRepository.deleteById(idPromotion);
	}

	@Override
	public Promotion updatePromotion(Promotion promotion) {
		return promotionRepository.save(promotion);
	}

	@Override
	public Promotion retrievePromotion(Long idPromotion) {
		return promotionRepository.findById(idPromotion).get();
}
}