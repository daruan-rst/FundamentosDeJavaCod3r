package i_JUnit5_ProjetoCampoMinado.modelo;

import i_JUnit5_ProjetoCampoMinado.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Campo {

    private final int linha;

    private final int coluna;
    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;
    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        }
        return false;
    }

    void alternarMarcacao(){
        if (!aberto){
            marcado = !marcado;
        }
    }

    boolean abrir(){
        if (!aberto && !marcado){
            aberto = true;

            if (minado){
                throw new ExplosaoException();
            }

            if (vizinhancaSegura()){
                vizinhos.forEach(Campo::abrir);
            }

            return true;
        }else {
            return false;
        }
    }

    boolean vizinhancaSegura(){
        return vizinhos.stream().noneMatch(campo -> campo.minado);
    }

    public boolean isMarcado() {
        return marcado;
    }

    void minar(){
        minado = true;
    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }

    long minasNaVizinhanca(){
        Predicate<Campo> vizinhoMinado = v -> v.minado;
        return vizinhos.stream().filter(vizinhoMinado).count();
    }

    void reinicias(){
        aberto = false;
        minado = false;
        marcado = false;
    }

    public String toString(){
        if (marcado){
            return "x";
        } else if (aberto && minado) {
            return "*";
        } else if (aberto && minasNaVizinhanca() > 0) {
            return mineTextColor((int) minasNaVizinhanca());
        } else if(aberto){
            return " ";
        }else {
            return "?";
        }
    }

    public static String mineTextColor(int minasNaVizinhanca){
        String color;
        switch (minasNaVizinhanca){
            case 1 -> color = "\u001B[34m";
            case 2 -> color = "\u001B[32m";
            case 3 -> color = "\u001B[31m";
            case 4 -> color = "\u001B[35m";
            default -> color = "\u001B[30m";
        }
        return color + Long.toString(minasNaVizinhanca) + "\u001B[0m";
    }
}
