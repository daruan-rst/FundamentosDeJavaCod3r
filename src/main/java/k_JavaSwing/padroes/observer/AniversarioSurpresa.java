package k_JavaSwing.padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        Porteiro porteiro = new Porteiro();

        Namorada namorada = new Namorada();
        porteiro.registrarObservadores(namorada);

        porteiro.registrarObservadores(e -> {
            System.out.println("Surpresa via lambda!");
            System.out.println("Ococreeu em: " + e.getMomento());
        });

        porteiro.monitorar();
    }
}
