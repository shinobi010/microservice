package com.AgenceDeVoyage.gestionVoitures.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture implements Serializable{

    private static final long serialVersionUID = 6;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String typeinj;


    public Voiture() {
        super();
    }

    public Voiture(long id, String name, String description, String typeinj) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.typeinj = typeinj;
    }

    public Voiture(String name, String description, String typeinj) {
        super();
        this.name = name;
        this.description = description;
        this.typeinj = typeinj;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeinj() {
        return typeinj;
    }

    public void setTypeinj(String typeinj) {
        this.typeinj = typeinj;
    }



    @Override
    public String toString() {
        return "voituree [id=" + id + ", name=" + name + ", description=" + description + ", typeinj=" + typeinj
                + "]";
    }
}