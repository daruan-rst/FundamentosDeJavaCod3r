package n_JavaPersistenceAPI.teste.basico;

import n_JavaPersistenceAPI.infra.DAO;
import n_JavaPersistenceAPI.modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {
        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Caneta", 7.45);
        dao.abrirT().incluir(produto).fecharT().fechar();

        produto = new Produto("Notebook", 2987.78);
        dao.incluirAtomico(produto);

        produto = new Produto("Monitor", 789.98);
        dao.incluirAtomico(produto);
        System.out.println("ID do produto: " + produto.getId());


    }
}
