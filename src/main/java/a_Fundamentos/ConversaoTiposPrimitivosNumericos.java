package a_Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; // conversão implícita de um inteiro para um double

        float b = (float) 1.0; // conversão explícita -> o tipo a ser convertido é explicitado entre parênteses

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);

    }
}
