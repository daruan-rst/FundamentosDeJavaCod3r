package k_JavaSwing.campoMinadoSwing.visao;

import k_JavaSwing.campoMinadoSwing.modelo.Tabuleiro;

public class Tempo {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(3,3,9);

        tabuleiro.registrarObservador( e -> {
            if (e.isGanhou()){
                System.out.println("Ganhou");
            }else {
                System.out.println("perdeu");
            }
        });
        tabuleiro.alternarMarcacao(0,0);
        tabuleiro.alternarMarcacao(0,1);
        tabuleiro.alternarMarcacao(0,2);
        tabuleiro.alternarMarcacao(1,0);
        tabuleiro.alternarMarcacao(1,1);
        tabuleiro.alternarMarcacao(1,2);
        tabuleiro.alternarMarcacao(2,0);
        tabuleiro.alternarMarcacao(2,1);
        tabuleiro.alternarMarcacao(2,2);

    }
}
