/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import files.model.*;
import files.DAO.PegarDadosFerramentas;
import files.DAO.PegarDadosAmigos;

public class TelaEmprestar extends javax.swing.JFrame {

    /**
     * Creates new form TelaEmprestimo
     */
    public TelaEmprestar() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAmigos = new javax.swing.JButton();
        btnFerramentas = new javax.swing.JButton();
        btnEmprestar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descIdAmigo = new javax.swing.JLabel();
        inputIdAmigo = new javax.swing.JTextField();
        descAmigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAmigo = new javax.swing.JTable();
        descIdFerramenta = new javax.swing.JLabel();
        inputIdFerramenta = new javax.swing.JTextField();
        descFerramenta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFerramenta = new javax.swing.JTable();

        setTitle("Emprestar Ferramenta");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnAmigos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAmigos.setIcon(new javax.swing.ImageIcon(
                "C:\\A3_Emprestimo_de_Ferramentas(este pc)\\a3_programacao\\src\\main\\java\\files\\ImagensA3\\Amigos.png")); // NOI18N
        btnAmigos.setText("Amigos");

        btnFerramentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFerramentas.setIcon(new javax.swing.ImageIcon(
                "C:\\A3_Emprestimo_de_Ferramentas(este pc)\\a3_programacao\\src\\main\\java\\files\\ImagensA3\\Ferramentas.png")); // NOI18N
        btnFerramentas.setText("Ferramentas");

        btnEmprestar.setBackground(new java.awt.Color(102, 102, 102));
        btnEmprestar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEmprestar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmprestar.setText("Emprestar");

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");

        btnLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(btnFerramentas,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnAmigos, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnEmprestar)
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(btnCancelar,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(btnLimpar,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(61, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnAmigos)
                                .addGap(18, 18, 18)
                                .addComponent(btnFerramentas)
                                .addGap(50, 50, 50)
                                .addComponent(btnEmprestar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setIcon(new javax.swing.ImageIcon(
                "C:\\A3_Emprestimo_de_Ferramentas(este pc)\\a3_programacao\\src\\main\\java\\files\\ImagensA3\\Logo3.png")); // NOI18N

        descIdAmigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descIdAmigo.setForeground(new java.awt.Color(0, 0, 0));
        descIdAmigo.setText("Id do Amigo:");

        inputIdAmigo.setBackground(new java.awt.Color(51, 51, 51));
        inputIdAmigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputIdAmigo.setForeground(new java.awt.Color(255, 255, 255));
        inputIdAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdAmigoActionPerformed(evt);
            }
        });

        descAmigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descAmigo.setForeground(new java.awt.Color(0, 0, 0));
        descAmigo.setText("Informações do Amigo:");

