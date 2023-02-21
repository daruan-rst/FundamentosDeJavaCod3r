package m_BancoDeDadosComJDBC.desafios;

import m_BancoDeDadosComJDBC.FabricaConexao;
import m_BancoDeDadosComJDBC.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        Scanner entrada = new Scanner(System.in);

        String nomeLike = entrada.nextLine();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%" + nomeLike + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();
        while(resultado.next()){
            String nome = resultado.getString("nome");
            int codigo = resultado.getInt("codigo");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas ) {
            System.out.println(p.getCodigo() + " -> " + p.getNome());
        }


        entrada.close();
        conexao.close();
    }
}
