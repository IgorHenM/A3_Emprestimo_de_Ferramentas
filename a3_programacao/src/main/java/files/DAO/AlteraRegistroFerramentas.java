
package Gerenciamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlteraRegistroFerramentas {
    private String nome;
    private Double custo;
    private String marca;

    public AlteraRegistroFerramentas() {}

    public AlteraRegistroFerramentas(String nome, double custo, String marca) {
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public Double getCusto() {
        return custo;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void AtualizarRegistro(DatabaseManager emprestimo_ferramentas, int id) {
        String sql = "UPDATE ferramentas SET nome = ?, custo = ?, marca = ? WHERE id = ?";

        try (Connection conn = emprestimo_ferramentas.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, this.nome);
            pstmt.setDouble(2, this.custo);
            pstmt.setString(3, this.marca);
            pstmt.setInt(4, id);

           // int rowsAffected = pstmt.executeUpdate();
           // System.out.println("Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static class DatabaseManager {

        public DatabaseManager() {
        }

        private Connection getConnection() {
            throw new UnsupportedOperationException("Não suportado."); 
        }
    }
}
