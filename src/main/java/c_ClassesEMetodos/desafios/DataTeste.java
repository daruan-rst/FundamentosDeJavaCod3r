package c_ClassesEMetodos.desafios;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();

        data.dia=23;
        data.mes=8;
        data.ano=2022;

        System.out.printf("A data é: %s", data.formatarData());

        Data data2 = new Data(4,9,2023);

        System.out.printf("\nA data é: %s", data2.formatarData());

    }
}
