package d_ArraysECollections.Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // Retornará uma excessão se tentar adicionar à uma fila com restrição (está cheia)
        fila.offer("Bia"); // retornará falso se tentar adicionar à uma fila com restrição (está cheia)
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // -> lê o elemento da fila, mas não o remove e retorna null se a fila estiver vazia
        System.out.println(fila.element()); // -> lê o elemento da fila, mas não o remove e joga excessão se a fila estiver vazia

        // fila.size()
        // fila.clear();
        // fila.isEmpty()

        System.out.println(fila.poll()); // .poll() retorna e remove o elemento de cima da fila (primeiro adicionado) ; retorna nulo se a fila estiver vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // .remove() retorna e remove o elemento de cima da fila (primeiro adicionado) ; lança excessão se a fila estiver vazia

        // fila.contains() para saber se a fila está vazia

    }
}
