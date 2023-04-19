package o_ModularidadeEmJava.app_financeiro.src;

import o_ModularidadeEmJava.app_calculo.src.calculo.Calculadora;
import o_ModularidadeEmJava.app_calculo.src.calculo.interno.OperacoesAritmeticas;

public class Teste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2,3,4));

        OperacoesAritmeticas op = new OperacoesAritmeticas();
        System.out.println(op.soma(2,3,4));

    }
}
