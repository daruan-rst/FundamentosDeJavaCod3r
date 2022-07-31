package a_Fundamentos;


public class Wrappers {
    // Embrulho; Algo que envolve/empacota ; invólucro
    // Uma classe que acaba envolvendo um tipo primitivo

    public static void main(String[] args) {

        //byte;
        Byte b = 1;
        Short s = 1000;
        Integer i = Integer.parseInt("10000");
        Long l = 100000L;

        // Agora é possível que se utilize alguma manipulação aos tipos primitivos
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);

        Float f = 123.01F;

        Double d = 1234.5678;

        System.out.println(f);
        System.out.println(d);


        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c.toString());

    }


}
