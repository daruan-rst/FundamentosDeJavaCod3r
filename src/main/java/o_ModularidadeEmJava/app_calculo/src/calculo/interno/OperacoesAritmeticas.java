package o_ModularidadeEmJava.app_calculo.src.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {

    public double soma(double... nums) {
        return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
    }
}