package files.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ConcluirEmprestimoDAO extends ConexaoDAO {
    private Connection c = Conectar();
    /**
     * Método responsável por concluir um empréstimo
     * 
     * @param id Id do Empréstimo
     * @param data Data de conclusão do empréstimo
     * @param idFerramenta Id da Ferramenta
     */
    public void Concluir(int id, String data, int idFerramenta) {
        String sql = "UPDATE emprestimos SET data_conc = ?, ativo = ? WHERE id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, data);
            ps.setBoolean(2, false);
            ps.setInt(3, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        changeStats(idFerramenta);
    }
    /**
     * Método responsável por alterar o status da ferramenta como disponivel após a conclusão do empréstimo
     * 
     * @param id Id da Ferramenta
     */
    public void changeStats(int id) {
        String sql = "UPDATE ferramentas SET stats = ? WHERE id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, "disponivel");
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
