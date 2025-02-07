package com.rodriguesjo.crud_cliente.repositories;

import com.rodriguesjo.crud_cliente.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
