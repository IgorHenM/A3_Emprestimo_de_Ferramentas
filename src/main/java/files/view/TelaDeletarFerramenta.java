/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import files.model.Ferramentas;
import files.DAO.PegarDadosFerramentas;
import files.ImagensA3.Imagens;

/**
 *
 * @author IgorMori
 */
public class TelaDeletarFerramenta extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeletarFerramenta
     */
    public TelaDeletarFerramenta() {
        initComponents();
    }

                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        descFerramenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFerramenta = new javax.swing.JTable();
        btnFerramentas = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Deletar Ferramentas");

        tableFerramenta.setForeground(new java.awt.Color(255,255,255));

        inputId.setForeground(new java.awt.Color(255,255,255));

        //Dispose Alterado
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(img1.getLogo()); // NOI18N

        descId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descId.setForeground(new java.awt.Color(0, 0, 0));
        descId.setText("Id:");

        inputId.setBackground(new java.awt.Color(51, 51, 51));
        inputId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        descFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descFerramenta.setForeground(new java.awt.Color(0, 0, 0));
        descFerramenta.setText("Informações da Ferramenta:");

        tableFerramenta.setBackground(new java.awt.Color(51, 51, 51));
        tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Custo", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableFerramenta);

        btnFerramentas.setBackground(new java.awt.Color(51, 51, 51));
        btnFerramentas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFerramentas.setForeground(new java.awt.Color(255, 255, 255));
        btnFerramentas.setIcon(img1.getTools()); // NOI18N
        btnFerramentas.setText("Ver Ferramentas");

        btnDeletar.setBackground(new java.awt.Color(102, 102, 102));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 218, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descId)
                        .addGap(18, 18, 18)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descFerramenta)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(415, 415, 415)
                .addComponent(btnDeletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFerramentas)
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(431, 431, 431)
                    .addComponent(btnCancelar)
                    .addContainerGap(559, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnFerramentas)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descId)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(descFerramenta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeletar)
                        .addGap(71, 71, 71))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(420, Short.MAX_VALUE)
                    .addComponent(btnCancelar)
                    .addGap(71, 71, 71)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
            btnDeletar.setEnabled(false);

        inputId.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                int id = 0;

                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }

                if (id > 0 && dados.getId(id, null) > 0) {
                    btnDeletar.setEnabled(true);
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                        fr1.pegarDadosFerramentaUnitarioNormal(id),
                        new String [] {
                            "Id", "Nome", "Marca", "Custo", "Status"
                        }
                    ));
                } else {
                    btnDeletar.setEnabled(false);
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][] {

                        },
                        new String [] {
                            "Id", "Nome", "Marca", "Custo", "Status"
                        }
                    ));
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                int id = 0;

                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }

                if (id > 0 && dados.getId(id, null) > 0) {
                    btnDeletar.setEnabled(true);
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                        fr1.pegarDadosFerramentaUnitarioNormal(id),
                        new String [] {
                            "Id", "Nome", "Marca", "Custo", "Status"
                        }
                    ));
                } else {
                    btnDeletar.setEnabled(false);
                    tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][] {
                            
                        },
                        new String [] {
                            "Id", "Nome", "Marca", "Custo", "Status"
                        }
                    ));
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });

        btnDeletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int id = 0;
                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException exx) {
                    id = 0;
                }

                if (dados.getId(id, null) > 0) {
                    fr1.setId(id);
                    fr1.deletarFerramenta();
                }
                reload();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });

        btnFerramentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaFerramentas().setVisible(true);
            }
        });
        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */

     public void btnCancelarActionPerformed() {
        this.dispose();
     }
     public void reload() {
        this.dispose();
        new TelaDeletarFerramenta().setVisible(true);
     }
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
            java.util.logging.Logger.getLogger(TelaDeletarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeletarFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify  
    private Ferramentas fr1 = new Ferramentas(); 
    private PegarDadosFerramentas dados = new PegarDadosFerramentas();
    private Imagens img1 = new Imagens();
    
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFerramentas;
    private javax.swing.JLabel descFerramenta;
    private javax.swing.JLabel descId;
    private javax.swing.JTextField inputId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFerramenta;
    // End of variables declaration                   
}

