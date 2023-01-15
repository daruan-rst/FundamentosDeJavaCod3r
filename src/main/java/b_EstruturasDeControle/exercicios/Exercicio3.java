package b_EstruturasDeControle.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que receba duas notas parciais, calcular a média final.
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
 * caso contrário imprime no console "Reprovado".
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double NOTA_DE_APROVACAO = 7.0;
        final double NOTA_DE_RECUPERACAO = 4.0;

        double primeiraNota = sc.nextDouble();
        double segundaNota = sc.nextDouble();
        double media = (primeiraNota + segundaNota) / 2;

        if (media >= NOTA_DE_APROVACAO) {
            System.out.println("Aprovado");
        } else if (media < NOTA_DE_APROVACAO && media >= NOTA_DE_RECUPERACAO) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
