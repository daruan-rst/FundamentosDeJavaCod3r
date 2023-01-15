package d_ArraysECollections.desafios;

import java.util.Scanner;

/**
 * Calcular a média das notas de um aluno
 * O algoritmo deve ser quebrado em dois laços for: um que armazena as notas num array; outro que soma todas as notas
 * O valor do índice deve ser informado
 */
public class PrimeiroDesafio {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quantas notas serão passadas?");

        int qntd = sc.nextInt();
        double[] notas = new double[qntd];
        double total = 0;


        for (int i = 0; i < qntd ; i++) {
            System.out.printf("Digite a nota %d :" , (i+1));
            notas[i] = sc.nextDouble();
        }

        for (double nota : notas){
            total +=nota;
        }

        System.out.println("A média final é: " + total/qntd);

        sc.close();

    }

}
