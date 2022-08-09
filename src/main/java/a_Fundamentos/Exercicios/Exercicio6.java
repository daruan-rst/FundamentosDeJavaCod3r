package a_Fundamentos.Exercicios;

import java.util.Scanner;

// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double delta = Math.sqrt(b*b - 4*a*c);
        double x1 = (-b + delta)/2*a;
        double x2 = (-b - delta)/2*a;

        String resposta = delta < 0 ? "Não existem raízes reais" :
                                    "Delta = " +  delta +"\nX1 = " + x1 + "\nX2 = %.2f" + x2;

        System.out.printf(resposta);

        sc.close();
    }
}
