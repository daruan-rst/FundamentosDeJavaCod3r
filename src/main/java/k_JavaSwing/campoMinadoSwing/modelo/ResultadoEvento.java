package k_JavaSwing.campoMinadoSwing.modelo;

public class ResultadoEvento {

    public ResultadoEvento(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    private final boolean ganhou;
}
