/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import files.model.Emprestimos;

/**
 *
 * @author IgorMori
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPricipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpsAtivos = new javax.swing.JTable();
        descEmpsAtivos = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastrarFerramenta = new javax.swing.JMenuItem();
        editarFerramenta = new javax.swing.JMenuItem();
        deletarFerramenta = new javax.swing.JMenuItem();
        ferramentasRegistradas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadastrarAmigo = new javax.swing.JMenuItem();
        editarAmigo = new javax.swing.JMenuItem();
        deletarAmigo = new javax.swing.JMenuItem();
        amigosRegistrados = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        emprestarFerramenta = new javax.swing.JMenuItem();
        concluirEmprestimo = new javax.swing.JMenuItem();
        historicoEmps = new javax.swing.JMenuItem();
        empsAmigo = new javax.swing.JMenuItem();

        setTitle("Tela Principal | Empréstimo de Ferramentas");

        jMenuItem7.setText("jMenuItem7");

        //Dispose Alterado
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tableEmpsAtivos.setBackground(new java.awt.Color(102, 102, 102));
        tableEmpsAtivos.setForeground(new java.awt.Color(255, 255, 255));
        tableEmpsAtivos.setModel(new javax.swing.table.DefaultTableModel(
                emp1.pegarTodosEmprestimosAtivos(),
                new String[] {
                        "Id", "Amigo", "Ferramenta", "Data do Empréstimo"
                }));
        tableEmpsAtivos.setFont(new java.awt.Font("Segoe UI", 0, 15));
        jScrollPane1.setViewportView(tableEmpsAtivos);

        descEmpsAtivos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descEmpsAtivos.setForeground(new java.awt.Color(255, 255, 255));
        descEmpsAtivos.setText("Empréstimos Ativos:");

        btnAtualizar.setBackground(new java.awt.Color(29, 28, 28));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar Página");
        btnAtualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(433, Short.MAX_VALUE)
                                .addComponent(descEmpsAtivos)
                                .addGap(289, 289, 289)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(descEmpsAtivos)
                                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setBackground(new java.awt.Color(51,51,51));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setBackground(new java.awt.Color(51,51,51));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setBackground(new java.awt.Color(51,51,51));

        jMenu1.setText("Ferramentas");

        cadastrarFerramenta.setText("Cadastrar");
        jMenu1.add(cadastrarFerramenta);

        editarFerramenta.setText("Editar");
        jMenu1.add(editarFerramenta);

        deletarFerramenta.setText("Deletar");
        jMenu1.add(deletarFerramenta);

        ferramentasRegistradas.setText("Ferramentas Registradas");
        jMenu1.add(ferramentasRegistradas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Amigos");

        cadastrarAmigo.setText("Cadastrar");
        jMenu2.add(cadastrarAmigo);

        editarAmigo.setText("Editar");
        jMenu2.add(editarAmigo);

        deletarAmigo.setText("Deletar");
        jMenu2.add(deletarAmigo);

        amigosRegistrados.setText("Amigos Registrados");
        jMenu2.add(amigosRegistrados);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empréstimos");

        emprestarFerramenta.setText("Emprestar Ferramenta");
        jMenu3.add(emprestarFerramenta);

        concluirEmprestimo.setText("Concluir Empréstimos");
        jMenu3.add(concluirEmprestimo);

        historicoEmps.setText("Histórico");
        jMenu3.add(historicoEmps);

        empsAmigo.setText("Empréstimos de um Amigo");
        jMenu3.add(empsAmigo);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        cadastrarFerramenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaCadastroFerramenta().setVisible(true);
            }
        });
        editarFerramenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaCadastroModificaFerramenta().setVisible(true);
            }
        });
        deletarFerramenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaDeletarFerramenta().setVisible(true);
            }
        });
        ferramentasRegistradas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaFerramentas().setVisible(true);
            }
        });

        cadastrarAmigo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaCadastroAmigos().setVisible(true);
            }
        });
        editarAmigo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaCadastroModificaAmigo().setVisible(true);
            }
        });
        deletarAmigo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaDeleteAmigo().setVisible(true);
            }
        });
        amigosRegistrados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaAmigos().setVisible(true);
            }
        });

        emprestarFerramenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaEmprestar().setVisible(true);
            }
        });
        concluirEmprestimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaConcluir().setVisible(true);
            }
        });

        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reload();
            }
        });
        historicoEmps.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaHistoricoEmprestimos().setVisible(true);
            }
        });
        empsAmigo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaVisualizarEmp().setVisible(true);
            }
        });

        pack();
    }

    public void reload() {
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private Emprestimos emp1 = new Emprestimos();

    private javax.swing.JMenuItem amigosRegistrados;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenuItem cadastrarAmigo;
    private javax.swing.JMenuItem cadastrarFerramenta;
    private javax.swing.JMenuItem concluirEmprestimo;
    private javax.swing.JMenuItem deletarAmigo;
    private javax.swing.JMenuItem deletarFerramenta;
    private javax.swing.JLabel descEmpsAtivos;
    private javax.swing.JMenuItem editarAmigo;
    private javax.swing.JMenuItem editarFerramenta;
    private javax.swing.JMenuItem emprestarFerramenta;
    private javax.swing.JMenuItem empsAmigo;
    private javax.swing.JMenuItem ferramentasRegistradas;
    private javax.swing.JMenuItem historicoEmps;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpsAtivos;

}
