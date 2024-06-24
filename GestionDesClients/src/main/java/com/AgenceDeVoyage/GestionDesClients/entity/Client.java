package com.AgenceDeVoyage.GestionDesClients.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idAiroport")
    private Long idClient;
    private  String nomClient;
    private String email;
    private String telephone; ;
    private String adresse;

    public Client() {
    }
    public Client(String nomClient) {
        this.nomClient = nomClient;
    }
    public Client(Long idClient, String nomClient, String email, String telephone, String adresse) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
