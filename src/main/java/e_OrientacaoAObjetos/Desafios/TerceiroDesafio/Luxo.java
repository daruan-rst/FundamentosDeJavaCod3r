package e_OrientacaoAObjetos.Desafios.TerceiroDesafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();
    default int velocidadeDoAr(){
        return 1;
    }
}
