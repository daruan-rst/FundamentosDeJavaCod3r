package a_Fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_787_103.01;

        //tipo booleano
        boolean estaDeFerias = false;
        char status = '1';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numeros de viagem
        System.out.println(numerosDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("Férias? " + estaDeFerias);



    }

}
