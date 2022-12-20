package h_TratamentoDeErros.personalizadaA;

public class StringVaziaException extends RuntimeException{

    public String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);
    }
}
