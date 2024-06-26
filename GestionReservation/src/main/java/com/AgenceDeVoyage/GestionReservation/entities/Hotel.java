package com.AgenceDeVoyage.GestionReservation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table( name = "Hotel")
public class Hotel implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idHotel")
	private Long idHotel;
	private String code;
	private String libelle;
	@Enumerated(EnumType.STRING)
	private Categorie Categorie;
	private String Adresse ;
	private int NombreChambres;
	
	
	public Hotel(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Categorie getCategorie() {
		return Categorie;
	}
	public void setCategorie(Categorie categorie) {
		Categorie = categorie;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getNombreChambres() {
		return NombreChambres;
	}
	public void setNombreChambres(int nombreChambres) {
		NombreChambres = nombreChambres;
	}
	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", code=" + code + ", libelle=" + libelle + ", Categorie=" + Categorie
				+ ", Adresse=" + Adresse + ", NombreChambres=" + NombreChambres + "]";
	}
	public Hotel(Long idHotel, String code, String libelle,
			com.AgenceDeVoyage.GestionReservation.entities.Categorie categorie, String adresse, int nombreChambres) {
		super();
		this.idHotel = idHotel;
		this.code = code;
		this.libelle = libelle;
		Categorie = categorie;
		Adresse = adresse;
		NombreChambres = nombreChambres;
	}
	public Hotel() {
		super();
	}
	
	
	
	
}
