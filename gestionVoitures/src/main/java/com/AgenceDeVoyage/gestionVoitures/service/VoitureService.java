package com.AgenceDeVoyage.gestionVoitures.service;

import java.util.List;

import com.AgenceDeVoyage.gestionVoitures.entity.Voiture;
import com.AgenceDeVoyage.gestionVoitures.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository vr;

    public Voiture addVoiture(Voiture a) {
        return vr.save(a);
    }

    public String updateVoiture( Voiture newVoi) {
        if(vr.findById(newVoi.getId()).isPresent()) {
            Voiture existingVoiture = vr.findById(newVoi.getId()).get();
            Long oldId=existingVoiture.getId();
            existingVoiture=newVoi;
            existingVoiture.setId(oldId);

            vr.save(existingVoiture);
            return "updated";
        }else
            return null;
    }

    public String deleteVoiture(Long id) {
        if (vr.findById( id).isPresent()) {
            vr.deleteById( id);
            return " Voiture Supprimé ";
        }else
            return "Voiture non supprimé";
    }

    public List<Voiture> getAllVoitures()
    {
        return vr.findAll();
    }

    public Voiture findVoiture(Long id)
    {
        return vr.findById(id).orElse(null);
    }

}