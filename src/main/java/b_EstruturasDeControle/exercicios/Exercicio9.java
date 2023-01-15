package b_EstruturasDeControle.exercicios;

import java.util.Scanner;

/**
 * Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior = 0;

        for (int i = 0 ; i<10 ; i++){
            int numero = sc.nextInt();
            if (i == 0){
                maior = numero;
            }else if(numero>maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número foi: " + maior);

        sc.close();
    }
}
