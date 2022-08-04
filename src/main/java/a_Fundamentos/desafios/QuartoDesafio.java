package a_Fundamentos.desafios;

//Desafio de operadores lógicos
public class QuartoDesafio {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean terca = headOrTails();
        boolean quinta = headOrTails();
        boolean sorvete = true;

        if(terca && quinta){
            System.out.println("YAY! Televisão de 50''");
        } else if (!terca && quinta)  {
            System.out.println("YAY! Televisão de 32''");
        } else if (terca && !quinta) { // Neste ponto, quinta sempre será false
            System.out.println("YAY! Televisão de 32''");
        } else {
            System.out.println("Não vai ser dessa vez que teremos uma televisão nova");
            sorvete = false;
        }
        if(sorvete){
            System.out.println("Tomamos sorvete");
        }

    }

    private static boolean headOrTails(){
        return Math.random() % 2 == 0;
    }
}
