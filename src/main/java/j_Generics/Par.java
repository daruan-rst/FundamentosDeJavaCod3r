package j_Generics;

public class Par<C, V> {

    private C chave;

    private V valor;

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public Par() {

    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return chave.equals(par.chave);
    }

    @Override
    public int hashCode() {
        return chave.hashCode();
    }

}
