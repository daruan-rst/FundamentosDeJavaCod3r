package e_OrientacaoAObjetos.Desafios.TerceiroDesafio;

public class PistaDeCorrida {


    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Carro fusca = new Fusca();

        ferrari.ligarAr();
        fusca.acelerar();
        ferrari.acelerar();

        fusca.qualAMinhaVelociade();
        ferrari.qualAMinhaVelociade();
        fusca.quemEstaNaFrente(ferrari);
        System.out.println(ferrari.velocidadeDoAr());

        ferrari.frear();
        fusca.acelerar();

        fusca.qualAMinhaVelociade();
        ferrari.qualAMinhaVelociade();
        fusca.quemEstaNaFrente(ferrari);

        ferrari.ligarTurbo();
        ferrari.acelerar();

        ferrari.qualAMinhaVelociade();
        ferrari.quemEstaNaFrente(fusca);

        ferrari.desligarTurbo();
        ferrari.acelerar();

        fusca.qualAMinhaVelociade();
        ferrari.qualAMinhaVelociade();
        fusca.quemEstaNaFrente(ferrari);

    }
}
