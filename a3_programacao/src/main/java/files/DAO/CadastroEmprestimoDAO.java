package files.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroEmprestimoDAO extends ConexaoDAO {
    private Connection c = Conectar();
    private PegarDadosEmprestimos dados = new PegarDadosEmprestimos();
    private PegarDadosAmigos ams = new PegarDadosAmigos();

    /**
     * Método responsável por registrar empréstimos no banco de dados
     * 
     * @param idAmigo Id do Amigo
     * @param idFerramenta Id da Ferramenta
     * @param data Data do Empréstimo
     */
    public void Cadastrar(int idAmigo, int idFerramenta, String data) {
        String sql = "INSERT INTO emprestimos(id,id_amigo,id_ferramenta,data_emp,data_conc,ativo) VALUES(?,?,?,?,?,?)";
        int id = dados.getMaxId() + 1;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, idAmigo);
            ps.setInt(3, idFerramenta);
            ps.setString(4, data);
            ps.setString(5, "--------");
            ps.setBoolean(6, true);
            ps.execute();
            changeStats(idFerramenta);
            changeEmprestimosAmigo(idAmigo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param idFerramenta
     * Método responsável por deixar uma ferramenta recem emprestada, com status de indisponivel.
     */
    public void changeStats(int idFerramenta) {
        String sql = "UPDATE ferramentas SET stats = ? where id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, "indisponivel");
            ps.setInt(2, idFerramenta); 
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @param id
     * Método responsável por aumentar o número de empréstimos de um determinado amigo no momento em que uma ferramenta é emprestada a ele.
     */
    public void changeEmprestimosAmigo(int id) {
        String sql = "UPDATE amigos SET emprestimos = ? WHERE id = ?";
        int emps = ams.getEmprestimos(id) + 1;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, emps);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
