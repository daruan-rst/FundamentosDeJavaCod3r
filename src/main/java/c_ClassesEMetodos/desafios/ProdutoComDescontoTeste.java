package c_ClassesEMetodos.desafios;

public class ProdutoComDescontoTeste {
    public static void main(String[] args) {

        ProdutoComDesconto p1 = new ProdutoComDesconto("Notebook", 4356.89);  // construtor usado: com todos os parâmetros
        var p2 = new ProdutoComDesconto(); // construtor usado: sem parâmetros

        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        double precoFinal1 = p1.precoComDescontoAplicado();
        double precoFinal2 = p2.precoComDescontoAplicado();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
    }
}