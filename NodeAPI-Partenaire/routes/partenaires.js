const express = require('express');
const router = express.Router();
const Partenaire = require('../models/partenaireSchema');

// Get all partenaires
router.get('/all', async (req, res) => {
    try {
        const partenaires = await Partenaire.find();
        res.json(partenaires);
    } catch (err) {
        res.status(500).send('Error: ' + err);
    }
});

// Get a partenaire by ID
router.get('/:id', async (req, res) => {
    try {
        const partenaire = await Partenaire.findById(req.params.id);
        res.json(partenaire);
    } catch (err) {
        res.status(500).send('Error: ' + err);
    }
});

// Add a new partenaire
router.post('/add', async (req, res) => {
    const partenaire = new Partenaire({
        nom: req.body.nom,
        ville: req.body.ville,
        domaine: req.body.domaine,
        termYears: req.body.termYears,
    });

    try {
        const newPartenaire = await partenaire.save();
        res.status(201).json(newPartenaire);
    } catch (err) {
        res.status(400).send('Error: ' + err);
    }
});

// Delete a partenaire by ID
router.delete('/delete/:id', async (req, res) => {
    try {
        const deletedPartenaire = await Partenaire.findByIdAndDelete(req.params.id);
        if (!deletedPartenaire) {
            return res.status(404).send('Partenaire not found');
        }
        res.json(deletedPartenaire);
    } catch (err) {
        res.status(500).send('Error: ' + err);
    }
});

// Update a partenaire
router.patch('/edit/:id', async (req, res) => {
    try {
        const partenaire = await Partenaire.findById(req.params.id);
        if (!partenaire) {
            return res.status(404).send('Partenaire not found');
        }

        partenaire.nom = req.body.nom || partenaire.nom;
        partenaire.ville = req.body.ville || partenaire.ville;
        partenaire.domaine = req.body.domaine || partenaire.domaine;
        partenaire.termYears = req.body.termYears || partenaire.termYears;

        const updatedPartenaire = await partenaire.save();
        res.json(updatedPartenaire);
    } catch (err) {
        res.status(400).send('Error: ' + err);
    }
});

module.exports = router;
