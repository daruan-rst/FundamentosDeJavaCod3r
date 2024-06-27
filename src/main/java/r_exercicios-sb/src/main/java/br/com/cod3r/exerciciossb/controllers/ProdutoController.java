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
    public @ResponseBody Produto novoProduto(
            @RequestParam String nome,
            @RequestParam String preco,
            @RequestParam String desconto){
        Produto produto = new Produto(nome, new BigDecimal(preco), new BigDecimal(desconto));
        produtoRepository.save(produto);
        return produto;
    }

}
