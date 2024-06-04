package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosController {

    @GetMapping
    public String get(){
        return "Requisição GET";
    }

    @PostMapping
    public String post(){
        return "Requisição POST";
    }

    @PutMapping
    public String put(){
        return "Requisição GET";
    }

    @PatchMapping
    public String patch(){
        return "Requisição GET";
    }

    @DeleteMapping
    public String delete(){
        return "Requisição GET";
    }
}
