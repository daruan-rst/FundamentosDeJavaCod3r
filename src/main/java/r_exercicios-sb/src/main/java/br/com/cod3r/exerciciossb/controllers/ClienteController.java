package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "123456789-00");
    }

    @GetMapping( "/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Maria", "987654321-00");
    }

//    @GetMapping( "/{id}")
//    public Cliente ObterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
//        return new Cliente(id, "João Augusto", "111.222.333-44");
//    }
}
