package b_EstruturasDeControle.Exercicios;

import java.util.Scanner;

/**
 * Criar um programa que receba um número e diga se ele é um número primo.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        boolean primo = true;

        // O laço de for tem que começar pelo 2, já que qualquer número módulo 1 resulta zero
        for (int i = 2 ; i<numero ; i++){
            if (numero%i == 0){
                primo = false;
                break;
            }

        }
        System.out.printf("O número %s primo", (primo? "é" : "não é"));

    }
}
