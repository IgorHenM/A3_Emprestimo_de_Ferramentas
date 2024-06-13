package files.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PegarDadosAmigos extends ConexaoDAO {
    private Connection c = Conectar();

    /**
     * Método responsável por pegar a contagem total de Amigos registrados
     * 
     * @return Retornará a contagem total de amigos registrados
     */
    public int getCount() {
        int count = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT COUNT(id) FROM amigos");
            res.next();
            count = res.getInt("COUNT(id)");
            return count;
        } catch (Exception e) {
            return count;
        }
    }

    /**
     * Método responsável por pegar o maior id da tabela amigos
     * 
     * @return Retorna o Maior id dos registros de amigo
     */
    public int getMaxId() {
        int maxId = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MAX(id) FROM amigos");
            res.next();
            maxId = res.getInt("MAX(id)");
            return maxId;
        } catch (Exception e) {
            return maxId;
        }
    }
    /**
     * Método responsável por pegar o menor id da tabela de amigos
     * 
     * @return Retorna o menor id da tabela de amigos
     */
    public int getMinId() {
        int minId = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MIN(id) FROM amigos");
            res.next();
            minId = res.getInt("MIN(id)");
            return minId;
        } catch (Exception e) {
            return minId;
        }
    }

    /**
     * Método responsável por buscar o id do amigo
     * 
     * @param id Id do Amigo
     * @return Retorna um número inteiro igual ao digitado se o id for encontrado senão, retorna 0
     */
    public int getId(int id) {
        int cod = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT id FROM amigos WHERE id = " + id);
            res.next();
            cod = res.getInt("id");
            return cod;
        } catch (Exception e) {
            return cod;
        }
    }

    /**
     * Método responsável por buscar o Nome de um determinado amigo
     * 
     * @param id Id do amigo
     * @return Retorna o nome do amigo se for encontrado senão, retorna null
     */
    public String getNome(int id) {
        String nome = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT nome FROM amigos WHERE id = " + id);
            res.next();
            nome = res.getString("nome");
            return nome;
        } catch (Exception e) {
            return nome;
        }
    }
    /**
     * Método responsável por buscar o telefone de um determinado amigo
     * 
     * @param id Id do amigo
     * @return Retorna o Telefone do amigo se for encontrado senão, retorna null
     */
    public String getFone(int id) {
        String fone = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT fone FROM amigos WHERE id = " + id);
            res.next();
            fone = res.getString("fone");
            return fone;
        } catch (Exception e) {
            return fone;
        }
    }


    /**
     * Método responsável por buscar o número de empréstimos de um determinado amigo
     * 
     * @param id Id do amigo
     * @return Retorna o número de emprestimos do amigo se for encontrado senão, retorna 0
     */
    public int getEmprestimos(int id) {
        int emprestimos = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT emprestimos FROM amigos WHERE id = " + id);
            res.next();
            emprestimos = res.getInt("emprestimos");
            return emprestimos;
        } catch (Exception e) {
            return emprestimos;
        }
    }

    /**
     * Método responsável por retonar o Maior número de empréstimos da tabela amigo
     * 
     * @return Retorna o maior número de empréstimos da tabela de amigos
     */
    public int getMaxEmprestimo() {
        int emprestimo = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT MAX(emprestimos) FROM amigos");
            res.next();
            emprestimo = res.getInt("MAX(emprestimos)");
            return emprestimo;
        } catch (Exception e) {
            return emprestimo;
        }
    }

    /**
     * Método responsável por retornar o nome do amigo com o maior número de empréstimos
     * 
     * @return Retorna o nome do amigo com mais empréstimos
     */
    public String getNomeMaxEmprestimo() {
        String nome = null;
        int emprestimo = getMaxEmprestimo();
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT nome FROM amigos WHERE emprestimos = " + emprestimo);
            res.next();
            nome = res.getString("nome");
            return nome;
        } catch (Exception e) {
            return nome;
        }
    }

    /**
     * Método responsável por retornar o Id do amigo com maior número de empréstimos
     * 
     * @return Retorna o Id do amigo com mais empréstimos
     */
    public int getIdMaxEmprestimo() {
        int id = 0;
        int emprestimo = getMaxEmprestimo();
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT id FROM amigos WHERE emprestimos = " + emprestimo);
            res.next();
            id = res.getInt("id");
            return id;
        } catch (Exception e) {
            return id;
        }
    }
    
}
