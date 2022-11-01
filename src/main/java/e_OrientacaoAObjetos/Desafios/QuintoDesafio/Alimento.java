package e_OrientacaoAObjetos.Desafios.QuintoDesafio;

public abstract class Alimento {

    public Alimento(double peso){
        setPeso(peso);
    }

    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0){
            this.peso = peso;
        }
    }
}
