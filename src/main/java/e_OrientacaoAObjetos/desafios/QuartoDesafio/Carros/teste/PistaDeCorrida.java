package e_OrientacaoAObjetos.desafios.QuartoDesafio.Carros.teste;

import e_OrientacaoAObjetos.desafios.QuartoDesafio.Carros.Carro;
import e_OrientacaoAObjetos.desafios.QuartoDesafio.Carros.Ferrari;
import e_OrientacaoAObjetos.desafios.QuartoDesafio.Carros.Fusca;

public class PistaDeCorrida {


    public static void main(String[] args) {
        Carro ferrari = new Ferrari();
        Carro fusca = new Fusca();

        fusca.acelerar();
        ferrari.acelerar();

        fusca.qualAMinhaVelociade();
        ferrari.qualAMinhaVelociade();
        fusca.quemEstaNaFrente(ferrari);

        ferrari.frear();
        fusca.acelerar();

        fusca.qualAMinhaVelociade();
        ferrari.qualAMinhaVelociade();
        fusca.quemEstaNaFrente(ferrari);

    }
}
