package b_EstruturasDeControle.desafios;

import java.util.Scanner;

//Desafio dia de semana
public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();
        int diaNumero;

        if("domingo".equals(dia.toLowerCase())){
            diaNumero = 1;
        } else if ("segunda".equals(dia.toLowerCase())) {
            diaNumero = 2;
        } else if ("terça".equals(dia.toLowerCase())) {
            diaNumero = 3;
        } else if ("quarta".equals(dia.toLowerCase())) {
            diaNumero = 4;
        } else if ("quinta".equals(dia.toLowerCase())) {
            diaNumero = 5;
        } else if ("sexta".equals(dia.toLowerCase())) {
            diaNumero = 6;
        } else if ("sábado".equals(dia.toLowerCase())) {
            diaNumero = 7;
        } else {
            diaNumero =-1;
        }

        String resposta = diaNumero < 0 ? "Entrada inválida :(" : "Sua resposta é: " + diaNumero;

        System.out.println(resposta);
    }
}
