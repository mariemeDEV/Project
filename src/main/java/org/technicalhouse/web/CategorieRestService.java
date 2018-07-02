package org.technicalhouse.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.technicalhouse.dao.CategorieRepository;
import org.technicalhouse.entities.CategorieProduit;

@RestController
@CrossOrigin("*")
public class CategorieRestService {

	@Autowired 
	private CategorieRepository categorieRepository;
	
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public List<CategorieProduit> getCategories(){
		return categorieRepository.findAll();
	}
}
