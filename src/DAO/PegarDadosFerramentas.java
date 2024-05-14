package DAO;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class PegarDadosFerramentas extends Conexao{
    Connection c = Conectar();

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
}
