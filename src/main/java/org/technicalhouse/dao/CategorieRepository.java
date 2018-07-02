package org.technicalhouse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.technicalhouse.entities.CategorieProduit;

public interface CategorieRepository extends JpaRepository<CategorieProduit,Integer> {

}
