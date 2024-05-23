package files.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class CadastroAmigoDAO extends ConexaoDAO{
    
    /**
     * Método responsável por cadastrar amigo no banco de dados
     */
    public void CadastraAmigo(String nome, String fone) {
        String sql = "INSERT INTO amigos(id,nome,fone) VALUES(?,?,?)";
        Connection c = Conectar();
        PegarDadosAmigos max = new PegarDadosAmigos();

        try {
            int id = max.getMaxId() + 1;//id do amigo que será criado
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nome);
            ps.setString(3, fone);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Amigo não cadastrado!");
        }
    }
}
