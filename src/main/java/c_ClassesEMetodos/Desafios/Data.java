package c_ClassesEMetodos.Desafios;

/**
 * Desafio: Criar uma classe de data
 */
public class Data {
    int dia;
    int mes;
    int ano;

    /**
     * Desafio: fazer um método para retornar a data formatada
     */

    private String formatarData(){
        String dd = (dia < 10 ? "0" : "").concat(String.valueOf(dia));
        String mm = (mes < 10 ? "0" : "").concat(String.valueOf(mes));
        String yyyy = String.valueOf(ano);
        return dd+"/"+mm+"/"+yyyy;
    }
}
