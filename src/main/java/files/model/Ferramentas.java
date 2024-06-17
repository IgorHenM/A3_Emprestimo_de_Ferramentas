package files.model;

//import das classes para operação em BD e com diálogos
import files.DAO.CadastrarFerramentaDAO;
import files.DAO.PegarDadosFerramentas;
import files.DAO.PegarDadosEmprestimos;
import files.DAO.GerenciarFerramentaDAO;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

//classe ferramentas herda a DAO de cadastros de ferramenta para utilizar os métodos de cadastro
public class Ferramentas extends CadastrarFerramentaDAO {

    /**
     * Atributos
     */
    private PegarDadosFerramentas fr1 = new PegarDadosFerramentas();
    private PegarDadosEmprestimos emp1 = new PegarDadosEmprestimos();
    private GerenciarFerramentaDAO modFerramenta = new GerenciarFerramentaDAO();
    private NumberFormat nf = NumberFormat.getCurrencyInstance();

    private String nome;
    private double custo;
    private String marca;
    private int id;

    // 1
    public Ferramentas() {
        this(null, 0, null, 0);
    }

    // 1 e 2 são construtores
    // 2
    public Ferramentas(String nome, double custo, String marca, int id) {
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
        this.id = id;
    }

    /**
     * Método de retorno de nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de retorno de custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Método de retorno de marca
     */
    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

    /**
     * Método de inserção de nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de inserção de custo
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * Método de inserção de marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método responsável por avaliar os atributos recebidos para cadastro de
     * ferramentas e chamar o método de cadastro
     */
    public void cadastrarFerramenta() {
        if (!getNome().equals(null) && !getMarca().equals(null) && getCusto() > 0) {
            Cadastrar(getNome(), getMarca(), getCusto());
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!");
        }
    }

    /**
     * Método para pegar os dados das ferramentas em formato de array
     */
    public String[] pegarDadosFerramentasArray() {
        int count = fr1.getCount(null);
        int minId = fr1.getMinId(null);
        int maxId = fr1.getMaxId(null);
        String[] dadosFerramentas = new String[count];
        int controle = minId;

        // Preenche o array com os dados das ferramentas
        for (int i = 0; i < dadosFerramentas.length; i++) {
            if (fr1.getId(controle, null) > 0) {
                dadosFerramentas[i] = fr1.getId(controle, null) + "  " + fr1.getNome(controle) + "  "
                        + fr1.getMarca(controle)
                        + "  " + fr1.getCusto(controle);
                controle++;

                if (controle > maxId) {
                    controle = minId;
                }
            }
        }

        return dadosFerramentas;
    }

    /*
     * método para pegar as Ferramentas disponíveis
     */
    public String[] pegarFerramentasDisponiveis() {
        int count = fr1.getCount("disponivel");// criar ou modificar o método getCount para retornar apenas a contagem
                                               // das ferramentas disponiveis.
        int minId = fr1.getMinId("disponivel");
        int maxId = fr1.getMaxId("disponivel");
        String[] ferramentasDisponiveis = new String[count];
        int controle = minId;

        // Preenche o array com as ferramentas disponíveis
        for (int i = 0; i < ferramentasDisponiveis.length; i++) {
            if (fr1.getId(controle, "disponivel") > 0) {
                ferramentasDisponiveis[i] = fr1.getId(controle, "disponivel") + "  " + fr1.getNome(controle) + "  "
                        + fr1.getMarca(controle) + "  " + fr1.getCusto(controle);
                controle++;

                if (controle > maxId) {
                    controle = minId;
                }
            }
        }
        return ferramentasDisponiveis;
    }

    /**
     * Método para retornar os dados de uma ferramenta específica pelo id e status "indisponível"
     */
    public String[][] pegarDadosFerramentaUnitario(int cod) {
        String[][] dadosFerramenta = {
                { fr1.getId(cod, "indisponivel") + "", fr1.getNome(cod), fr1.getMarca(cod), fr1.getCusto(cod) + "" } };

        return dadosFerramenta;
    }

