package com.rodriguesjo.crud_cliente.services;

import com.rodriguesjo.crud_cliente.dto.ClientDTO;
import com.rodriguesjo.crud_cliente.entities.Client;
import com.rodriguesjo.crud_cliente.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(client);
        return dto;
    }
}
