package m_BancoDeDadosComJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection conexao;

    public int incluir(String sql, Object... atributos){
        try {
            PreparedStatement stms = getConexao().prepareStatement(
                                sql, PreparedStatement.RETURN_GENERATED_KEYS);
            if (stms.executeUpdate() > 0){
                ResultSet resultado = stms.getGeneratedKeys();

                if (resultado.next()){
                    return resultado.getInt(1);
                }
            }
            
            return -1;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo: atributos ) {
            if (atributo instanceof String){
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer){
                stmt.setInt(indice, (int) atributo);
            }
            indice++;
        }
    }

    private Connection getConexao() throws SQLException {
        try {
            if (conexao != null && conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {

        }
        conexao = FabricaConexao.getConexao();
        return conexao;
    }
}
