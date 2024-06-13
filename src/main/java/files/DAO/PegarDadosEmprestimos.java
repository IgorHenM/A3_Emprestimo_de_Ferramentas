package files.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class PegarDadosEmprestimos extends ConexaoDAO {
    private Connection c = Conectar();

    /**
     * Método responsável por retornar o maior id registrado na tabela de
     * empréstimos
     * 
     * @return Retorna o maior id da tabela de empréstimos
     */
    public int getMaxId() {
        int MaxId = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MAX(id) FROM emprestimos");
            res.next();
            MaxId = res.getInt("MAX(id)");
            return MaxId;
        } catch (Exception e) {
            return MaxId;
        }
    }

    /**
     * Método responsável por pegar o maior id da tabela de empréstimos passando uma
     * condição booleana de atividade
     * 
     * @param stats Define a condição se for true significa que quer pegar o maior
     *              id dos empréstimos disponiveis caso for false, difinirá para
     *              busca de empréstimos concluídos
     * @return Retorna o maior id de acordo com oparâmetro passado
     */
    public int getMaxIdWithCondition(boolean stats) {
        String sql = "SELECT MAX(id) FROM emprestimos WHERE ativo = ?";
        int MaxId = 0;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setBoolean(1, stats);
            ResultSet res = ps.executeQuery();
            res.next();
            MaxId = res.getInt("MAX(id)");
            return MaxId;
        } catch (Exception e) {
            return MaxId;
        }
    }

    /**
     * Método responsável por retornar o menor id da tabela empréstimos
     * 
     * @return Retorna o menor id da tabela empréstimos
     */
    public int getMinId() {
        int MinId = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MIN(id) FROM emprestimos");
            res.next();
            MinId = res.getInt("MIN(id)");
            return MinId;
        } catch (Exception e) {
            return MinId;
        }
    }

    /**
     * Método responsável por retornar menor id passandouma condição
     * 
     * @param stats Condição de atividade do empréstimo
     * @return Retorna o menor id de acordo com a condição passada
     */
    public int getMinIdWithCondition(boolean stats) {
        String sql = "SELECT MIN(id) FROM emprestimos WHERE ativo = ?";
        int MinId = 0;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setBoolean(1, stats);
            ResultSet res = ps.executeQuery();
            res.next();
            MinId = res.getInt("MIN(id)");
            return MinId;
        } catch (Exception e) {
            return MinId;
        }
    }

    /**
     * Método responsável por retornar a contagem total registros da tabela
     * empréstimos
     * 
     * @return Retorna a contagem de empréstimos
     */
    public int getCount() {
        int count = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT COUNT(id) FROM emprestimos");
            res.next();
            count = res.getInt("COUNT(id)");
            return count;
        } catch (Exception e) {
            return count;
        }
    }

    /**
     * Método responsável por retornar a contagem total de ids da tabela empréstimos
     * passando uma condição
     * 
     * @param stats Condição a ser passada
     * @return Retorna o total de empréstimos de acordo com a condição
     */
    public int getCountWithCondition(boolean stats) {
        String sql = "SELECT COUNT(id) FROM emprestimos WHERE ativo = ?";
        int count = 0;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setBoolean(1, stats);
            ResultSet res = ps.executeQuery();
            res.next();
            count = res.getInt("COUNT(id)");
            return count;
        } catch (Exception e) {
            return count;
        }
    }

    /**
     * Método responsável por buscar o id de um empréstimo
     * 
     * @param id    Id a ser buscado
     * @param stats Atividade do empréstimo
     * @return Retorna o id buscado ou 0 se não for encontrado
     */
    public int getId(int id, boolean stats) {
        String sql = "SELECT id FROM emprestimos WHERE ativo = ? AND id = ?";
        int cod = 0;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setBoolean(1, stats);
            ps.setInt(2, id);
            ResultSet res = ps.executeQuery();
            res.next();
            cod = res.getInt("id");
            return cod;
        } catch (Exception e) {
            return cod;
        }
    }

    /**
     * Método responsável por buscar um id de um empréstimo
     * 
     * @param id Id a ser buscado
     * @return Retorna o id buscado ou 0 se não for encontrado
     */
    public int getIdNormal(int id) {
        int idNormal = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT id FROM emprestimos WHERE id = " + id);
            res.next();
            idNormal = res.getInt("id");
            return idNormal;
        } catch (Exception e) {
            return idNormal;
        }
    }

    /**
     * Método responsável por buscar id de um amigo em um empréstimo a partir doid
     * do empréstimo
     * 
     * @param id Id do empréstimo
     * @return Retorna o id doamigo associado ao empréstimo ou 0 se não for
     *         encontrado
     */
    public int getIdAmigo(int id) {
        int idAmigo = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT id_amigo FROM emprestimos WHERE id = " + id);
            res.next();
            idAmigo = res.getInt("id_amigo");
            return idAmigo;
        } catch (Exception e) {
            return idAmigo;
        }
    }

    /**
     * Método responsável por buscar o id de uma ferramenta associada a um
     * empréstimo
     * 
     * @param id Id do empréstimo
     * @return Retorna o id da ferramenta se o empréstimo existir
     */
    public int getIdFerramenta(int id) {
        int idFerramenta = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT id_ferramenta FROM emprestimos WHERE id = " + id);
            res.next();
            idFerramenta = res.getInt("id_ferramenta");
            return idFerramenta;
        } catch (Exception e) {
            return idFerramenta;
        }
    }

    /**
     * Método responsável obter o total de empréstimo que uma determinada ferramenta
     * está associada
     * 
     * @param idFerramenta Id ferramenta
     * @return Retorna o contagem total de empréstimos com a ferramenta associada
     */
    public int getFerramentaEmp(int idFerramenta) {
        int contagem = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT count(id) FROM emprestimos WHERE id_ferramenta = " + idFerramenta);
            res.next();
            contagem = res.getInt("count(id)");
            return contagem;
        } catch (Exception e) {
            return contagem;
        }
    }

    /**
     * Método responsável por buscar a contagem total de empréstimos com uma determinado amigo
     * 
     * @param idAmigo Id do Amigo
     * @return Retorna a contagem de emmpréstimos com amigo associado
     */
    public int getAmigoEmp(int idAmigo) {
        int contagem = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT count(id) FROM emprestimos WHERE id_amigo = " + idAmigo);
            res.next();
            contagem = res.getInt("count(id)");
            return contagem;
        } catch (Exception e) {
            return contagem;
        }
    }
    /**
     * Método responsável por obter a data de um determinado empréstimo
     * 
     * @param id Id do empréstimo
     * @return Retorna a data de um determinado empréstimo
     */
    public String getDataEmprestimo(int id) {
        String data = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT data_emp FROM emprestimos WHERE id = " + id);
            res.next();
            data = res.getString("data_emp");
            return data;
        } catch (Exception e) {
            return data;
        }
    }
    /**
     * Método responsável por obter a data de conclusão de um determinado empréstimo
     * 
     * @param id Id do empréstimo
     * @return Retorna a data de conclusão de um determinado empréstimo
     */
    public String getDataConc(int id) {
        String dataConclusao = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT data_conc FROM emprestimos WHERE id = " + id);
            res.next();
            dataConclusao = res.getString("data_conc");
            return dataConclusao;
        } catch (Exception e) {
            return dataConclusao;
        }
    }

    /**
     * Retorna o status de atividade de um empréstimo
     * 
     * @param id id do empréstimo
     * @return Retorna atividade do empréstimo
     */
    public boolean getAtivo(int id) {
        boolean ativo = true;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT ativo FROM emprestimos WHERE id = " + id);
            res.next();
            ativo = res.getBoolean("ativo");
            return ativo;
        } catch (Exception e) {
            return ativo;
        }
    }

    /**
     * Método responsável por retornar a quantidade de empréstimos que um amigo está associado
     * 
     * @param idAmigo id do Amigo
     * @return Retorna o número de empréstimos que o amigo está  associado
     */
    public int pegarQuantidadedeEmpsAmigo(int idAmigo) {
        String sql = "SELECT count(id) FROM emprestimos WHERE id_amigo = ? AND ativo = ?";
        int quant = 0;
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, idAmigo);
            ps.setBoolean(2, true);
            ResultSet res = ps.executeQuery();
            res.next();
            quant = res.getInt("count(id)");
            return quant;
        } catch (Exception e) {
            return quant;
        }
    }

}
