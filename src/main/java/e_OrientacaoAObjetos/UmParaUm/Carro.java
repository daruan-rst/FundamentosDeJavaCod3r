package e_OrientacaoAObjetos.UmParaUm;

public class Carro{
    final Motor motor;
    Carro(){
        this.motor = new Motor(this);
    }
    void acelerar(){
        motor.fatorInjecao += 0.4;
    }
    void frear(){
        motor.fatorInjecao -= 0.4;
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }
}
