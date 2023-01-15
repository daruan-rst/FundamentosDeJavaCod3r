package e_OrientacaoAObjetos.desafios.TerceiroDesafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();
    default int velocidadeDoAr(){
        return 1;
    }
}
