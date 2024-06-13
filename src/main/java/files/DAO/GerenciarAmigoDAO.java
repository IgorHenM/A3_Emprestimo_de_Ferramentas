package files.DAO;
import java.sql.PreparedStatement;

import java.sql.Connection;

public class GerenciarAmigoDAO extends ConexaoDAO {
    private Connection c = Conectar();

    /**
     * Método responsável por atualizar informações do registro de um determinado amigo
     * 
     * @param id
     * @param nome
     * @param fone
     */
    public void modificarAmigo(int id, String nome, String fone) {
        String sql = "UPDATE amigos SET nome = ?, fone = ? WHERE id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método responsável por deletar registro de um determinado amigo
     * 
     * @param id Id do Amigo
     */
    public void deletarAmigo(int id) {
        String sql = "DELETE FROM amigos WHERE id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
