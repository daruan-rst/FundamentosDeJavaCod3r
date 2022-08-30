package c_ClassesEMetodos.Desafios;

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
        return dd+"/"+mm+"/"+yyyy;
    }

    /**
     * Terceiro desafio: Criar construtores para a classe Data.Um deles deve aceitar todos os parâmetros;
     * o outro deve ser inicializado com a data 01/01/1970
     */

    Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int diaParametro, int mesParametro, int anoParametro){
        this.dia = diaParametro;
        this.mes = mesParametro;
        this.ano = anoParametro;
    }
}
