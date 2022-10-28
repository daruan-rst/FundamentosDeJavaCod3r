package e_OrientacaoAObjetos.Desafios.QuintoDesafio;

public class Pessoa {

    public Pessoa(double peso){
        setPeso(peso);
    }

    public void comer(Alimento comida){
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
