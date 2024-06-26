package com.AgenceDeVoyage.gestionVoitures.contoller;

import com.AgenceDeVoyage.gestionVoitures.entity.Voiture;
import com.AgenceDeVoyage.gestionVoitures.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Voiture")
public class VoitureController {
    @Autowired
    private VoitureService vs;

    @PostMapping("/addVoiture")
    public Voiture saveVoiture(@RequestBody Voiture voi)
    {
        return vs.addVoiture(voi);
    }

    @GetMapping("/Voitures")
    public List<Voiture> FindAllVoiture()
    {
        return  vs.getAllVoitures();
    }

    @DeleteMapping("/deleteVoiture/{id}")
    public String deleteVoiture(@PathVariable Long id)
    {
        vs.deleteVoiture(id);
        return "supprimer";
    }

    @GetMapping("/VoitureById/{id}")
    public Voiture findVoitureById(@PathVariable Long id) {
        return vs.findVoiture(id);
    }

    @PutMapping("/updateVoiture")
    public String updateVoiture(@RequestBody Voiture bal) {
        vs.updateVoiture(bal);
        return "updated";
    }

}