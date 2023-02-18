package m_BancoDeDadosComJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao(){
        try {
            final String stringDeConexao = "jdbc:mysql://localhost:3307/curso_java?verifyServerCertificate=false&useSSL=true";
            final String usuario = "root";
            final String senha = "root";

            return DriverManager.getConnection(stringDeConexao, usuario, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
