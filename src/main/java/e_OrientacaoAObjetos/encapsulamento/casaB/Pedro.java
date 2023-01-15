package e_OrientacaoAObjetos.encapsulamento.casaB;

import e_OrientacaoAObjetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos(){
//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem

        //System.out.println(mae.segredo);  // -> não pode ser acessado
        //System.out.println(mae.facoDentroDeCasa); // -> não pode ser acessado, já que não são do mesmo pacote
        //System.out.println(mae.formaDeFalar); // -> Apesar de ser um atributo herdado e que, portanto,
                                              // deveria ter acesso possível pelas classes filhas,
                                              // esse acesso não se dá pela instância, mas diretamente
        System.out.println(formaDeFalar); // pode ser acessado por ser um atributo protected de uma superclasse
        System.out.println(mae.todosSabem);   // pode ser acessado por que é público

    }
}
