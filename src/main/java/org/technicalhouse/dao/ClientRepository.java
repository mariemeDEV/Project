package org.technicalhouse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.technicalhouse.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Integer>{

}
