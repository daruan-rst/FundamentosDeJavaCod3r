package b_EstruturasDeControle.Exercicios;

import java.util.Scanner;

/**
 *  Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        String resposta = numero%2 == 0? "par" : "ímpar";

        if(numero<10 && numero>0){
            System.out.println("O número está no intervalo entre 0 e 10 e é " + resposta);
        }else {
            System.out.println("O número está fora do intervalo e é " + resposta);
        }

        sc.close();
    }
}
