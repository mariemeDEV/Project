package org.technicalhouse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.technicalhouse.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {

}
