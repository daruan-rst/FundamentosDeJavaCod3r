package c_ClassesEMetodos;

public class Produto {

    String nome;
    double preco;
    double desconto;

    //Construtor padrão i.e. sem parâmetros
    Produto(){

    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        this.nome = nomeInicial;
        this.preco = precoInicial;
        this.desconto = descontoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - (desconto+descontoDoGerente));
    }

}
