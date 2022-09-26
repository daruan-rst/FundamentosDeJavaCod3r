package e_OrientacaoAObjetos.Desafios.PrimeiroDesafio;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();
    
    Cliente (String nome){
        this.nome = nome;
    }
    
    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    
    BigDecimal obterValorTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for (Compra compra: compras
             ) {
            for (Item item: compra.itens
                 ) {
                total = total.add(item.produto.preco.multiply(new BigDecimal(item.quantidade)));
            }
        }
    return total;}
}
