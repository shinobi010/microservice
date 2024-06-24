package com.AgenceDeVoyage.GestionDesClients.repository;

import com.AgenceDeVoyage.GestionDesClients.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
