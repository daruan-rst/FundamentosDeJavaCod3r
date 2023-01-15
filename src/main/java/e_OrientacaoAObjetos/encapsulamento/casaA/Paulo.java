package e_OrientacaoAObjetos.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){
//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem

        //System.out.println(esposa.segredo);  // -> não pode ser acessado
        System.out.println(esposa.facoDentroDeCasa); // -> pode ser acessado por que é do mesmo pacote
        System.out.println(esposa.formaDeFalar); // -> pode ser acessado por que é do mesmo pacote
        System.out.println(esposa.todosSabem); // pode ser acessado por que é público

    }
}
