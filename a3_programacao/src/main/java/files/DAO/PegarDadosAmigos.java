package files.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class PegarDadosAmigos extends ConexaoDAO{
    Connection c = Conectar();

    public int getMaxId() {
        int maxid = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MAX(id) FROM amigos");
            res.next();
            maxid = res.getInt("MAX(id)");
            return maxid;
        } catch (Exception e) {
            return maxid;
        }
    }
}
