package e_OrientacaoAObjetos.Polimorfismo;

public class Comida {

    public Comida(double peso){
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
