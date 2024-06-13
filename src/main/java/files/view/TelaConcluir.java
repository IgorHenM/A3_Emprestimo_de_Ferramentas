/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;
import files.model.*;
import files.DAO.PegarDadosEmprestimos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IgorMori
 */
public class TelaConcluir extends javax.swing.JFrame {


    /**
     * Creates new form concluir
     */
    public TelaConcluir() {
        initComponents();
    }
                         
    private void initComponents() {

        selectEmprestimo = new javax.swing.JComboBox<>();
        descSelecEmprestimo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        descTableAmigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAmigo = new javax.swing.JTable();
        descTableFerramenta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFerramenta = new javax.swing.JTable();
        descDataEmp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataEmprestimo = new javax.swing.JTextField();

        setTitle("Concluir Empréstimos");

        dataEmprestimo.setEnabled(false);
        btnConcluir.setEnabled(false);
        dataEmprestimo.setForeground(new java.awt.Color(0,0,0));

        setBackground(new java.awt.Color(51,51,51));


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectEmprestimo.setModel(new javax.swing.DefaultComboBoxModel<>(emp1.pegarEmprestimosAtivos()));

        descSelecEmprestimo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descSelecEmprestimo.setText("Selecione o empréstimo:");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnConcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConcluir.setText("Concluir");

        descTableAmigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descTableAmigo.setText("Informações do Amigo:");

        tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Fone"
            }
        ));
        jScrollPane1.setViewportView(tableAmigo);

        descTableFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descTableFerramenta.setText("Informações da Ferramenta:");

        tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Custo"
            }
        ));
        jScrollPane2.setViewportView(tableFerramenta);

        descDataEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descDataEmp.setText("Data do empréstimo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        dataEmprestimo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dataEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descSelecEmprestimo)
                    .addComponent(selectEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descTableAmigo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descTableFerramenta)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descDataEmp)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(dataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(descSelecEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(selectEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(descTableAmigo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descTableFerramenta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(descDataEmp)
                        .addComponent(dataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        selectEmprestimo.setBackground(new java.awt.Color(51,51,51));
        selectEmprestimo.setForeground(new java.awt.Color(255,255,255));
        
        tableAmigo.setBackground(new java.awt.Color(51,51,51));
        tableAmigo.setForeground(new java.awt.Color(255,255,255));

        tableFerramenta.setBackground(new java.awt.Color(51,51,51));
        tableFerramenta.setForeground(new java.awt.Color(255,255,255));

        dataEmprestimo.setBackground(new java.awt.Color(51,51,51));
        dataEmprestimo.setForeground(new java.awt.Color(255,255,255));

        btnConcluir.setBackground(new java.awt.Color(102,102,102));
        btnConcluir.setForeground(new java.awt.Color(255,255,255));

        btnCancelar.setBackground(new java.awt.Color(102,102,102));
        btnCancelar.setForeground(new java.awt.Color(255,255,255));

        selectEmprestimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String[] emprestimosAtivos = emp1.pegarEmprestimosAtivos();
                String selecao = emprestimosAtivos[selectEmprestimo.getSelectedIndex()];

                if (selecao.equals("Selecione")) {
                    btnConcluir.setEnabled(false);
                } else {
                    btnConcluir.setEnabled(true);
                    int itemSelecionado = selectEmprestimo.getSelectedIndex();

                    String item = emprestimosAtivos[itemSelecionado];

                    String[] arrayItem = item.split(" ");

                    int idEmprestimo = Integer.parseInt(arrayItem[0]);
                    int idAmigo = Integer.parseInt(arrayItem[5]);
                    int idFerramenta = Integer.parseInt(arrayItem[10]);

                    tableAmigo.setModel (new javax.swing.table.DefaultTableModel(
                        am1.pegarDadosAmigoUnitario(idAmigo),

                        new String [] {
                            "Id", "Nome", "Fone"
                        }

                    ));
                    
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                        fr1.pegarDadosFerramentaUnitario(idFerramenta),

                        new String [] {
                            "Id", "Nome", "Marca", "Custo"
                        }
                    ));
                    PegarDadosEmprestimos dados = new PegarDadosEmprestimos();
                    dataEmprestimo.setText(dados.getDataEmprestimo(idEmprestimo));
                }
            }
        });

        btnConcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                    int itemSelecionado = selectEmprestimo.getSelectedIndex();
                    String[] emprestimosAtivos = emp1.pegarEmprestimosAtivos();
                    String item = emprestimosAtivos[itemSelecionado];

                    String[] arrayItem = item.split(" ");

                    int idEmprestimo = Integer.parseInt(arrayItem[0]);
                    int idFerramenta = Integer.parseInt(arrayItem[10]);

                    emp1.setId(idEmprestimo);
                    emp1.setIdFerramenta(idFerramenta);
                    emp1.concluirEmprestimo();
                    reload();
            }
        });
        
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });

        pack();
    }// </editor-fold>                        

    private void reload() {
        this.dispose();
        new TelaConcluir().setVisible(true);
    }

    private void btnCancelarActionPerformed() {
        this.dispose();
    }

    private void dataEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConcluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify   
    private Emprestimos emp1 = new Emprestimos();
    private Amigos am1 = new Amigos();
    private Ferramentas fr1 = new Ferramentas();
    
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JTextField dataEmprestimo;
    private javax.swing.JLabel descDataEmp;
    private javax.swing.JLabel descSelecEmprestimo;
    private javax.swing.JLabel descTableAmigo;
    private javax.swing.JLabel descTableFerramenta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selectEmprestimo;
    private javax.swing.JTable tableAmigo;
    private javax.swing.JTable tableFerramenta;
    // End of variables declaration                   
}
