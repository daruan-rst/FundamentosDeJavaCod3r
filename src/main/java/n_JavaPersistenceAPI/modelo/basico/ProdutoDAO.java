package n_JavaPersistenceAPI.modelo.basico;

import n_JavaPersistenceAPI.infra.DAO;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO(){
        super(Produto.class);
    }
}
