package j_Generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

//        CaixaNumero<String> caixaA = new CaixaNumero<String>(); -> O operador <> não aceitará, por que em CaixaNumero se definiu que o tipo genérico tem que ser qualquer coisa que seja Number (ou que herde dele)
//        caixaA.guardar("teste");

        CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
        caixaA.guardar(2.3);

        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(123);

        System.out.println(caixaB.abrir());
    }
}