    /**
     * Método que retornar dados de uma certa ferramenta pelo id sem status específico
     */
    public String[][] pegarDadosFerramentaUnitarioNormal(int cod) {
        String[][] dadosFerramenta = {
                { fr1.getId(cod, null) + "", fr1.getNome(cod), fr1.getMarca(cod), fr1.getCusto(cod) + "",
                        fr1.getStatus(cod) } };

        return dadosFerramenta;
    }

    /*
     * método para modificar os dados de uma ferramenta
     */
    public void modificarFerramenta() {
        //verifica a validade das inforamações
        if (getId() > 0 && !getNome().isEmpty() && !getNome().isBlank() && !getMarca().isEmpty()
                && !getMarca().isBlank() && getCusto() > 0 || !fr1.getNome(getId()).equals(getNome())
                || !fr1.getMarca(getId()).equals(getMarca()) || fr1.getCusto(getId()) != getCusto()) {
            modFerramenta.modificarFerramenta(getId(), getNome(), getMarca(), getCusto());
            JOptionPane.showMessageDialog(null, "Registro de ferramenta alterado com sucesso!");
        } else if (getId() == 0 || getNome().isBlank() || getNome().isEmpty() || getMarca().isBlank()
                || getMarca().isEmpty() || getCusto() == 0) {
            JOptionPane.showMessageDialog(null, "Erro: digite todas as informações corretamente!");
        } else if (fr1.getNome(getId()).equals(getNome()) || fr1.getMarca(getId()).equals(getMarca())
                || fr1.getCusto(getId()) == getCusto()) {
            JOptionPane.showMessageDialog(null,
                    "Não é necessario modificar o registro da ferramenta: as informações digitadas são iguais às já cadastradas.");
        }
    }

    /*
     * método para deletar uma ferramenta
     */
    public void deletarFerramenta() {
        //verifica se a ferramenta está relacionada a um empréstimo, e caso estiver, não permite a exclusão
        if (fr1.getId(getId(), null) > 0 && emp1.getFerramentaEmp(getId()) == 0) {
            modFerramenta.deletarFerramenta(getId());
            JOptionPane.showMessageDialog(null, "Registro de ferramenta deletado com sucesso!");
        } else if (fr1.getId(getId(), null) == 0) {
            JOptionPane.showMessageDialog(null, "Erro: Id digitado não corresponde a nenhuma ferramenta registrada.");
        } else if (emp1.getFerramentaEmp(getId()) > 0) {
            JOptionPane.showMessageDialog(null,
                    "A ferramenta não pode ser excluida pois está associada a empréstimos.");
        }
    }

    /*
     * método para pegar as informações das Ferramentas
     */
    public String[][] pegarTodasFerramentas() {
        int count = fr1.getCount(null);
        int minId = fr1.getMinId(null);
        String[][] ferramentas = new String[count][5];

        int controle = minId;

        //completa o array com os dados das ferramentas
        for (int i = 0; i < ferramentas.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (fr1.getId(controle, null) > 0) {
                    if (j == 0) {
                        ferramentas[i][j] = fr1.getId(controle, null) + "";
                    } else if (j == 1) {
                        ferramentas[i][j] = fr1.getNome(controle);
                    } else if (j == 2) {
                        ferramentas[i][j] = fr1.getMarca(controle);
                    } else if (j == 3) {
                        ferramentas[i][j] = nf.format(fr1.getCusto(controle));
                    } else if (j == 4) {
                        ferramentas[i][j] = fr1.getStatus(controle);
                        controle++;
                    }
                }
            }
        }
        return ferramentas;
    }

    /*
     * método para pegar o valor total das ferramentas
     */
    public String valueTotal() {
        double valor = fr1.getCustoTotal();

        return nf.format(valor);
    }

    public static void main(String[] args) {
        Ferramentas fr1 = new Ferramentas();
        String[][] arr = new String[fr1.pegarTodasFerramentas().length][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}