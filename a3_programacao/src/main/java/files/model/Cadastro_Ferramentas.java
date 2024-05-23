package files.model;
import files.DAO.CadastrarFerramentaDAO;
import javax.swing.JOptionPane;


public class Cadastro_Ferramentas extends CadastrarFerramentaDAO{

    /**
     * Atributos
     */
    private String nome;
    private float custo;
    private String marca;
    
    //1
    public Cadastro_Ferramentas(){
        this(null,0,null);
    }
                    //1 e 2 são construtores
    //2
    public Cadastro_Ferramentas(String nome, float custo, String marca){
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
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
    public float getCusto() {
        return custo;
    }

    /**
     * Método de retorno de marca
     */
    public String getMarca() {
        return marca;
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
    public void setCusto(float custo) {
        this.custo = custo;
    }

    /**
     * Método de inserção de marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Método responsável por avaliar so atributos recebidos para cadastro de ferramentas e chamar o método de cadastro
     */
    public void cadastrarFerramenta() {
        if (!getNome().equals(null) && !getMarca().equals(null) && getCusto() > 0) {
            Cadastrar(getNome(), getMarca(), getCusto());
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!");
        }
    }
    
}