package a_Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("leo".toUpperCase());

        String y = "Bom dia X"
                        .replace("X", "GUI")
                        .toLowerCase()
                        .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."

    }
}
