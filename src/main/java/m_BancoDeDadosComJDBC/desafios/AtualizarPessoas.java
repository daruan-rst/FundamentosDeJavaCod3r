package m_BancoDeDadosComJDBC.desafios;

import m_BancoDeDadosComJDBC.FabricaConexao;
import m_BancoDeDadosComJDBC.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoas {

    static  Scanner sc = new Scanner(System.in);

    static final String SELECT_SQL = "SELECT * FROM pessoas WHERE pessoas.codigo = ?";

    static final String UPDATE_SQL = "UPDATE pessoas SET pessoas.nome = ? WHERE pessoas.codigo = ?";


    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        int codigo = getCodigo();
        ResultSet pessoaSelecionada = searchForPerson(conexao, codigo);

        while (!pessoaSelecionada.next()) {
            System.out.println("Nenhuma pessoa foi encontrada com esse código. Quer tentar novamente? \n S/N");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("s")) {
                codigo = getCodigo();
                pessoaSelecionada = searchForPerson(conexao, codigo);
            }
            else if (opcao.equalsIgnoreCase("n")){
                System.exit(1);
            }
        }

        sc.nextLine();

        Pessoa pessoaAtualizar = new Pessoa(pessoaSelecionada.getInt("codigo"), pessoaSelecionada.getString("nome"));

        System.out.println(pessoaAtualizar.getCodigo() + " ===> " + pessoaAtualizar.getNome());

        String novoNome  = getNovoNome(pessoaAtualizar.getNome());

        boolean atualizado = updatePessoa(conexao, codigo, pessoaAtualizar, novoNome);

        String response = atualizado ?  "Aualizado com sucesso!\n Nome alterado de: " + pessoaAtualizar.getNome() + "\n  Para: " + novoNome :
                                        "Não foi possível atualizar " + pessoaAtualizar.getNome();

        System.out.println(response);

        conexao.close();
        sc.close();
    }

    private static boolean updatePessoa(Connection conexao, int codigo, Pessoa pessoaAtualizar, String novoNome) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement(UPDATE_SQL);
        stmt.setString(1,novoNome);
        stmt.setInt(2, codigo);
        boolean atualizado = stmt.execute();
        return atualizado;
    }

    private static String getNovoNome(String antigoNome) {
        System.out.println("Qual o novo nome que deseja alterar de " + antigoNome + "?");
        String novoNome = sc.nextLine();
        return novoNome;
    }

    private static ResultSet searchForPerson(Connection conexao, int codigo) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement(SELECT_SQL);
        stmt.setInt(1,codigo);
        ResultSet pessoaSelecionada = stmt.executeQuery();
        return pessoaSelecionada;
    }

    private static int getCodigo() {
        System.out.println("Qual o código da pessoa que você deseja atualizar? ");
        int codigo = sc.nextInt();
        return codigo;
    }
}
