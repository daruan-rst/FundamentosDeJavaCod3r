package b_EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("Voce diz:");
            valor = sc.nextLine();
        }
    }
}
