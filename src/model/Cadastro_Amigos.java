
package model;
import DAO.CadastroAmigoDAO;
import javax.swing.JOptionPane;


public class Cadastro_Amigos extends CadastroAmigoDAO{
    private String nome;
    private String fone;

    
    public Cadastro_Amigos(){
        this(null,null);
    }
    
    public Cadastro_Amigos(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void cadastrarAmigos() {
        if (!getNome().equals(null) && !getFone().equals(null) && !getNome().isEmpty() && !getFone().isEmpty()) {
            CadastraAmigo(getNome(), getFone());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!");
        }
    }
    
}
