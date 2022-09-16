package d_ArraysECollections.Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe"); // retorna um booleano para o sucesso da operação
        livros.push("Dom Quixote"); // retornará uma excessão se alguma restrição de capacidade tiver ocorrido
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro : livros
             ) {
            System.out.println(livro);
        }

        System.out.println(livros.poll()); // retorna falso se estiver vazio
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());    // retorna excessão se estiver vazio
        System.out.println(livros.remove()); // retorna excessão se estiver vazio

        // livros.size()
        // livros.clear();
        // livros.isEmpty()
        // livros.contains();


    }
}
