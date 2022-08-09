package a_Fundamentos.Exercicios;

import java.util.Scanner;

//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.printf("IMC = %.2f", p/(h*h));

        sc.close();
    }
}
