package e_OrientacaoAObjetos.Desafios.QuartoDesafio.Jogo;

public class Heroi extends Jogador {

    public Heroi(int x, int y){
        super(x,y);
    }

    @Override
    public boolean atacar(Jogador oponente) {
        boolean atacar1 = super.atacar(oponente);
        boolean atacar2 = super.atacar(oponente);
        return atacar1 || atacar2;
    }
}
