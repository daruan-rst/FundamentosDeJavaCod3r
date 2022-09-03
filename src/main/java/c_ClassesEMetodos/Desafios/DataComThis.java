package c_ClassesEMetodos.Desafios;

public class DataComThis {
    public int dia;
    public int mes;
    public int ano;

    /**
     * this() pode ser chamado como uma função para poder chamar outro construtor dentro da classe
     * nesse caso, this() é passado como método
     * o que vai determinar qual construtor é chamado vai ser a quantidade e/ou a ordem dos parâmetros
     */

    DataComThis(){
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1,1970);
    }

    /**
     * this é a palavra chave em java para acessar a variável de instância
     * this referencia o objeto atual
     */
    public DataComThis(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Como o método formatarData() é um método de instância (não é static)
     * as variáveis de instância dia, mes e ano podem ser acessadas através de this. (objeto atual)
     * O código do método abaixa sempre será executado através de uma instância -
     * e é exatamente essa instância (que chamou esse método) que apontará a esse this.dia
     */
    public String formatarData(){
        String dd = (this.dia < 10 ? "0" : "").concat(String.valueOf(this.dia));
        String mm = (this.mes < 10 ? "0" : "").concat(String.valueOf(this.mes));
        String yyyy = String.valueOf(this.ano);
        return dd+"/"+mm+"/"+yyyy;
    }

    /**
     * Métodos static existem associados à classe
     * this é uma das instâncias da classe
     */
    static void teste(){
//        this.dia = 3; -> sentença inválida dentro de métodos static
    }

}
