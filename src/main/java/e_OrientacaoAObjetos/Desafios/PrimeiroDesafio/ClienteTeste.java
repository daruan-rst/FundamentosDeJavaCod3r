package e_OrientacaoAObjetos.Desafios.PrimeiroDesafio;

import java.math.BigDecimal;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Antonio Carlos Jobim");

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        Produto p1 = new Produto("Caderno", new BigDecimal("8.00"));
        Produto p2 = new Produto("Caneta", new BigDecimal("2.00"));
        Produto p3 = new Produto("Borracha", new BigDecimal("0.50"));
        Produto p4 = new Produto("Lápis", new BigDecimal("1.00"));

        Item i1 = new Item(2,p1);
        Item i2 = new Item(2,p2);
        Item i3 = new Item(4,p3);
        Item i4 = new Item(3,p4);
        Item i5 = new Item(5,p4);

        compra1.adicionarItem(i1);
        compra1.adicionarItem(i2);
        compra1.adicionarItem(i3);
        compra2.adicionarItem(i4);
        compra2.adicionarItem(i5);

        c1.adicionarCompra(compra1);
        c1.adicionarCompra(compra2);

        System.out.println(c1.obterValorTotal());


    }
}
