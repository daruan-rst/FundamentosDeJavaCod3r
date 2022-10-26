package e_OrientacaoAObjetos.Encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro","Amoedo", -45);
        /**
         * Se idade é um atributo público, nada impede que qualquer
         * um instancie um valor que não faz sentido (como uma idade negativa)
         */
//        p1.idade = -30; // alterar o valor

//        System.out.println(p1.idade); // ler o valor

        System.out.println(p1.getIdade());

        p1.setIdade(-30);
        p1.setIdade(230);

        System.out.println(p1.getIdade());
        System.out.println(p1);

    }
}
