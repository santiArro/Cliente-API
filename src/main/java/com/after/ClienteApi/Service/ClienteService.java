package com.after.ClienteApi.Service;

import com.after.ClienteApi.Entidades.Cliente;
import com.after.ClienteApi.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente guardar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
