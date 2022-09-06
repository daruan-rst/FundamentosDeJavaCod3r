package c_ClassesEMetodos.Desafios.DesafioDoModulo;

/**
 * Instancia comida e pessoa
 */
public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.3);
        Comida c2 = new Comida("Feijão", 0.2);

        Pessoa p1 = new Pessoa("Antonio", 65);

        System.out.printf("%s pesava  %.2f antes de comer" ,p1.nome , p1.peso);

        p1.comer(c1);
        p1.comer(c2);

        System.out.printf("\nAgora, %s pesa: %.2f", p1.nome, p1.peso);


    }

}
