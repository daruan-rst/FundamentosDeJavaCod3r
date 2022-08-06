package a_Fundamentos.Operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); //and
        System.out.println(condicao1 || condicao2); //or
        System.out.println(condicao1 ^ condicao2);  //xor
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        System.out.println("Tabela verdade AND");
        System.out.println(true  && true);
        System.out.println(true  && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela verdade OR");
        System.out.println(true  || true);
        System.out.println(true  || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade XOR");
        System.out.println(true  ^ true);
        System.out.println(true  ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
