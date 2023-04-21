package o_ModularidadeEmJava.app_financeiro.src.financeiro;

public class Teste {

    public static void main(String[] args) {

        Calc c1 = new CalcImpl1();
        Calc c2 = new CalcImpl2();

        System.out.println(c1.soma(1,2,3));
        System.out.println(c2.soma(1,2,3));

//        Calculadora calc = new Calculadora();
//        System.out.println(calc.soma(2,3,4));
//
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
