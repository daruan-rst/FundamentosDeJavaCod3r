package e_OrientacaoAObjetos.composição.UmParaMuitos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicioarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    void adicioarItem(String nome, int quantidade, double preco) {
        this.adicioarItem(new Item(nome, quantidade, preco));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : itens
        ) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
