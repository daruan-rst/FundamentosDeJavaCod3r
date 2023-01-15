package b_EstruturasDeControle.exercicios;

import java.util.Scanner;

/**
 * Criar um programa informa se o ano atual é um ano bissexto;
 */
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano");
        int ano = sc.nextInt();

        boolean bissexto;

        if (ano % 100 == 0 && ano % 400 == 0){
            bissexto = true;
        } else if (ano % 4 == 0) {
            bissexto = true;
        }else {
            bissexto = false;
        }

        System.out.printf("\nO ano informado %s bissexto" , (bissexto? "é" : "não é"));

        sc.close();

    }
}
