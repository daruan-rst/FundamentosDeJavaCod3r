package a_Fundamentos.Operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // equivale a = a + 1 // forma pós fixada
        a--; // equivale a = a - 1

        ++b; // equivale b = b + 1 // forma pré fixada

        System.out.println("Mini Desafio");
        System.out.println(++a == b--);
        /**
         * A comparação acima retorna TRUE por quê o operador unário de "a" é pré fixado, i.e.
         * a variável "a" é incrementada antes da comparação == ser executada.
         * O oposto acontece com "b": "b" só é decrementada depois de "==" ser executado
         */
        System.out.println(a == b);

        /**
         * Aqui, a saída esperada é um FALSE: b já foi decrementado na etapa passada
         */

    }
}
