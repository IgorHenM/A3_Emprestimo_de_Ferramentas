package files.DAO;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConexaoDAO {
    /**
     * Informações de configuração do banco de dados
     */
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "emprestimo_ferramentas";
    private String usuario = "root";
    private String senha = "thor";

    /**
     * Método de conexão ao banco de dados
     */
    public Connection Conectar() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            return c;
        } catch (Exception e) {
            return null;
        }
    }

}
