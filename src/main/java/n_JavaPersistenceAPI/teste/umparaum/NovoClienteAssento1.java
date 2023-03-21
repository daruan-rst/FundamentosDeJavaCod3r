package n_JavaPersistenceAPI.teste.umparaum;

import n_JavaPersistenceAPI.infra.DAO;
import n_JavaPersistenceAPI.modelo.umpraum.Assento;
import n_JavaPersistenceAPI.modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("23F");
        Cliente cliente = new Cliente("Bia", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(assento)
                .incluir(cliente)
                .fecharT()
                .fechar();

    }
}
