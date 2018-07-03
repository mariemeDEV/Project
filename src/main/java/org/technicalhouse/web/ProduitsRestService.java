package org.technicalhouse.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.technicalhouse.dao.ProduitRepository;
import org.technicalhouse.entities.Produit;

@RestController
@CrossOrigin("*")
public class ProduitsRestService {

	@Autowired
	ProduitRepository produitRepository;
	
	@RequestMapping(value="/produits",method=RequestMethod.GET)
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}
	
	
	
	
}
