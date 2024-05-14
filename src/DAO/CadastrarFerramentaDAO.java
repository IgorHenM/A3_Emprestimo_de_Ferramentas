package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastrarFerramentaDAO extends Conexao{
    
    public void Cadastrar(String nome, String marca, float valor) {
        String sql = "INSERT INTO ferramentas(id, nome, marca, valor) VALUES (?,?,?,?)";
        Connection c = Conectar();
        PegarDadosFerramentas dados = new PegarDadosFerramentas();

        try {
            PreparedStatement st = c.prepareStatement(sql);
            st.setInt(1, dados.getMaxId() + 1);
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
