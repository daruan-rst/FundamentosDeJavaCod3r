package b_EstruturasDeControle.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que receba uma palavra e imprime no console letra por letra.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua palavra:");
        String line = sc.nextLine();
        for (int i = 0 ; i<line.length() ; i++){
            System.out.println(line.charAt(i));
        }

        sc.close();
    }
}
