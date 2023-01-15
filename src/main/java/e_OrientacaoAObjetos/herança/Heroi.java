package e_OrientacaoAObjetos.herança;

public class Heroi extends Jogador {

    Heroi(int x, int y){
        super(x,y);
    }

    boolean atacar(Jogador oponente) {
        boolean atacar1 = super.atacar(oponente);
        boolean atacar2 = super.atacar(oponente);
        return atacar1 || atacar2;
    }
}
