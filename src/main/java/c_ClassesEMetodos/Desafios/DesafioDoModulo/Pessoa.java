package c_ClassesEMetodos.Desafios.DesafioDoModulo;


/**
 * Requisitos da classe Pessoa:
 * Atributos: nome, peso
 * Método: comer -> recebe como parâmetro um atributo Comida e, quando chamado, acrescenta à pessoa o peso da comida
 */
public class Pessoa {

    String nome;
    double peso; //kg

    Pessoa (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida alimento){
        this.peso += alimento.peso;
    }
}
