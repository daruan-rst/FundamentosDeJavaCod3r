package i_JUnit5_ProjetoCampoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    private int linhas;

    private int colunas;
    private int minas;
    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sortearAsMinas();
    }

    private void gerarCampos() {
        for (int linhas = 0; linhas < this.linhas; linhas++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                campos.add(new Campo(linhas, coluna));
            }
        }
    }

    private void associarOsVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos ){
                c1.adicionarVizinho(c2);
            }

        }
    }

    private void sortearAsMinas() {
    }

}
