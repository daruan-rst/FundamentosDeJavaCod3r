package b_EstruturasDeControle.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que receba um número e diga se ele é um número primo.
 * TEM QUE USAR SWITCH
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int divisores = 0;

        // O laço de for tem que começar pelo 2, já que qualquer número módulo 1 resulta zero
        for (int i = 2 ; i<numero ; i++){
            if (numero%i == 0){
                divisores++;
            }
        }

        switch (divisores){
            case 0:
                System.out.println("O número é primo");
                break;
            default:
                System.out.println("O número não é primo");
                break;
        }

    }
}

