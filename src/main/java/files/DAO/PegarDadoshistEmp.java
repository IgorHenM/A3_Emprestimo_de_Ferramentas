        package files.DAO;

        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import java.util.ArrayList;
        import java.util.List;

        import files.model.histEmp;

        
        public class PegarDadoshistEmp extends ConexaoDAO { 
            private Connection c = Conectar(); //conexão com o bd
            
            //método para retornar a lista de empréstimo de um certo amigo
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
                    Statement st = c.createStatement(); //statement para executar a consulta (query)
                    ResultSet res = st.executeQuery(sql); //execução da consulta
                    while (res.next()) {
                        //criação de um objeto "emp" para cada informação retornada
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
                    e.printStackTrace(); //stacktrace para caso apresente erros
                }
                return emprestimos; //retorna a lista de empréstimos
            }
        }