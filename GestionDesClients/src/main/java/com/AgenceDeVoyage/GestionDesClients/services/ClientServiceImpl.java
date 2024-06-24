package com.AgenceDeVoyage.GestionDesClients.services;

import com.AgenceDeVoyage.GestionDesClients.entity.Client;
import com.AgenceDeVoyage.GestionDesClients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client AddClient(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public void deleteClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }
    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public Client retrieveClientById(Long idClient) {
        return clientRepository.findById(idClient).get();
    }
    @Override
    public List<Client> retrieveAllClient() {
        return (List<Client>) clientRepository.findAll();
    }

}
