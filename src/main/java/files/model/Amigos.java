
package files.model;

/*
 * IMportação da DAO para conversação com o BD e Swing para 
 */
import files.DAO.CadastroAmigoDAO;
import files.DAO.PegarDadosAmigos;
import files.DAO.PegarDadosEmprestimos;
import files.DAO.GerenciarAmigoDAO;
import javax.swing.JOptionPane;

public class Amigos extends CadastroAmigoDAO {
    /**
     * Atributos para retornar os dados dos amigos, gerenciar amigos e empréstimos
     */
    private PegarDadosAmigos am1 = new PegarDadosAmigos();
    private GerenciarAmigoDAO modAmigo = new GerenciarAmigoDAO();
    private PegarDadosEmprestimos dadosEmp = new PegarDadosEmprestimos();

    private int id;
    private String nome;
    private String fone;

    // 1
    public Amigos() {
        this(null, null, 0);
    }

    // 1 e 2 são construtores
    // 2
    public Amigos(String nome, String fone, int id) {
        this.nome = nome;
        this.fone = fone;
        this.id = id;
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

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }
    public int getMaxIdLength() {
        int MaxId = am1.getMaxId();
        String maxid = MaxId + "";

        return maxid.length();
    }
    /**
     * Método responsável por avaliar so atributos recebidos para cadastro de amigos
     * e chamar o método de cadastro
     */

    public void cadastrarAmigos() {
        if (!getNome().equals(null) && !getFone().equals(null) && !getNome().isEmpty() && !getFone().isEmpty()) {
            CadastraAmigo(getNome(), getFone());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!");
        }
    }


    /*
     * método para pegar dados dos amigos e aplicar em uma array
     */
    public String[] pegarDadosAmigoArray() {
        int count = am1.getCount(); //número de amigos cadastrados
        int minId = am1.getMinId(); //id mínimo de amigo
        String[] dadosAmigos = new String[count]; //array para receber os dados dos amigos
        int controle = minId; // percorre os IDs

        // preenche o arrya com os dados dos amigos
        for (int i = 0; i < dadosAmigos.length; i++) {
            if (am1.getId(controle) > 0) {
                dadosAmigos[i] = am1.getId(controle) + "  " + am1.getNome(controle) + "  " + am1.getFone(controle);
                controle++;
                if (controle > am1.getMaxId()) {
                    controle = am1.getMinId();
                }
            }
        }

        return dadosAmigos;
    }

    /*
     * método para Pegar todos os amigos e informações
     */
    public String[][] pegarTodosAmigos() {
        int count = am1.getCount(); // número de amigos cadastrados
        int minId = am1.getMinId(); //mínimo de amigos
        
        String[][] amigos = new String[count][4]; //array para receber os dados dos amigos
        int controle = minId; // percorre os ids

        for (int i = 0; i < amigos.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (am1.getId(controle) > 0) {
                    if (j == 0) {
                        amigos[i][j] = am1.getId(controle) + "";
                    } else if (j == 1) {
                        amigos[i][j] = am1.getNome(controle);
                    } else if (j == 2) {
                        amigos[i][j] = am1.getFone(controle);
                    } else if (j == 3) {
                        amigos[i][j] = am1.getEmprestimos(controle) + "";
                        controle++;
                    }
                }
            }
        }

        return amigos;
    }

    /*
     * método para pegar os dados de um amigo pelo id
     */
    public String[][] pegarDadosAmigoUnitario(int id) {
        //array com os dados desse amigo 
        String[][] dadosAmigo = { { am1.getId(id) + "", am1.getNome(id), am1.getFone(id) } };

        return dadosAmigo;
    }

    /*
     * método para modificar os dados dos amigos
     */
    public void modificarAmigo() {
        //verificação dos dados para prosseguir com a modificação
        if (getId() > 0 && !getNome().isEmpty() && !getFone().isEmpty() && !getNome().isBlank()
                && !getFone().isBlank() || !am1.getNome(getId()).equals(getNome()) || !am1.getFone(getId()).equals(getFone()) ) {
            modAmigo.modificarAmigo(getId(), getNome(), getFone());
            JOptionPane.showMessageDialog(null, "Registro de amigo modificado com sucesso!");
        } else if (getId() == 0 || getNome().isEmpty() || getNome().isBlank() || getFone().isEmpty() || getFone().isBlank()){
            JOptionPane.showMessageDialog(null, "Erro: Digite todas as informações corretamente!");
        } else if (am1.getNome(getId()).equals(getNome()) || am1.getFone(getId()).equals(getFone())) {
            JOptionPane.showMessageDialog(null, "Não há necessidade de modificação: dados inseridos iguais aos registrados.");
        }
    }

    //método para remover um amigo
    public void removeAmigo() {
        if (getId() > 0 && dadosEmp.getIdAmigo(getId()) == 0 && am1.getId(getId()) > 0) {
            modAmigo.deletarAmigo(getId());
            JOptionPane.showMessageDialog(null, "Registro de amigo deletado com sucesso!");
        } else if (am1.getId(getId()) == 0){
            JOptionPane.showMessageDialog(null, "Erro: Digite a id do amigo corretamente!");
        } else if (dadosEmp.getIdAmigo(getId()) > 0) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o amigo, pois ele está envolvido em empréstimos!");
        }
    }

    /*
     * método para retornar o primeiro nome do amigo com mais impréstimos
     */
    public String primeiroNomeAmigoMaxEmprestimo() { 
        String nome = am1.getNomeMaxEmprestimo() + " "; //pega o nome completo do amigo com mais empréstimos
        String nomeArr[] = nome.split(" "); //divide o nome em partes
        return nomeArr[0]; //retorna a primeira parte do nome (primeiro nome)
    }
    
}
