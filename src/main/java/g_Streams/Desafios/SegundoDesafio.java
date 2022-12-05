package g_Streams.Desafios;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SegundoDesafio {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 400, false, 100);
        Comida c2 = new Comida("Feijão", 200, false, 200);
        Comida c3 = new Comida("Pão",400, true, 200);
        Comida c4 = new Comida("Pizza", 400, true,200);
        Comida c5 = new Comida("Bolo", 300,true,300);
        Comida c6 = new Comida("Bife", 300, false,500);
        Comida c7 = new Comida("Frango",250, false, 400 );

        List<Comida> comidas = List.of(c1,c2,c3,c4,c5,c6,c7);

        Predicate<Comida> calorico = c -> c.calorias > 300;
        Predicate<Comida> glutenFree = c -> !c.contemGluten;
        Function<Comida, String> resultado = c ->  "A comida " + c.nome + " é saudável!";

        comidas.stream()
                .filter(calorico)
                .filter(glutenFree)
                .map(resultado)
                .forEach(System.out::println);

    }
}
