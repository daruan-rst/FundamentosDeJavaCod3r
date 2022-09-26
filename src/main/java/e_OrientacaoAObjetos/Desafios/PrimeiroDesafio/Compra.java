package e_OrientacaoAObjetos.Desafios.PrimeiroDesafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){
        this.itens.add(item);
    }

    //Métodos novos da correção

    void adicionarItem(Produto p, int qtde){
        this.adicionarItem(new Item(qtde, p));
    }

    void adicionarItem(String nome, BigDecimal preco, int qtde){
        this.adicionarItem(new Produto(nome, preco), qtde);
    }

    BigDecimal obterValorTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for (Item item: itens
             ) {
            total = total.add(item.produto.preco.multiply(new BigDecimal(item.quantidade)));
        }
    return total;}
}
