package com.AgenceDeVoyage.GestionOffre.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Offre")
public class Offre implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOffre")
	private Long idOffre ;
	
	private String libelle;
	
	private String code;
	
	private Date dateCreation;
	
	private Float prix;
	
	
	
	public Offre(Long idOffre, String libelle, String code, Date dateCreation, Float prix) {
		super();
		this.idOffre = idOffre;
		this.libelle = libelle;
		this.code = code;
		this.dateCreation = dateCreation;
		this.prix = prix;
	}
	
	public Offre(Long idOffre, String libelle, String code, Float prix) {
		super();
		this.idOffre = idOffre;
		this.libelle = libelle;
		this.code = code;
		this.prix = prix;
	}

	public Offre() {
		super();
	}
	
	public Offre(String code) {
		super();
		this.code = code;
	}

	@Override
	public String toString() {
		return "Offre [idOffre=" + idOffre + ", libelle=" + libelle + ", code=" + code + ", dateCreation="
				+ dateCreation + ", prix=" + prix + "]";
	}

	public Long getIdOffre() {
		return idOffre;
	}

	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}


}
