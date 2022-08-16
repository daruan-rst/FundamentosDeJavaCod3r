package b_EstruturasDeControle.Desafios;

//Desafio For: Reproduzir, no console, o mesmo output do laço for das linhas 9-11 sem usar um valor numérico
public class QuartoDesafio {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i<=5 ; i++){
            System.out.println(valor);
            valor+="#";
        }

        System.out.println("Resposta");
        //Resposta
        for (String valor2 ="#" ; !valor2.equals("######") ; valor2+="#"){
            System.out.println(valor2);
        }
    }
}
