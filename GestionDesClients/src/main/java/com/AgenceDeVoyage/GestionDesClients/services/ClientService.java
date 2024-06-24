package com.AgenceDeVoyage.GestionDesClients.services;

import com.AgenceDeVoyage.GestionDesClients.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> retrieveAllClient();
    Client retrieveClientById(Long idClient);
    Client AddClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long idClient);


}
