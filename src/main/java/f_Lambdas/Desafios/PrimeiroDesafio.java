package f_Lambdas.Desafios;

import f_Lambdas.Produto;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class PrimeiroDesafio {

    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
         * 3. Frete: >= 3000 (100)/ < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> applyDescount = p1 -> p1.getPreco() * (1 - p1.getDesconto());
        UnaryOperator<Double> applyTaxes = price -> price >= 2500 ? price * (1.085) : price;
        UnaryOperator<Double> applyDeliveryFee = price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> round = price -> {
            BigDecimal bd = new BigDecimal(price);
            return bd.round(new MathContext(2, RoundingMode.HALF_UP)).doubleValue();
        };
        Function<Double, String> format = price -> ("R$" + price.toString()).replace(".", ",");

        String finalPrice = applyDescount
                .andThen(applyTaxes)
                .andThen(applyDeliveryFee)
                .andThen(round)
                .andThen(format)
                .apply(p);

        System.out.println(finalPrice);
    }
}
