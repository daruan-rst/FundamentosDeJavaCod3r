package b_EstruturasDeControle.desafios;

//Desafio If
public class PrimeiroDesafio {
    public static void main(String[] args) {

        double nota = 1.3;

        if(nota >= 9.0); {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }
        /**
         * A razão por trás do erro do código - as mensagens de parabéns serem impressas apesar da nota baixa -
         * se encontra no ";" da linha 9 que, apesar de não realizar nada, representa uma linha de código -
         * o comando que será executado dentro do bloco condicional
         */

    }

}
