package org.technicalhouse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.technicalhouse.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Integer>{

}
