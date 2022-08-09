package a_Fundamentos.Exercicios;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        double tf = tc*(9/5) + 32;
        System.out.println("Temperatura em ºC: " + tf);

        sc.close();
    }
}
