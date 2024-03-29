package i_JUnit5_ProjetoCampoMinado.modelo;

import i_JUnit5_ProjetoCampoMinado.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public void abrir(int linha, int coluna){
        try{
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linha &&
                            c.getColuna() == coluna)
                    .findFirst()
                    .ifPresent(c -> c.abrir());
        }catch (ExplosaoException e){
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    public void alternarMarcacao(int linha, int coluna){
        campos.parallelStream()
                .filter(c -> c.getLinha() == linha &&
                        c.getColuna() == coluna)
                .findFirst()
                .ifPresent(c -> c.alternarMarcacao());
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
        long minasArmadas = 0;
        Predicate<Campo> minado = campo -> campo.isMinado();

        do{
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        }while(minasArmadas < minas);


    }

    public boolean objetivoAlcancado(){
        return campos.stream().allMatch(Campo::objetivoAlcancado);
    }

    public void reiniciar(){
        campos.stream().forEach( c-> c.reiniciar());
        sortearAsMinas();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("  ");

        for (int c = 0 ; c<colunas ; c++){
            sb.append(" ");
            sb.append(c+1);
            sb.append(" ");
        }
        sb.append("\n");

        int i = 0;
        for (int l = 0; l < linhas; l++) {
            sb.append(l+1);
            sb.append(" ");
            for (int c = 0; c < colunas; c++) {
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
