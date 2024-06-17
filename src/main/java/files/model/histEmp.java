package files.model;

public class histEmp {

    private int IdAmigo;
    private int IdFerramenta;
    private String amigo;
    private String ferramenta;
    private String idEmprestimo;
    private boolean atvEmprestimo;

    /*
     * getters e setters
     */
    public String getAtvEmprestimo() {
        return atvEmprestimo ? "Disponível" : "Indisponível"; // retorna o bool de atividade do impréstimo para string
    }

    public void setAtvEmprestimo(boolean atvEmprestimo) {
        this.atvEmprestimo = atvEmprestimo;
    }

    public int getIdAmigo() {
        return IdAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        IdAmigo = idAmigo;
    }

    public int getIdFerramenta() {
        return IdFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        IdFerramenta = idFerramenta;
    }

    public String getAmigo() {
        return amigo;
    }

    public void setAmigo(String amigo) {
        this.amigo = amigo;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    public String getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(String idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
}


