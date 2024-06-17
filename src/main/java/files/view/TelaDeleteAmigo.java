/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import files.model.Amigos;
import files.DAO.PegarDadosAmigos;
import files.ImagensA3.Imagens;

public class TelaDeleteAmigo extends javax.swing.JFrame {

    /**
     * Creates new form TelaDelete
     */
    public TelaDeleteAmigo() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        descAmigos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAmigos = new javax.swing.JTable();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAmigos = new javax.swing.JButton();

        setTitle("Deletar Registro de Amigos");

        //Dispose Alterado
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(img1.getLogo()); // NOI18N

        descId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descId.setForeground(new java.awt.Color(0, 0, 0));
        descId.setText("Id:");

        btnAmigos.setForeground(new java.awt.Color(255, 255, 255));
        btnAmigos.setBackground(new java.awt.Color(51, 51, 51));

        inputId.setBackground(new java.awt.Color(51, 51, 51));
        inputId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdActionPerformed(evt);
            }
        });
        inputId.setForeground(new java.awt.Color(255, 255, 255));

        descAmigos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descAmigos.setForeground(new java.awt.Color(0, 0, 0));
        descAmigos.setText("Informações do Amigo:");

        tableAmigos.setBackground(new java.awt.Color(51, 51, 51));
        tableAmigos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id", "Nome", "Telefone", "Total Empréstimos"
                }));
        tableAmigos.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableAmigos);

        btnDeletar.setBackground(new java.awt.Color(102, 102, 102));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAmigos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAmigos.setIcon(img1.getFriends()); // NOI18N
        btnAmigos.setText("Ver Amigos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(468, 468, 468)
                                                .addComponent(btnCancelar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDeletar)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 246, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descAmigos)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(descId)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(527, 527, 527)
                                                                .addComponent(btnAmigos))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(inputId,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(126, 126, 126)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(btnAmigos)
                                                .addGap(87, 87, 87))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(descId))
                                                .addGap(18, 18, 18)
                                                .addComponent(descAmigos)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCancelar)
                                        .addComponent(btnDeletar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addContainerGap()));

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
        btnDeletar.setEnabled(false);

        inputId.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                int id = 0;
                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }
                if (dados.getId(id) > 0 && inputId.getText().length() > 0) {
                    btnDeletar.setEnabled(true);
                    tableAmigos.setModel(new javax.swing.table.DefaultTableModel(
                            am1.pegarDadosAmigoUnitario(id),
                            new String[] {
                                    "Id", "Nome", "Telefone"
                            }));
                } else {
                    btnDeletar.setEnabled(false);
                    tableAmigos.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][] {

                            },
                            new String[] {
                                    "Id", "Nome", "Telefone"
                            }));
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                int id = 0;
                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }

                if (dados.getId(id) > 0 && inputId.getText().length() > 0) {
                    btnDeletar.setEnabled(true);
                    tableAmigos.setModel(new javax.swing.table.DefaultTableModel(
                            am1.pegarDadosAmigoUnitario(id),
                            new String[] {
                                    "Id", "Nome", "Telefone"
                            }));
                } else if (inputId.getText().length() < 1) {
                    btnDeletar.setEnabled(false);
                    tableAmigos.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][] {

                            },
                            new String[] {
                                    "Id", "Nome", "Telefone"
                            }));
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });
        btnDeletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                am1.setId(Integer.parseInt(inputId.getText()));
                am1.removeAmigo();
                reload();
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });

        btnAmigos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaAmigos().setVisible(true);
            }
        });

        pack();
    }// </editor-fold>

    private void btnCancelarActionPerformed() {
        this.dispose();
    }

    public void reload() {
        this.dispose();
        new TelaDeleteAmigo().setVisible(true);
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(TelaDeleteAmigo.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeleteAmigo.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeleteAmigo.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeleteAmigo.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeleteAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private Amigos am1 = new Amigos();
    private PegarDadosAmigos dados = new PegarDadosAmigos();
    private Imagens img1 = new Imagens();

    private javax.swing.JButton btnAmigos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel descAmigos;
    private javax.swing.JLabel descId;
    private javax.swing.JTextField inputId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAmigos;
    // End of variables declaration
}
