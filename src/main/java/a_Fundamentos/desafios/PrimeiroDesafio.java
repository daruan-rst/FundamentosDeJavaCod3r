package a_Fundamentos.desafios;

import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tFahrenheit = sc.nextDouble();
        double tCelcius = (tFahrenheit -32)*(5/9.0);
        System.out.println("Temperatura em celsius: " + tCelcius);

        sc.close();
    }
}
