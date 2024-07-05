package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.entities.Produto;
import br.com.cod3r.exerciciossb.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

//    @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> pbterProdutosPorPagina
            (@PathVariable int numeroPagina,
             @PathVariable int qtdePagina){
        if(qtdePagina>5) qtdePagina = 5;
        Pageable page = PageRequest.of(numeroPagina,qtdePagina);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path="/{id}")
    public Optional<Produto> obterProdutoPorId(int id){
        return produtoRepository.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }

}
