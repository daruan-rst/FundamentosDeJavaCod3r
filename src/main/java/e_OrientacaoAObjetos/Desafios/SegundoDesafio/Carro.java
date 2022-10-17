package e_OrientacaoAObjetos.Desafios.SegundoDesafio;

public class Carro {

    double velocidadeAtual; // [Km/h]

    void acelerar() {
        this.velocidadeAtual += 5;
    }

    void frear() {
        this.velocidadeAtual -= 5;
    }

    void qualAMinhaVelociade() {
        System.out.println("Este " +
                this.getClass().getSimpleName() +
                " viaja a " +
                velocidadeAtual +
                " Km/h"
        );
    }

    void quemEstaNaFrente(Carro other) {
        if (this.velocidadeAtual > other.velocidadeAtual) {
            System.out.println("Este %s está na frente!" + this.getClass().getSimpleName());
        } else if (this.velocidadeAtual < other.velocidadeAtual) {
            System.out.println("O outro carro está na frente!");
        } else {
            System.out.println("Os carros estão empatados!");
        }
        System.out.println();
    }
}
