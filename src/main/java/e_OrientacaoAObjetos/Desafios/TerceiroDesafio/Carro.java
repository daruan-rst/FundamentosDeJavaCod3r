package e_OrientacaoAObjetos.Desafios.TerceiroDesafio;

public class Carro {

    final double VELOCIDADE_MAXIMA;
    double velocidadeAtual; // [Km/h]
    private int delta = 5;

    Carro(double velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        this.velocidadeAtual += getDelta();
    }

    void frear() {
        if (velocidadeAtual >= 5){
            this.velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
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
            System.out.printf("Este %s está na frente!\n" , this.getClass().getSimpleName());
        } else if (this.velocidadeAtual < other.velocidadeAtual) {
            System.out.println("O outro carro está na frente!");
        } else {
            System.out.println("Os carros estão empatados!");
        }
        System.out.println();
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
