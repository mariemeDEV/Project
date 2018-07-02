package org.technicalhouse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code_produit;
	private String libelleProduit;
	private int qteEnStock;
	private float prixUnitaire;
	private float prixTotal;

	
	public Produit(int code_produit, String libelleProduit, int qteEnStock, float prixUnitaire, float prixTotal) {
		super();
		this.code_produit   = code_produit;
		this.libelleProduit = libelleProduit;
		this.qteEnStock     = qteEnStock;
		this.prixUnitaire = prixUnitaire;
		this.prixTotal = prixTotal;
	}
	public int getCode_produit() {
		return code_produit;
	}
	public void setCode_produit(int code_produit) {
		this.code_produit = code_produit;
	}
	public String getLibelleProduit() {
		return libelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public float getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}
	public int getQteEnStock() {
		return qteEnStock;
	}
	public void setQteEnStock(int qteEnStock) {
		this.qteEnStock = qteEnStock;
	}


	
	
}
