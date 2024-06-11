package files.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastrarFerramentaDAO extends ConexaoDAO{
    /**
     * Método responsável por Registrar ferramenta no banco de dados
     * 
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param valor Valor da ferramenta
     */
    public void Cadastrar(String nome, String marca, double valor) {
        String sql = "INSERT INTO ferramentas(id, nome, marca, valor, stats) VALUES (?,?,?,?,?)";//comando sql
        Connection c = Conectar();
        PegarDadosFerramentas dados = new PegarDadosFerramentas();

        try {
            int id = dados.getMaxId(null) + 1;//id da ferramenta que será criada
            PreparedStatement st = c.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, nome);
            st.setString(3, marca);
            st.setDouble(4, valor);
            st.setString(5,"disponivel");
            st.execute();
            JOptionPane.showMessageDialog(null, "Ferramenta cadastrada!");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
