package h_TratamentoDeErros;

import h_TratamentoDeErros.personalizadaA.NumeroForaIntervaloException;
import h_TratamentoDeErros.personalizadaA.StringVaziaException;
import h_TratamentoDeErros.personalizadaA.Validar;

public class TesteValidacoes {

    public static void main(String[] args) {
        try{
            Aluno aluno =  new Aluno("Ana", 7);
            Validar.aluno(aluno);

            Validar.aluno(null);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        }catch (NumeroForaIntervaloException
                | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}
