package e_OrientacaoAObjetos.polimorfismo;

public class Pessoa {

    public Pessoa(double peso){
        setPeso(peso);
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
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
