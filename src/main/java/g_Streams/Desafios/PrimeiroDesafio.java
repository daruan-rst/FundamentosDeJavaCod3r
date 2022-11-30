package g_Streams.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *              Desafio Map
 * 1. Número para String Binária ... 6 => "110"
 * 2. Reverter a String ... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 */
public class PrimeiroDesafio {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        UnaryOperator<String> reverse = (s -> {
            char ch;
            String reversed = "";
            for (int i = 0 ; i<s.length() ; i++){
                ch = s.charAt(i);
              reversed = ch + reversed;
            }
            return reversed;
        });

       nums =  nums.stream().map(Integer::toBinaryString)
                            .map(reverse)
                            .map(s->Integer.parseInt(s,2))
                            .toList();

        System.out.println(nums);
    }

}
