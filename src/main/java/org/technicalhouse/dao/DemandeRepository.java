package org.technicalhouse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.technicalhouse.entities.Demande;

public interface DemandeRepository extends JpaRepository<Demande,Integer>{
	

}
