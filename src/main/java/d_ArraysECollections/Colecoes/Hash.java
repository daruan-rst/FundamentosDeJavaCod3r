package d_ArraysECollections.Colecoes;

import d_ArraysECollections.Colecoes.Usuario;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean retultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(retultado);
        /**
         * Se o método hashCode() não tiver sido implementaod na classe do Set,
         * então o contains retornará falso.
         */
    }
}
