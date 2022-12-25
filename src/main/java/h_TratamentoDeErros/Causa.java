package h_TratamentoDeErros;

public class Causa {

    public static void main(String[] args) {
        try{

        }catch(IllegalArgumentException e){
            if (e.getCause() == null){
                System.out.println(e.getCause().getMessage());
            }
        }
    }

    static void metodoA(Aluno aluno){
        try{
            metodoB(aluno);
        }catch(Exception causa){
           throw new IllegalArgumentException(causa);
        }

    }

    private static void metodoB(Aluno aluno) {
        if (aluno == null){
            throw new NullPointerException("Aluno está NULLLOOOO!!!!");
        }

        System.out.println(aluno.nome);
    }

}
