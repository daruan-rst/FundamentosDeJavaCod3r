package e_OrientacaoAObjetos.encapsulamento;

public class Pessoa {

    private String nome;



    private String sobrenome;
    private int idade;
    public Pessoa(String nome,String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNomeCompleto()
                + " e tenho " + getIdade() + " anos.";
    }
}
