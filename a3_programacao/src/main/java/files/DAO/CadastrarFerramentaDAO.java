package files.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastrarFerramentaDAO extends ConexaoDAO{
    /**
     * Método responsável por cadastar ferramenta no banco de dados
     */
    public void Cadastrar(String nome, String marca, float valor) {
        String sql = "INSERT INTO ferramentas(id, nome, marca, valor) VALUES (?,?,?,?)";//comando sql
        Connection c = Conectar();
        PegarDadosFerramentas dados = new PegarDadosFerramentas();

        try {
            int id = dados.getMaxId() + 1;//id da ferramenta que será criada
            PreparedStatement st = c.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, nome);
            st.setString(3, marca);
            st.setFloat(4, valor);
            st.execute();
            JOptionPane.showMessageDialog(null, "Ferramenta cadastrada!");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
