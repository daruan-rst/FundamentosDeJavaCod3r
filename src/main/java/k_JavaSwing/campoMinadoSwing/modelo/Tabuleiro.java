package k_JavaSwing.campoMinadoSwing.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{

    private int linhas;
    private int colunas;
    private int minas;
    private final List<Campo> campos = new ArrayList<>();
    private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sortearAsMinas();
    }

    public void registrarObservador(Consumer<ResultadoEvento> observador){
        observadores.add(observador);
    }

    private void notificarObservadores(Boolean resultado){
        observadores.stream().forEach( o -> o.accept(new ResultadoEvento(resultado)));
    }

    public void abrir(int linha, int coluna){
        campos.parallelStream()
                    .filter(c -> c.getLinha() == linha &&
                            c.getColuna() == coluna)
                    .findFirst()
                    .ifPresent(c -> c.abrir());
    }

    private void mostrarMinas(){
        campos.stream().filter(Campo::isMinado)
                .forEach(c -> c.setAberto(true));
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
                Campo campo = new Campo(linhas, coluna);
                campo.registrarObservador(this);
                campos.add(campo);
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

    @Override
    public void eventoOcocrreu(Campo campo, CampoEvento evento) {
        if (evento == CampoEvento.EXPLODIR){
            mostrarMinas();
            notificarObservadores(false);
        } else if (objetivoAlcancado()) {
            notificarObservadores(true);
        }
    }
}
