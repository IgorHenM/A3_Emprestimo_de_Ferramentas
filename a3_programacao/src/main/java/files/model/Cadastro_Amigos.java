
package files.model;
import files.DAO.CadastroAmigoDAO;
import javax.swing.JOptionPane;


public class Cadastro_Amigos extends CadastroAmigoDAO{

    /**
     * Atributos
     */
    private String nome;
    private String fone;

    //1
    public Cadastro_Amigos(){
        this(null,null);
    }
                //1 e 2 são construtores
    //2
    public Cadastro_Amigos(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    /**
     * Método de retorno do nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de retorno do fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * Método de inserção do nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de inserção do fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Método responsável por avaliar so atributos recebidos para cadastro de amigos e chamar o método de cadastro
     */
    public void cadastrarAmigos() {
        if (!getNome().equals(null) && !getFone().equals(null) && !getNome().isEmpty() && !getFone().isEmpty()) {
            CadastraAmigo(getNome(), getFone());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!");
        }
    }
    
}
