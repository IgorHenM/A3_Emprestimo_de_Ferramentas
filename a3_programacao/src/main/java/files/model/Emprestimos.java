package files.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import files.DAO.PegarDadosEmprestimos;
import files.DAO.ConcluirEmprestimoDAO;
import files.DAO.PegarDadosFerramentas;
import files.DAO.PegarDadosAmigos;

import files.DAO.CadastroEmprestimoDAO;

public class Emprestimos extends CadastroEmprestimoDAO {
    private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private ConcluirEmprestimoDAO conc = new ConcluirEmprestimoDAO();
    private PegarDadosFerramentas dadosFerramentas = new PegarDadosFerramentas();
    private PegarDadosAmigos dadosAmigos = new PegarDadosAmigos();

    private int id;
    private int idAmigo;
    private int idFerramenta;
    private String data_emp;
    private String data_conc;

    private PegarDadosEmprestimos dados = new PegarDadosEmprestimos();

    public Emprestimos() {
        this(0, 0, "", "", 0);
    }

    public Emprestimos(int idAmigo, int idFerramenta, String data_emp, String data_conc, int id) {
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
        this.data_emp = data_emp;
        this.data_conc = data_conc;
        this.id = id;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public void setData_emp(String data) {
        this.data_emp = data;
    }

    public void setData_conc(String data_conc) {
        this.data_conc = data_conc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAmigo() {
        return idAmigo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public String getData_emp() {
        return data_emp;
    }

    public String getData_conc() {
        return data_conc;
    }

    public int getId() {
        return id;
    }

    public void CadastrarEmprestimo() {
        LocalDate date = LocalDate.now();
        setData_emp(df.format(date));
        if (dados.getAmigoEmp(getIdAmigo()) > 0) {
            int select = JOptionPane.showConfirmDialog(null,
                    "O amigo que você tentou emprestar uma ferramenta possui empréstimos ativos. Deseja continuar o empréstimo atual mesmo assim?");

            if (select == 0) {
                if (getIdAmigo() > 0 && getIdFerramenta() > 0
                        && dadosFerramentas.getId(getIdFerramenta(), "disponivel") > 0) {
                    Cadastrar(getIdAmigo(), getIdFerramenta(), getData_emp());
                    JOptionPane.showMessageDialog(null, "Ferramenta emprestada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "ERRO: Não foi possivel emprestar a ferramenta, insira os dados corretamente ou selecione amigo e ferramentas compativeis");
                }
            } else if (select == 1) {
                return;
            }
        } else {
            if (getIdAmigo() > 0 && getIdFerramenta() > 0
                    && dadosFerramentas.getId(getIdFerramenta(), "disponivel") > 0) {
                Cadastrar(getIdAmigo(), getIdFerramenta(), getData_emp());
                JOptionPane.showMessageDialog(null, "Ferramenta emprestada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: Não foi possivel emprestar a ferramenta, insira os dados corretamente ou selecione amigo e ferramentas compativeis");
            }
        }
    }

    public String[] pegarEmprestimosAtivos() {
        int count = dados.getCountWithCondition(true);
        int MinId = dados.getMinIdWithCondition(true);

        String[] emprestimosAtivos = new String[count + 1];
        int controle = MinId;

        for (int i = 0; i < emprestimosAtivos.length; i++) {
            if (i == 0) {
                emprestimosAtivos[0] = "Selecione";
            } else if (dados.getId(controle, true) > 0) {
                emprestimosAtivos[i] = dados.getId(controle, true) + "  id do Amigo: " + dados.getIdAmigo(controle)
                        + "  id da Ferramenta: "
                        + dados.getIdFerramenta(controle);
                controle++;

            }
        }

        return emprestimosAtivos;
    }

    public String[][] pegarTodosEmprestimosAtivos() {
        int countTotal = dados.getCount();
        int countAtivos = dados.getCountWithCondition(true);
        int MaxId = dados.getMaxId();

        String[][] emprestimosAtivos = new String[countAtivos][4];

        int[] controle = new int[countTotal];

        for (int k = 0; k < MaxId; k++) {// serve para pegar do min ao maximo ativo
            controle[k] = dados.getId(k + 1, true);
        }
        int contt = 0;

        for (int i = 0; i < MaxId; i++) {
            for (int j = 0; j < 4; j++) {
                if (controle[i] > 0) {
                    if (j == 0) {
                        emprestimosAtivos[contt][j] = dados.getId(controle[i], true) + "";
                    } else if (j == 1) {
                        emprestimosAtivos[contt][j] = dadosAmigos.getNome(dados.getIdAmigo(controle[i]));
                    } else if (j == 2) {
                        emprestimosAtivos[contt][j] = dadosFerramentas.getNome(dados.getIdFerramenta(controle[i]));

                    } else if (j == 3) {
                        emprestimosAtivos[contt][j] = dados.getDataEmprestimo(controle[i]);
                        contt++;
                    }
                }
            }
        }
        return emprestimosAtivos;
    }

    public String[][] pegarHistoricoEmprestimos() {
        int count = dados.getCount();
        int MaxId = dados.getMaxId();

        int controle = MaxId;

        String[][] historico = new String[count][6];

        for (int i = 0; i < historico.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    historico[i][j] = dados.getIdNormal(controle) + "";
                } else if (j == 1) {
                    historico[i][j] = dadosAmigos.getNome(dados.getIdAmigo(controle));
                } else if (j == 2) {
                    historico[i][j] = dadosFerramentas.getNome(dados.getIdFerramenta(controle));
                } else if (j == 3) {
                    historico[i][j] = dados.getDataEmprestimo(controle);
                } else if (j == 4) {
                    historico[i][j] = dados.getDataConc(controle);
                } else if (j == 5) {
                    boolean ativo = dados.getAtivo(controle);
                    String atividade = null;
                    if (ativo == true) {
                        atividade = "Ativo";
                    } else {
                        atividade = "Concluído";
                    }

                    historico[i][j] = atividade;
                    controle--;
                }
            }

        }
        return historico;
    }

    public void concluirEmprestimo() {
        LocalDate data = LocalDate.now();
        setData_conc(df.format(data));

        if (getId() > 0 && getIdFerramenta() > 0) {
            conc.Concluir(getId(), getData_conc(), getIdFerramenta());
            JOptionPane.showMessageDialog(null, "Empréstimo concluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao concluir empréstimo.");
        }

    }

}
