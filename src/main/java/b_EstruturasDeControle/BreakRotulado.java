package b_EstruturasDeControle;

public class BreakRotulado {
    // procedimento não aconselhável: vai acabar deixando o código ilegível e um pouco macarrônico ( como o uso de goto)
    public static void main(String[] args) {
        externo: for (int i = 0 ; i < 3 ; i++ ){
            for (int j = 0 ; j < 3 ; j++ ){
                if (i==1){
                    break externo;
                }
                System.out.printf("%d %d\n", i , j);
            }
        }
    }
}
