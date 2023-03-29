package n_JavaPersistenceAPI.teste.umpramuitos;

import n_JavaPersistenceAPI.infra.DAO;
import n_JavaPersistenceAPI.modelo.umpramuitos.ItemPedido;
import n_JavaPersistenceAPI.modelo.umpramuitos.Pedido;

public class ObterPedidos {

    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);
//        dao.fechar();  -> Se o pedido não estiver como Lazy então gerará uma LazyInitializationException ->

        for (ItemPedido item : pedido.getItens()){
            System.out.println(item.getQuantidade());
            item.getProduto().getNome();
        }

        dao.fechar();
    }
}
