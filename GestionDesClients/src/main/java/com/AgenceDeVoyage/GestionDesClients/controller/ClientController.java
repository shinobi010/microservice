package com.AgenceDeVoyage.GestionDesClients.controller;

import com.AgenceDeVoyage.GestionDesClients.entity.Client;
import com.AgenceDeVoyage.GestionDesClients.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientServiceImpl;

    @PostMapping("/add-client")
    @ResponseBody
    public Client AddClient(@RequestBody Client client) {
        Client Client = clientServiceImpl.AddClient(client);
        return Client;
    }

    @PostMapping("/update-client")
    @ResponseBody
    public Client UpdateClient(@RequestBody Client client) {
        return clientServiceImpl.updateClient(client);
    }
    @DeleteMapping("/remove-client/{idClient}")
    @ResponseBody
    public void removeClient(@PathVariable("idClient") Long idClient) {
        clientServiceImpl.deleteClient(idClient);
    }
    @GetMapping("/get-client/{idClient}")
    @ResponseBody
    public Client getClient(@PathVariable("idClient") Long idClient) {
        return clientServiceImpl.retrieveClientById(idClient);
    }
    @GetMapping("/get-all")
    @ResponseBody
    public List<Client> getClients() {
        return clientServiceImpl.retrieveAllClient();
    }
}
