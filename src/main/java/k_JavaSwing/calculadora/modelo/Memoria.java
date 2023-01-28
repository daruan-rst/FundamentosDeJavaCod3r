package k_JavaSwing.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private static final Memoria instancia = new Memoria();

    private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoAtual = "";
    private String textoBuffer = "";

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private Memoria() {

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String texto) {

        TipoComando tipoComando = detectarTipoComando(texto);

        if (tipoComando == null){
            return;
        } else if (tipoComando.equals(TipoComando.ZERAR)) {
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if(tipoComando.equals(TipoComando.NUMERO) ||
                tipoComando.equals(TipoComando.VIRGULA)){
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false;
        } else if(tipoComando.equals(TipoComando.NEGATE)){
            textoAtual = textoAtual.charAt(0) == '-' ? textoAtual.replace("-", "") : "-" + textoAtual;
            substituir = false;
        } else {
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
        }

        System.out.println(tipoComando);

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao() {
        if (ultimaOperacao == null || ultimaOperacao.equals(TipoComando.IGUAL)){
            return textoAtual;
        }
        double numeroBuffer =
                Double.parseDouble(textoBuffer.replace(",","."));
        double numeroAtual =
                Double.parseDouble(textoAtual.replace(",","."));

        double resultado = 0;

        switch (ultimaOperacao){
            case SOMA -> resultado = numeroBuffer + numeroAtual;
            case DIV -> resultado = numeroBuffer / numeroAtual;
            case SUB -> resultado = numeroBuffer - numeroAtual;
            case MULT -> resultado = numeroBuffer * numeroAtual;
            case POERCENTO -> resultado = numeroAtual / 100.0;
        }

        String resultadoString = Double.toString(resultado).replace(".", ",");
        boolean inteiro = resultadoString.endsWith(",0");
        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private TipoComando detectarTipoComando(String texto) {
        if (textoAtual.isEmpty() && texto.equals("0")) {
            return null;
        }
        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            // Quando não for número:
            if ("AC".equals(texto)) {
                return TipoComando.ZERAR;
            } else if ("±".equals(texto) && !textoAtual.isEmpty()) {
                return TipoComando.NEGATE;
            } else if ("%".equals(texto)) {
                return TipoComando.POERCENTO;
            } else if ("÷".equals(texto)) {
                return TipoComando.DIV;
            } else if ("x".equals(texto)) {
                return TipoComando.MULT;
            }else if ("+".equals(texto)) {
                return TipoComando.SOMA;
            }else if ("-".equals(texto)) {
                return TipoComando.SUB;
            }else if ("=".equals(texto)) {
                return TipoComando.IGUAL;
            }else if (",".equals(texto) && !textoAtual.contains(",")) {
                return TipoComando.VIRGULA;
            }
            return null;

        }
    }
}
