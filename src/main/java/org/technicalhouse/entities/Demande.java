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
public class Demande {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code_demande;

	@Temporal(TemporalType.DATE)
	private Date dateDemande;
	private String etatDemande;
	@ManyToOne
	@JoinColumn(name="codeClient")
	private Client client;

	
	public Demande(int code_demande) {
		super();
		this.code_demande = code_demande;
	}
	
	public int getCode_demande() {
		return code_demande;
	}

	public void setCode_demande(int code_demande) {
		this.code_demande = code_demande;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getEtatDemande() {
		return etatDemande;
	}

	public void setEtatDemande(String etatDemande) {
		this.etatDemande = etatDemande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
