package i_JUnit5_ProjetoCampoMinado;

import i_JUnit5_ProjetoCampoMinado.modelo.Tabuleiro;
import i_JUnit5_ProjetoCampoMinado.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);

        new TabuleiroConsole(tabuleiro);
    }
}
