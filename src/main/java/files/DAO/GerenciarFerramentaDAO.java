package files.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class GerenciarFerramentaDAO extends ConexaoDAO {
    private Connection c = Conectar();


    /**
     * Método responsável por modificar registro de uma determinada ferramenta
     * 
     * @param id Id da Ferramenta
     * @param nome Nome da Ferramenta
     * @param marca Marca da Ferramenta
     * @param custo Valor da Ferramenta
     */
    public void modificarFerramenta(int id, String nome, String marca, double custo) {
        String sql = "UPDATE ferramentas SET nome = ?, marca = ?, valor = ? WHERE id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, marca);
            ps.setDouble(3, custo);
            ps.setInt(4, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método responsável por modificar registro de uma determinada ferramenta
     * 
     * @param id Id da Ferramenta
     */
    public void deletarFerramenta(int id) {
        String sql = "DELETE FROM ferramentas WHERE id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
