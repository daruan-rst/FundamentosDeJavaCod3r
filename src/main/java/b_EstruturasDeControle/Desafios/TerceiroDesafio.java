package b_EstruturasDeControle.Desafios;

import java.util.Scanner;

// Desafio de While: Calcular a média dos alunos na sala até que -1 seja digitado
public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        int nDeAlunos = 0;
        double totalNota = 0;

        while (nota !=-1){
            System.out.printf("\nNota do aluno %d: ", nDeAlunos+1);
            nota = sc.nextDouble();
            if (nota>0){
                nDeAlunos++;
                totalNota += nota;
            }
        }

        System.out.printf("\nMédia de todos os alunos: %.2f", (totalNota)/(nDeAlunos));

        sc.close();
    }
}