        tableAmigo.setBackground(new java.awt.Color(51, 51, 51));
        tableAmigo.setForeground(new java.awt.Color(255, 255, 255));
        tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id", "Nome", "Fone"
                }));
        jScrollPane1.setViewportView(tableAmigo);

        descIdFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descIdFerramenta.setForeground(new java.awt.Color(0, 0, 0));
        descIdFerramenta.setText("Id da Ferramenta:");

        inputIdFerramenta.setBackground(new java.awt.Color(51, 51, 51));
        inputIdFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputIdFerramenta.setForeground(new java.awt.Color(255, 255, 255));

        descFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descFerramenta.setForeground(new java.awt.Color(0, 0, 0));
        descFerramenta.setText("Informações da Ferramenta:");

        tableFerramenta.setBackground(new java.awt.Color(51, 51, 51));
        tableFerramenta.setForeground(new java.awt.Color(255, 255, 255));
        tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id", "Nome", "Marca", "Valor", "Disponibilidade"
                }));
        jScrollPane2.setViewportView(tableFerramenta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(descIdFerramenta)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(inputIdFerramenta,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(descAmigo)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(descIdAmigo)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(inputIdAmigo,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(descFerramenta))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descIdAmigo)
                                        .addComponent(inputIdAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(descAmigo)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descIdFerramenta)
                                        .addComponent(inputIdFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68,
                                                        Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(descFerramenta)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));

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
        btnEmprestar.setEnabled(false);
        inputIdAmigo.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                int idAmigo = 0;

                try {
                    idAmigo = Integer.parseInt(inputIdAmigo.getText());
                } catch (NumberFormatException e) {
                    idAmigo = 0;
                }

                int idFerramenta = 0;

                try {
                    idFerramenta = Integer.parseInt(inputIdFerramenta.getText());
                } catch (NumberFormatException e) {
                    idFerramenta = 0;
                }

                if (idAmigo > 0 && dadosAmigos.getId(idAmigo) > 0) {
                    tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
                            am1.pegarDadosAmigoUnitario(idAmigo),
                            new String[] {
                                    "Id", "Nome", "Fone"
                            }));

                } else {
                    tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][] {

                            },
                            new String[] {
                                    "Id", "Nome", "Fone"
                            }));
                }
                if (inputIdAmigo.getText().length() > 0 && inputIdFerramenta.getText().length() > 0
                        && dadosAmigos.getId(idAmigo) > 0 && dadosFerramentas.getId(idFerramenta, "disponivel") > 0) {
                    btnEmprestar.setEnabled(true);
                } else {
                    btnEmprestar.setEnabled(false);
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                int idAmigo = 0;

                try {
                    idAmigo = Integer.parseInt(inputIdAmigo.getText());
                } catch (NumberFormatException e) {
                    idAmigo = 0;
                }

                int idFerramenta = 0;

                try {
                    idFerramenta = Integer.parseInt(inputIdFerramenta.getText());
                } catch (NumberFormatException e) {
                    idFerramenta = 0;
                }

                if (idAmigo > 0 && dadosAmigos.getId(idAmigo) > 0) {
                    tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
                            am1.pegarDadosAmigoUnitario(idAmigo),
                            new String[] {
                                    "Id", "Nome", "Fone"
                            }));

                } else {
                    tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][] {

                            },
                            new String[] {
                                    "Id", "Nome", "Fone"
                            }));
                }

                if (inputIdAmigo.getText().length() > 0 && inputIdFerramenta.getText().length() > 0
                        && dadosAmigos.getId(idAmigo) > 0 && dadosFerramentas.getId(idFerramenta, "disponivel") > 0) {
                    btnEmprestar.setEnabled(true);
                } else {
                    btnEmprestar.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });

        inputIdFerramenta.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                int idAmigo = 0;

                try {
                    idAmigo = Integer.parseInt(inputIdAmigo.getText());
                } catch (NumberFormatException e) {
                    idAmigo = 0;
                }

                int idFerramenta = 0;

                try {
                    idFerramenta = Integer.parseInt(inputIdFerramenta.getText());
                } catch (NumberFormatException e) {
                    idFerramenta = 0;
                }

                if (idFerramenta > 0 && dadosFerramentas.getId(idFerramenta, "disponivel") > 0) {
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                            fr1.pegarDadosFerramentaUnitarioNormal(idFerramenta),
                            new String[] {
                                    "Id", "Nome", "Marca", "Valor", "Disponibilidade"
                            }));

                } else {
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][] {

                            },
                            new String[] {
                                    "Id", "Nome", "Marca", "Valor", "Disponibilidade"
                            }));
                }
                if (inputIdAmigo.getText().length() > 0 && inputIdFerramenta.getText().length() > 0
                        && dadosFerramentas.getId(idFerramenta, "disponivel") > 0 && dadosAmigos.getId(idAmigo) > 0) {
                    btnEmprestar.setEnabled(true);
                } else {
                    btnEmprestar.setEnabled(false);
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                int idAmigo = 0;

                try {
                    idAmigo = Integer.parseInt(inputIdAmigo.getText());
                } catch (NumberFormatException e) {
                    idAmigo = 0;
                }

                int idFerramenta = 0;

                try {
                    idFerramenta = Integer.parseInt(inputIdFerramenta.getText());
                } catch (NumberFormatException e) {
                    idFerramenta = 0;
                }

                if (idFerramenta > 0 && dadosFerramentas.getId(idFerramenta, "disponivel") > 0) {
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                            fr1.pegarDadosFerramentaUnitarioNormal(idFerramenta),
                            new String[] {
                                    "Id", "Nome", "Marca", "Valor", "Disponibilidade"
                            }));

                } else {
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][] {

                            },
                            new String[] {
                                    "Id", "Nome", "Marca", "Valor", "Disponibilidade"
                            }));
                }
                if (inputIdAmigo.getText().length() > 0 && inputIdFerramenta.getText().length() > 0
                        && dadosFerramentas.getId(idFerramenta, "disponivel") > 0 && dadosAmigos.getId(idAmigo) > 0) {
                    btnEmprestar.setEnabled(true);
                } else {
                    btnEmprestar.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });

        btnEmprestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                emp1.setIdAmigo(Integer.parseInt(inputIdAmigo.getText()));
                emp1.setIdFerramenta(Integer.parseInt(inputIdFerramenta.getText()));
                emp1.CadastrarEmprestimo();
                reload();

            }
        });

        btnAmigos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaAmigos().setVisible(true);
            }
        });
        btnFerramentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaFerramentas().setVisible(true);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputIdAmigo.setText("");
                inputIdFerramenta.setText("");
            }
        });

        pack();
    }// </editor-fold>

    public void btnCancelarActionPerformed() {
        this.dispose();
    }

    public void reload() {
        this.dispose();
        new TelaEmprestar().setVisible(true);
    }

    private void inputIdAmigoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestar.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private Emprestimos emp1 = new Emprestimos();
    private Amigos am1 = new Amigos();
    private Ferramentas fr1 = new Ferramentas();

    private PegarDadosAmigos dadosAmigos = new PegarDadosAmigos();
    private PegarDadosFerramentas dadosFerramentas = new PegarDadosFerramentas();

    private javax.swing.JButton btnAmigos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEmprestar;
    private javax.swing.JButton btnFerramentas;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel descAmigo;
    private javax.swing.JLabel descFerramenta;
    private javax.swing.JLabel descIdAmigo;
    private javax.swing.JLabel descIdFerramenta;
    private javax.swing.JTextField inputIdAmigo;
    private javax.swing.JTextField inputIdFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAmigo;
    private javax.swing.JTable tableFerramenta;
    // End of variables declaration
}
