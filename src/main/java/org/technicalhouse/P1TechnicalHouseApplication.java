package org.technicalhouse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.technicalhouse.dao.CategorieRepository;
import org.technicalhouse.dao.ClientRepository;
import org.technicalhouse.dao.DemandeRepository;
import org.technicalhouse.dao.ProduitRepository;
import org.technicalhouse.entities.CategorieProduit;
import org.technicalhouse.entities.Client;
import org.technicalhouse.entities.Commande;
import org.technicalhouse.entities.Demande;
import org.technicalhouse.entities.Produit;

@SpringBootApplication
public class P1TechnicalHouseApplication implements CommandLineRunner{
//Two repositories cannot be instantiated at the same time
	@Autowired
	// private ProduitRepository produitRepository;
    //private ClientRepository clientRepository;
   //private CategorieRepository categorieProduitRepository;
  //private ProduitRepository produitRepository;
 //private List<CategorieProduit> categories;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(P1TechnicalHouseApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		 System.out.print("ok");
		 
	     /*categorieProduitRepository.save(new CategorieProduit(0,"Bacs empilables", 1020));
		 categorieProduitRepository.save(new CategorieProduit(0,"Bacs amboitables", 1075));
		 categorieProduitRepository.save(new CategorieProduit(0,"Eprouvettes", 210));
		 categorieProduitRepository.save(new CategorieProduit(0,"Becher", 340));
		 categorieProduitRepository.save(new CategorieProduit(0,"Broc doseur", 279));
		 categorieProduitRepository.save(new CategorieProduit(0,"Cuillère doseuse sphérique", 509));
		 categorieProduitRepository.save(new CategorieProduit(0,"Cuillère doseuse", 500));*/
/*CategorieProduit c1 = new CategorieProduit(2);
CategorieProduit c2 = new CategorieProduit(3);
CategorieProduit c3 = new CategorieProduit(4);*/

		/* produitRepository.save(new Produit(0,"Bac amboitable 15mm",10,15000,15000*10,c1));
		 produitRepository.save(new Produit(0,"Becher10mm",60,20000,60*20000,c2));
		 produitRepository.save(new Produit(0,"Becher 15mm",10,10000,10*10000,c3));
		 produitRepository.save(new Produit(0,"Becher 45mm",10,10000,10*20000,c3));*/
	
		/* List<CategorieProduit> categories = categorieProduitRepository.findAll();
		 categories.forEach(c->{
			 System.out.println(c.getLibelleCategorie());
		 });*/
	}
}
