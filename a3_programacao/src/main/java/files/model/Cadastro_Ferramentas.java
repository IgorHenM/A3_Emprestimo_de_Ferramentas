package files.model;
import files.DAO.CadastrarFerramentaDAO;
import javax.swing.JOptionPane;


public class Cadastro_Ferramentas extends CadastrarFerramentaDAO{
    private String nome;
    private float custo;
    private String marca;
    
    public Cadastro_Ferramentas(){
        this(null,0,null);
    }
    
    public Cadastro_Ferramentas(String nome, float custo, String marca){
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public float getCusto() {
        return custo;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void cadastrarFerramenta() {
        if (!getNome().equals(null) && !getMarca().equals(null) && getCusto() > 0) {
            Cadastrar(getNome(), getMarca(), getCusto());
        } else {
            JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!");
        }
    }
    
}