package org.technicalhouse.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code_commande;
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	private String etatCommande;
	@ManyToOne
	@JoinColumn(name="codeClient")
	private Client client;
	
	
	
	public Commande(int code_commande) {
		super();
		this.code_commande = code_commande;
	}

	public String getEtatCommande() {
		return etatCommande;
	}

	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}
}
