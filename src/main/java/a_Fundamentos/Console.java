package a_Fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("dia!\n");

        System.out.println("Bom");
        System.out.println(" dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d",
                            1,2,3,4,5,6);
        System.out.printf("Salário: %.1f", 123.4578);
        System.out.printf("Nome: %s", "Joao");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("%s %s tem %d anos" , nome,  sobrenome, idade );

        sc.close();

    }
}
