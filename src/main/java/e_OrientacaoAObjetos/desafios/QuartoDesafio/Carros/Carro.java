package e_OrientacaoAObjetos.desafios.QuartoDesafio.Carros;

public class Carro {

    final double VELOCIDADE_MAXIMA;
    protected double velocidadeAtual; // [Km/h]
    protected int delta = 5;

    protected Carro(double velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        this.velocidadeAtual += delta;
    }

    public void frear() {
        if (velocidadeAtual >= 5){
            this.velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public void qualAMinhaVelociade() {
        System.out.println("Este " +
                this.getClass().getSimpleName() +
                " viaja a " +
                velocidadeAtual +
                " Km/h"
        );
    }

    public void quemEstaNaFrente(Carro other) {
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
