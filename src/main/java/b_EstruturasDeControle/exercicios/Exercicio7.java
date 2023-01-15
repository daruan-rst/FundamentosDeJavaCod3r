package b_EstruturasDeControle.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos, caso receba um número negativo,
 * encerre o programa. Tente utilizar a estrutura do while.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero = sc.nextInt();

        while (numero>=0){
            soma+=numero;
            System.out.println("Soma atual é " +  soma +"\nDigite o próximo número:");
            numero = sc.nextInt();
        }


        sc.close();

    }
}
