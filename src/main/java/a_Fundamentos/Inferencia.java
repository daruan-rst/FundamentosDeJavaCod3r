package a_Fundamentos;

import org.w3c.dom.ls.LSOutput;

public class Inferencia {

    public static void main(String[] args) {
        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        double d; //variável foi declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d);

        var f = 12;
        //f = 12.0 - > não pode ser atribuido
    }
}
