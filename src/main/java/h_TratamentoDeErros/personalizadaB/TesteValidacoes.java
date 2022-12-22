package h_TratamentoDeErros.personalizadaB;

import h_TratamentoDeErros.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) throws NumeroForaIntervaloException, StringVaziaException {
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

        Validar.aluno(null);

        System.out.println("Fim :)");
    }
}
