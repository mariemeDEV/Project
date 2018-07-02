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
	public Map<String,Produit> getProduits(){
		Map<String,Produit> model = new HashMap<String,Produit>();
		model.put("produits", (Produit) produitRepository.findAll());
		return model;
	}
	
	/*@Autowired
	private ProductRepository productRepo;

	@RequestMapping("/all-products", method = RequestMethod.GET)
	public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("products", productRepo.findAll());
	    return model;
	}*/
	
}
