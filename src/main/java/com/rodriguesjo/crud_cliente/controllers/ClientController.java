package com.rodriguesjo.crud_cliente.controllers;

import com.rodriguesjo.crud_cliente.dto.ClientDTO;
import com.rodriguesjo.crud_cliente.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        ClientDTO dto = service.findById(id);
        return dto;
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable) {
      return service.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto) {
        dto = service.insert(dto);
        return dto;
    }
}
