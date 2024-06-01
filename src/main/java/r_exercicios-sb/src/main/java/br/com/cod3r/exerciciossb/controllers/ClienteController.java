package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "123456789-00");
    }
}