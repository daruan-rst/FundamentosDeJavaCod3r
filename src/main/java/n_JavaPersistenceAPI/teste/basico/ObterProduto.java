package n_JavaPersistenceAPI.teste.basico;

import n_JavaPersistenceAPI.modelo.basico.Produto;
import n_JavaPersistenceAPI.modelo.basico.ProdutoDAO;

import java.util.List;

public class ObterProduto {

    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto: produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: "
                    + produto.getNome());
        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0,(t,p) -> t + p)
                .doubleValue();

        System.out.println("O valor total é R$" + precoTotal);

        dao.fechar();
    }
}
