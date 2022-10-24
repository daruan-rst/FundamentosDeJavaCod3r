package e_OrientacaoAObjetos.Encapsulamento.casaB;

import e_OrientacaoAObjetos.Encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos(){
//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem

        //System.out.println(sogra.segredo);          // -> não pode ser acessado
        //System.out.println(sogra.facoDentroDeCasa); // -> não /pode ser acessado por que não comungam do mesmo pacote
        //System.out.println(sogra.formaDeFalar);     // -> não pode ser acessado pode por não serem do mesmo pacote
        //System.out.println(formaDeFalar);           // -> não podem ser acessado dessa maneira por que não é uma subclasse
        System.out.println(sogra.todosSabem);         // pode ser acessado por que é público

    }
}
