package e_OrientacaoAObjetos.Herança;

public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao){
        switch (direcao){
            case NORTE -> y--;
            case SUL -> y++;
            case LESTE -> x++;
            case OESTE ->  x--;
        }
        return true;
    }
}
