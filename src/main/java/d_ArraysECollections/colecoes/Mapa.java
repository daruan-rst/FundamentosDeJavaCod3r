package d_ArraysECollections.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));
        usuarios.remove(1);
        usuarios.remove(4, "Gui"); // -> retornará falso por que "Gui" não existe

        for (int chave: usuarios.keySet()
             ) {
            System.out.println(chave);
        }

        for (String nome: usuarios.values()
             ) {
            System.out.println(nome);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()
             ) {
            System.out.print(registro.getKey() + "  ===> ");
            System.out.println(registro.getValue());
        }


    }
}
