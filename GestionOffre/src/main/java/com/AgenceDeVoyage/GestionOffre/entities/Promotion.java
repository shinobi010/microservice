package com.AgenceDeVoyage.GestionOffre.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Promotion")
public class Promotion implements Serializable {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idPromotion")
		private Long idPromotion ;
		
		private String nom;
		
		private Date dateDebut;
		
		private Date dateFin;
		
		@Enumerated(EnumType.STRING)
		private Categorie categorie ;
		
		
		
		
		
		public Promotion(String nom) {
			super();
			this.nom = nom;
		}
		@Override
		public String toString() {
			return "Promotion [idPromotion=" + idPromotion + ", nom=" + nom + ", dateDebut=" + dateDebut + ", dateFin="
					+ dateFin + ", categorie=" + categorie + "]";
		}
		public Promotion(Long idPromotion, String nom, Date dateDebut, Date dateFin, Categorie categorie) {
			super();
			this.idPromotion = idPromotion;
			this.nom = nom;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.categorie = categorie;
		}
		public Promotion() {
			super();
		}
		public Long getIdPromotion() {
			return idPromotion;
		}
		public void setIdPromotion(Long idPromotion) {
			this.idPromotion = idPromotion;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Date getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(Date dateDebut) {
			this.dateDebut = dateDebut;
		}
		public Date getDateFin() {
			return dateFin;
		}
		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}
		public Categorie getCategorie() {
			return categorie;
		}
		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}

}
