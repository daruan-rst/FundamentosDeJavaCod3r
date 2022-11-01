package e_OrientacaoAObjetos.Abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Mamifero outroCachorro = new Cachorro();
        Cachorro yetAnotherCachorro = new Cachorro();

//        Animal animal = new Animal();         -> Classes abstratas não podem ser instanciadas
//        Mamifero mamifero = new Mamifero();   -> Classes abstratas não podem ser instanciadas

        System.out.println(cachorro.mover());
        System.out.println(cachorro.respirar());
//        System.out.println(cachorro.mamar()); -> o método mamar não existe nesse caso, já que a classe Animal nunca o define

        System.out.println(outroCachorro.mover());
        System.out.println(outroCachorro.respirar());
        System.out.println(outroCachorro.mamar());

}}
