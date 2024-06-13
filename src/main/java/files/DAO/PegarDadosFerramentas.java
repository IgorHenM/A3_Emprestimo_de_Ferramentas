package files.DAO;

import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PegarDadosFerramentas extends ConexaoDAO {
    private Connection c = Conectar();

    public int getCount(String condition) {
        int count = 0;

        if (condition == null || condition.equals("")) {
            try {
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT COUNT(id) FROM ferramentas");
                res.next();
                count = res.getInt("COUNT(id)");
                return count;
            } catch (Exception e) {
                return count;
            }
        } else {
            String sql = "SELECT COUNT(id) FROM ferramentas WHERE stats = ?";
            try {
                PreparedStatement st = c.prepareStatement(sql);
                st.setString(1, condition);
                ResultSet res = st.executeQuery();
                res.next();
                count = res.getInt("COUNT(id)");
                return count;
            } catch (Exception e) {
                return count;
            }
        }
    }


    /**
     * Método responsável por retornar o maior id da tabela ferramentas
     */
    public int getMaxId(String condition) {
        int MaxId = 0;
        
        if (condition == null || condition.equals("")) {
            try {
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT MAX(id) FROM ferramentas");
                res.next();
                MaxId = res.getInt("MAX(id)");
                return MaxId;
            } catch (Exception e) {
                return MaxId;
            }
        } else {
            String sql = "SELECT MAX(id) FROM ferramentas WHERE stats = ?";
            try {
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1, condition);
                ResultSet res = ps.executeQuery();
                res.next();
                MaxId = res.getInt("MAX(id)");
                return MaxId;
            } catch (Exception e) {
                return MaxId;
            }
        }
    }

    public int getMinId(String condition) {
        int MinId = 0;
        
        if (condition == null || condition.equals("")) {
            try {
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT MIN(id) FROM ferramentas");
                res.next();
                MinId = res.getInt("MIN(id)");
                return MinId;
            } catch (Exception e) {
                return MinId;
            }
        } else {
            String sql = "SELECT MIN(id) FROM ferramentas WHERE stats = ?";
            try {
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1, condition);
                ResultSet res = ps.executeQuery();
                res.next();
                MinId = res.getInt("MIN(id)");
                return MinId;
            } catch (Exception e) {
                return MinId;
            }
        }
    }

    /**
     * Método para buscar o id passado como parâmetro
     */
    public int getId(int id, String condition) {
        int cod = 0;
        if (condition == null || condition.equals("")) {
            try {
                Statement st = c.createStatement();
                ResultSet res = st.executeQuery("SELECT id FROM ferramentas WHERE id = " + id);
                res.next();
                cod = res.getInt("id");
                return cod;
            } catch (Exception e) {
                return cod;
            }
        } else {
            String sql = "SELECT id FROM ferramentas WHERE id = ? AND stats = ?";
            try {
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setString(2, condition);
                ResultSet res = ps.executeQuery();
                res.next();
                cod = res.getInt("id");
                return cod;
            } catch (Exception e) {
                return cod;
            }
        }
    }

    public String getNome(int id) {
        String nome = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT nome FROM ferramentas WHERE id = " + id);
            res.next();
            nome = res.getString("nome");
            return nome;
        } catch (Exception e) {
            return nome;
        }
    }

    public String getMarca(int id) {
        String marca = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT marca FROM ferramentas WHERE id = " + id);
            res.next();
            marca = res.getString("marca");
            return marca;
        } catch (Exception e) {
            return marca;
        }
    }

    public double getCusto(int id) {
        double custo = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT valor FROM ferramentas WHERE id = " + id);
            res.next();
            custo = res.getDouble("valor");
            return custo;
        } catch (Exception e) {
            return custo;
        }
    }

    public String getStatus(int id) {
        String status = null;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT stats FROM ferramentas WHERE id = " + id);
            res.next();
            status = res.getString("stats");
            return status;
        } catch (Exception e) {
            return status;
        }
    }

    public double getCustoTotal() {
        double total = 0;
        try {
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT SUM(valor) FROM ferramentas");
            res.next();
            total = res.getDouble("SUM(valor)");
            return total;
        } catch (Exception e) {
            return total;
        }
    }
}
