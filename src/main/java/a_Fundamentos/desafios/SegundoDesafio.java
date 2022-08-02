package a_Fundamentos.desafios;

import java.util.Scanner;

//Desafio Conversão
public class SegundoDesafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String salario1 = sc.nextLine();
        String salario2 = sc.nextLine();
        String salario3 = sc.nextLine();

        System.out.println("Média de salários: R$" +
                            meanValue(formatComma(salario1),
                                      formatComma(salario2),
                                      formatComma(salario3)));

        sc.close();

    }

    private static String formatComma(String salario){
         return salario.contains(",") ?
                            salario.replace(",", ".") :
                            salario;}

    private static Double meanValue(String s1, String s2, String s3){
        return (Double.parseDouble(s1) + Double.parseDouble(s2) + Double.parseDouble(s3))/3;
    }
}
