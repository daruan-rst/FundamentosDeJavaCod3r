package a_Fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        num1.toString();
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        // -> O java sabe interpretar que o resultado disso
        // é uma String, mas sinceramente isso é uma gambiarra
        System.out.println(("" + num2).length());
    }
}
