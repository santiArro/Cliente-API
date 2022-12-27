package com.after.ClienteApi.repositorio;

import com.after.ClienteApi.Entidades.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
