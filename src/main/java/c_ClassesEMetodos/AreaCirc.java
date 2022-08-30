package c_ClassesEMetodos;

public class AreaCirc {

    static double pi = 3.14;
    double raio;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }


    public double area(){
        return pi * Math.pow(raio,2);
    }

    static public double area(double raio){
        return pi * Math.pow(raio,2);
    }

}
