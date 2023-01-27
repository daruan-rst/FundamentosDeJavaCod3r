package k_JavaSwing.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria{

    private static final Memoria instancia = new Memoria();

    private String textoAtual = "";

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private Memoria() {

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador){
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valor){

        if ("AC".equals(valor)){
            textoAtual = "";
        } else if ("±".equals(valor)) {
            textoAtual =  textoAtual.charAt(0) == '-' ?  textoAtual.replace("-", "") : "-"+textoAtual;
        } else {
            textoAtual += valor;
        }

        observadores.forEach( o-> o.valorAlterado(getTextoAtual()));
    }
}
