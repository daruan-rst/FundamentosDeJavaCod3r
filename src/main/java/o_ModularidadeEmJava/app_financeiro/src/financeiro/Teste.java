package o_ModularidadeEmJava.app_financeiro.src.financeiro;

import o_ModularidadeEmJava.app_api_publica.src.br.com.cod3r.app.Calculadora;

import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();
        System.out.println(calc.soma(2,3,4));

//        OperacoesAritmeticas op = new OperacoesAritmeticas();
//
//        System.out.println(op.soma(2,3,4));
//
//        try {
//            Field fieldId = Calculadora.class.getDeclaredFields()[0];
//            fieldId.setAccessible(true);
//            fieldId.set(calc, "def");
//            System.out.println(fieldId.get(calc));
//            fieldId.setAccessible(false);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(Calculadora.class.getDeclaredFields()[0].getName());
//
    }
}

