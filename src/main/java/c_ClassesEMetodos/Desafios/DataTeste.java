package c_ClassesEMetodos.Desafios;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();

        data.dia=23;
        data.mes=8;
        data.ano=2022;

        System.out.printf("A data é: %d/%d/%d", data.dia,data.mes,data.ano);
    }
}
