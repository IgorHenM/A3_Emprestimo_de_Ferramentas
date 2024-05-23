package files.DAO;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class PegarDadosFerramentas extends ConexaoDAO{
    Connection c = Conectar();

    /**
     * Método responsável por retornar o maior id da tabela ferramentas
     */
    public int getMaxId() {
        int MaxId = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MAX(id) FROM ferramentas");
            res.next();
            MaxId = res.getInt("MAX(id)");
            return MaxId;
        } catch (Exception e) {
            return MaxId;
        }
    }
    /**
     * Método para buscar o id passado como parâmetro
     */
    public int getId(int id) {
        int cod = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELLECT id FROM ferramentas WHERE id= "+id);
            res.next();
            cod = res.getInt("id");
            return cod;
        } catch (Exception e) {
            return cod;
        }
    }
}
