package br.com.cod3r.exerciciossb.models.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Entity
public class Produto {


    public Produto() {

    }

    public Produto(String nome, BigDecimal preco, BigDecimal desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @DecimalMin(value = "0.0", inclusive = false)
    @Column(name="preco")
    private BigDecimal preco;

    @DecimalMin(value = "0.0", inclusive = true)
    @DecimalMax(value = "1.0", inclusive = true)
    @Column(name="desconto")
    private BigDecimal desconto;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
