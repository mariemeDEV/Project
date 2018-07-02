package org.technicalhouse.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.apache.catalina.mapper.Mapper;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CategorieProduit {
	@Id
	@GeneratedValue
	private int codeCategorie;
	private String libelleCategorie;
	private int quantiteProdEnStock;
	private static JSONObject obj = new JSONObject();

	@OneToMany
    @OrderBy("libelleProduit ASC")
	@JoinColumn(name = "IdCategorie")
	@JsonIgnore
	private List<Produit> produits = new ArrayList<>();

	public CategorieProduit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieProduit(int codeCategorie, String libelleCategorie, int quantiteProdEnStock) {
		super();
		this.codeCategorie = codeCategorie;
		this.libelleCategorie = libelleCategorie;
		this.quantiteProdEnStock = quantiteProdEnStock;
	}

	public int getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(int codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getLibelleCategorie() {
		return libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	public int getQuantiteProdEnStock() {
		return quantiteProdEnStock;
	}

	public void setQuantiteProdEnStock(int quantiteProdEnStock) {
		this.quantiteProdEnStock = quantiteProdEnStock;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}