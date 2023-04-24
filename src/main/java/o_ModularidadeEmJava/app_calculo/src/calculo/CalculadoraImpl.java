package o_ModularidadeEmJava.app_calculo.src.calculo;

import o_ModularidadeEmJava.app_calculo.src.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl {

    private String id = "abc";

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        return opAritmeticas.soma(nums);
    }

}
