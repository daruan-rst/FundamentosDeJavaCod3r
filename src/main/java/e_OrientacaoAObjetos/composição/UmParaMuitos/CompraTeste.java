package e_OrientacaoAObjetos.composição.UmParaMuitos;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.adicioarItem("Caneta", 20, 7.45);
        compra1.adicioarItem(new Item("Borracha", 12, 3.89));
        compra1.adicioarItem(new Item("Caderno", 3, 18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O total é " + total);

    }
}
