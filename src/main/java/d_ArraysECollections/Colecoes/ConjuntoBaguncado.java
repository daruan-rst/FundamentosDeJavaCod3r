package d_ArraysECollections.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);     // faz o wrapper da classe primitiva automaticamente
        conjunto.add(true);    // faz o wrapper da classe primitiva automaticamente
        conjunto.add("Teste");
        conjunto.add(1);       // faz o wrapper da classe primitiva automaticamente
        conjunto.add('x');     // faz o wrapper da classe primitiva automaticamente

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste"); //  tentando adicionar um objeto repetido

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste")); // .remove retorna um boolean
        System.out.println(conjunto.remove("Teste")); // .remove retorna um boolean
        System.out.println(conjunto.remove('x')); // .remove retorna um boolean

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x')); // -> retorna falso por que foi removido na linha 24
        System.out.println(conjunto.contains(1));     // - > retorna true por que foi adicionado e nunca removido
        System.out.println(conjunto.contains(false)); // - > retorna falso por que nunca foi adicionado
        System.out.println(conjunto.contains(true)); // -> retorna true por que foi adicionado e nunca removido

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); //[UNIÃO ENTRE DOIS CONJUNTOS] .addAll() adiciona todos os elementos de outro conjunto
        System.out.println(conjunto);

        conjunto.retainAll(nums); //[INTERSECÇÃO ENTRE DOIS CONJUNTOS] .retainAll() retorna só os elementos em comum dos dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); // .clear() esvazia o conjunto
        System.out.println(conjunto);

    }
}
