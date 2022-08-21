package b_EstruturasDeControle.Exercicios;

import java.util.Scanner;

/**
 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
 * Armazene um numero aleatório em uma variável.
 * O Jogador tem 10 tentativas para adivinhar o número gerado.
 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
 * e imprima se o número inserido é maior ou menor do que o número armazenado.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segredo = 11;
        int numero = 101;
        int tentativa = 0;

        while (numero != segredo) {

            tentativa++;
            numero = sc.nextInt();

            if (numero > segredo) {
                System.out.println("O número escondido é menor que " +  numero);
                System.out.println("Restam "+ (10-tentativa) + "tentativas" );
            } else if (numero < segredo) {

                System.out.println("O numero sorteado é maior que " +  numero);
                System.out.println("Restam "+ (10-tentativa) + " tentativas" );

            } else {
                System.out.println("Parabens! Voce ganhou");
            }

        }


        sc.close();
    }
}
