package f_Lambdas;

@FunctionalInterface //-> Lambdas só podem ser definidas sob interfaces funcionais
public interface Calculo {

    public abstract double executar(double a, double b);

//    double teste(); -> anotação @FunctionalInterface impede que mais de um método ABSTRATO seja criado numa interface

    default String legal(){ // -> métodos default não inviabilizam interfaces funcionais
        return "legal";
    }

    static String muitoLegal(){ // -> métodos estáticos não inviabilizam interfaces funcionais
        return "muito legal";
    }
}
