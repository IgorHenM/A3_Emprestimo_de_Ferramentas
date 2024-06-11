        package files.DAO;

        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import java.util.ArrayList;
        import java.util.List;

        import files.model.histEmp;


        public class PegarDadoshistEmp extends ConexaoDAO { 
            private Connection c = Conectar();
            

            public List<histEmp> getEmprestimos(int idAmigo) {
                List<histEmp> emprestimos = new ArrayList<>();
                String sql = "SELECT emprestimos.id AS idEmprestimo, " +
                "emprestimos.ativo AS atvEmprestimo, " +
                "amigos.id AS idAmigo, amigos.nome AS nomeAmigo, " +
                "ferramentas.id AS idFerramenta, ferramentas.nome AS nomeFerramenta " +
                "FROM emprestimos " +
                "JOIN amigos ON emprestimos.id_amigo = amigos.id " +
                "JOIN ferramentas ON emprestimos.id_ferramenta = ferramentas.id " +
                "WHERE amigos.id = " + idAmigo;
                try {
                    Statement st = c.createStatement();
                    ResultSet res = st.executeQuery(sql);
                    while (res.next()) {
                        histEmp emp = new histEmp();
                        emp.setIdAmigo(res.getInt("idAmigo"));
                        emp.setIdFerramenta(res.getInt("idFerramenta"));
                        emp.setAmigo(res.getString("nomeAmigo"));
                        emp.setFerramenta(res.getString("nomeFerramenta"));
                        emp.setIdEmprestimo(res.getString("idEmprestimo"));;
                        emp.setAtvEmprestimo(res.getBoolean("atvEmprestimo"));
                        emprestimos.add(emp);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return emprestimos;
            }
        }