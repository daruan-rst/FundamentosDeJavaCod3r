package b_EstruturasDeControle;

public class Continue {

    /**
     * O break interrompe a execução do laço de repetição
     * O continue interrompe a execução da iteração daquele laço, mas da continuidade à próxima
     */

    public static void main(String[] args) {
        for (int i = 1; i<=10 ; i++){
            if (i%2 == 1){
                continue;
            }
            System.out.println(i);
        }


        for (int i = 1; i<=10 ; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
