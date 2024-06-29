package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.entities.Produto;
import br.com.cod3r.exerciciossb.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

}
