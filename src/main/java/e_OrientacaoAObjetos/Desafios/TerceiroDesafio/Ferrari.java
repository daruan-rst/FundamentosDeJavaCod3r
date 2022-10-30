package e_OrientacaoAObjetos.Desafios.TerceiroDesafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;
    Ferrari() {
        super(180);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        System.out.println("Turbo foi ligado");
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        System.out.println("Turbo foi desligado");
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta(){
        if (ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }else
            return 15;
    }
}
