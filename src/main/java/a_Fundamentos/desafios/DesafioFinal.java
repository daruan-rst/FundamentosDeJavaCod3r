package a_Fundamentos.desafios;

import java.util.Scanner;

//desafio calculadora
public class DesafioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1  = sc.nextDouble();
        double num2  = sc.nextDouble();

        System.out.println("Qual operação? \nAdição, Subtração, Multiplicação, Divisão ou Módulo?");
        String operation = sc.next();

        double resultado  = operation.equals("+") ? num1+num2 :
                            operation.equals("-") ? num1-num2 :
                            operation.equals("*") ? num1*num2 :
                            operation.equals("/") ? num1/num2 :
                            num1%num2;

        System.out.printf("%f %s %f = %f" , num1, operation, num2, resultado);

        sc.close();

    }
}
