package h_TratamentoDeErros.personalizadaB;

public class NumeroForaIntervaloException extends Exception{

    public String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
    }
}
