package br.com.cod3r.exerciciossb.models.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Entity
public class Produto {


    public Produto() {

    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nome;


    @Min(value = 0)
    @Column(name="preco")
    private double preco;

    @Min(value = 0)
    @Max(value = 1)
    @Column(name="desconto")
    private double desconto;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
