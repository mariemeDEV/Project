package org.technicalhouse.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codeClient;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	private int telephoneClient;
	private String adresseClient;
	@OneToMany(mappedBy="client")
	private List<Demande> demandesClient;
	@OneToMany(mappedBy="client")
	private List<Commande> commandesClient;
	
	
}
