package d_ArraysECollections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int qtdeAlunos = sc.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdeNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdeNotas][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("\nInforme a nota %d do aluno %d:", n, a);
                notasDaTurma[a][n] = sc.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeNotas * qtdeAlunos);
        System.out.println("Média da turma :" + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(notasDoAluno);
        }
        sc.close();
    }

}

