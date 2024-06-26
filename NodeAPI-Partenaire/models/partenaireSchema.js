const mongoose = require('mongoose')


const partenaireSchema = new mongoose.Schema({

    nom: {
        type: String,
        required: true
    },
    ville: {
        type: String,
        required: true
    },
    domaine: {
        type: String,
        required: true
    },

    termYears: {
        type: String,
        required: true
    }

})

module.exports = mongoose.model('Partenaire',partenaireSchema)