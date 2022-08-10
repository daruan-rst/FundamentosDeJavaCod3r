package b_EstruturasDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = sc.nextDouble();

        boolean criterioAprovacao = media <= 10 && media >= 7.0;
        if (criterioAprovacao){
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        boolean criterioRecuperacao = media < 7 && media >= 4.5;
        if (criterioRecuperacao){
            System.out.println("Recuperação");
        }

        boolean criterioReprovacao = media < 4.5 && media >= 0;
        if (criterioReprovacao){
            System.out.println("Reprovado");
        }


        sc.close();
    }
}
