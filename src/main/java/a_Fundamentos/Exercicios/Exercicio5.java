package a_Fundamentos.Exercicios;

import java.util.Scanner;

//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.printf("Área do triângulo: %.2f" + b*h/2);

        sc.close();
    }
}
