package o_ModularidadeEmJava.app_financeiro.src;

import o_ModularidadeEmJava.app_calculo.src.calculo.Calculadora;
import o_ModularidadeEmJava.app_calculo.src.calculo.interno.OperacoesAritmeticas;

import java.lang.reflect.Field;

public class Teste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2,3,4));

        OperacoesAritmeticas op = new OperacoesAritmeticas();
        System.out.println(op.soma(2,3,4));

        try {
            Field fieldId = Calculadora.class.getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            System.out.println(fieldId.get(calc));
            fieldId.setAccessible(false);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Calculadora.class.getDeclaredFields()[0].getName());

    }
}
