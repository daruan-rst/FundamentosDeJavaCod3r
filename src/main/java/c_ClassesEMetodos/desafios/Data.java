package c_ClassesEMetodos.desafios;

/**
 * Primeiro Desafio: Criar uma classe de data
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;

    /**
     * Segundo Desafio: fazer um método para retornar a data formatada
     */

    public String formatarData(){
        String dd = (dia < 10 ? "0" : "").concat(String.valueOf(dia));
        String mm = (mes < 10 ? "0" : "").concat(String.valueOf(mes));
        String yyyy = String.valueOf(ano);
         String formato = dd+"/"+mm+"/"+yyyy; // -> Variável local
//        final String formato = dd+"/"+mm+"/"+yyyy; // -> constante local
        return formato;
    }

    /**
     * Terceiro desafio: Criar construtores para a classe Data.Um deles deve aceitar todos os parâmetros;
     * o outro deve ser inicializado com a data 01/01/1970
     */

    public Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int diaParametro, int mesParametro, int anoParametro){
        dia = diaParametro;
        mes = mesParametro;
        ano = anoParametro;
    }
}
