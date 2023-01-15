package c_ClassesEMetodos.desafios.desafioDoModulo;
/**
 * Requisitos da classe Comida:
 * Atributos: nome da comida, peso
 * Método: comer -> recebe como parâmetro um atributo Comida
 */
public class Comida {
    String nome;
    double peso; // kg

    Comida (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
}
