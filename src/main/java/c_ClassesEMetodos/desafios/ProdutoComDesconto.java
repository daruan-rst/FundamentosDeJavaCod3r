package c_ClassesEMetodos.desafios;

public class ProdutoComDesconto {
    String nome;
    double preco;
    static double desconto = 0.25;
    public ProdutoComDesconto(String nomeInicial, double precoInicial){
        nome =  nomeInicial;
        preco = precoInicial;
    }
    public ProdutoComDesconto(){
    }
    public double precoComDescontoAplicado(){
        return preco * (1 - desconto);
    }
    public void descontoDeDiaEspecial(double novoDesconto){
        desconto = novoDesconto;
    }
}

