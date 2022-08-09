package a_Fundamentos.Exercicios;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tf = sc.nextInt();
        double tc = (tf - 32)*(5/9.0);
        System.out.println("Temperatura em ºC: " + tc);

        sc.close();
    }
}
