package com.AgenceDeVoyage.GestionOffre.services;

import java.util.List;

import com.AgenceDeVoyage.GestionOffre.entities.Promotion;

public interface PromotionServiceImp {
	List<Promotion> retrieveAllPromotions();

	Promotion addPromotion( Promotion promotion);

	void deletePromotion(Long idPromotion);

	Promotion updatePromotion(Promotion Promotion);

	Promotion retrievePromotion(Long idPromotion);

}
