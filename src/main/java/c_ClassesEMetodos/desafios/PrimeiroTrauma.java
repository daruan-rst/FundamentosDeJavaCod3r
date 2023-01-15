package c_ClassesEMetodos.desafios;

/**
 * Dada a classe PrimeiroTrauma e a variável "a",
 * como alterar o código de modo que a seja acessível dentro da função main?
 *
 public class PrimeiroTrauma{

    int a = 3; // Não pode mexer nessa linha

    public static void main(String[] args){
    System.out.println(a);
    }
 }
 */
public class PrimeiroTrauma{
    int a = 3; // Não pode mexer nessa linha
    public static void main(String[] args){
        PrimeiroTrauma pt = new PrimeiroTrauma();
        System.out.println(pt.a);
    }
}
