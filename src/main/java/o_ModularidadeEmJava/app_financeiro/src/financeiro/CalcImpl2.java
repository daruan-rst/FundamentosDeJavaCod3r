package o_ModularidadeEmJava.app_financeiro.src.financeiro;

import java.util.Arrays;

public class CalcImpl2 implements Calc {
    @Override
    public double soma(double... nums) {
        return Arrays.stream(nums).reduce(0.0, (t,a) -> t + a );
    }
}
