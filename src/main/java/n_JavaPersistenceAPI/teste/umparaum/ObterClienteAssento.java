package n_JavaPersistenceAPI.teste.umparaum;

import n_JavaPersistenceAPI.infra.DAO;
import n_JavaPersistenceAPI.modelo.umpraum.Assento;
import n_JavaPersistenceAPI.modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());

        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Assento assento = daoAssento.obterPorID(4L);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
