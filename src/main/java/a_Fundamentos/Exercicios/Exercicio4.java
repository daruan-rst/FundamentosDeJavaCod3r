package a_Fundamentos.Exercicios;

import java.util.Scanner;

// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.printf("Quadrado %.2f:\nCubo: %.2f" , Math.pow(a,2), Math.pow(a,3));

        sc.close();
    }
}
