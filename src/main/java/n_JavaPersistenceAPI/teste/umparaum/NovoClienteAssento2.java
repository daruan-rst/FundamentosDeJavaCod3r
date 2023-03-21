package n_JavaPersistenceAPI.teste.umparaum;

import n_JavaPersistenceAPI.infra.DAO;
import n_JavaPersistenceAPI.modelo.umpraum.Assento;
import n_JavaPersistenceAPI.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);

    }
}
