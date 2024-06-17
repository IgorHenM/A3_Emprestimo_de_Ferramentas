/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import files.ImagensA3.Imagens;
import files.model.Ferramentas;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IgorMori
 */
public class TelaCadastroFerramenta extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroModificaFerramenta
     */
    public TelaCadastroFerramenta() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        descMarca = new javax.swing.JLabel();
        inputCusto = new javax.swing.JTextField();
        descNome = new javax.swing.JLabel();
        descCusto = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();

        setTitle("Cadastrar Ferramentas");

        // Dispose Alterado
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(131, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(129, 129, 129)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setIcon(img1.getLogo()); // NOI18N

        inputNome.setBackground(new java.awt.Color(102, 102, 102));
        inputNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputNome.setForeground(new java.awt.Color(255, 255, 255));

        descMarca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descMarca.setForeground(new java.awt.Color(0, 0, 0));
        descMarca.setText("Marca:");

        inputCusto.setBackground(new java.awt.Color(102, 102, 102));
        inputCusto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputCusto.setForeground(new java.awt.Color(255, 255, 255));
        inputCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCustoActionPerformed(evt);
            }
        });

        descNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descNome.setForeground(new java.awt.Color(0, 0, 0));
        descNome.setText("Nome:");

        descCusto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descCusto.setForeground(new java.awt.Color(0, 0, 0));
        descCusto.setText("Custo:");

        inputMarca.setBackground(new java.awt.Color(102, 102, 102));
        inputMarca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(299, 299, 299)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(descNome,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(descMarca,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(descCusto)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inputMarca,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inputCusto,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descNome))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descCusto)
                                        .addComponent(inputCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)));

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
        btnCadastrar.setEnabled(false);

        inputNome.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                double custo = 0;

                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }

                if (inputNome.getText().length() > 0 && inputMarca.getText().length() > 0
                        && inputCusto.getText().length() > 0 && custo > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                double custo = 0;

                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }

                if (inputNome.getText().length() > 0 && inputMarca.getText().length() > 0
                        && inputCusto.getText().length() > 0 && custo > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }

        });
        inputMarca.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                double custo = 0;

                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }

                if (inputNome.getText().length() > 0 && inputMarca.getText().length() > 0
                        && inputCusto.getText().length() > 0 && custo > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                double custo = 0;

                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }

                if (inputNome.getText().length() > 0 && inputMarca.getText().length() > 0
                        && inputCusto.getText().length() > 0 && custo > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }

        });
        inputCusto.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                double custo = 0;

                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }

                if (inputNome.getText().length() > 0 && inputMarca.getText().length() > 0
                        && inputCusto.getText().length() > 0 && custo > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void removeUpdate(DocumentEvent evt) {
                double custo = 0;

                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }

                if (inputNome.getText().length() > 0 && inputMarca.getText().length() > 0
                        && inputCusto.getText().length() > 0 && custo > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }

        });

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                double custo = 0;
                try {
                    custo = Double.parseDouble(inputCusto.getText());
                } catch (NumberFormatException e) {
                    custo = 0;
                }
                fr1.setNome(inputNome.getText());
                fr1.setMarca(inputMarca.getText());
                fr1.setCusto(custo);
                fr1.cadastrarFerramenta();
                reload();
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputNome.setText("");
                inputMarca.setText("");
                inputCusto.setText("");
            }
        });
        pack();
    }// </editor-fold>

    private void btnCancelarActionPerformed() {
        this.dispose();
    }

    private void reload() {
        this.dispose();
        new TelaCadastroFerramenta().setVisible(true);
    }

    private void inputCustoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(TelaCadastroFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private Ferramentas fr1 = new Ferramentas();
    private Imagens img1 = new Imagens();

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel descCusto;
    private javax.swing.JLabel descMarca;
    private javax.swing.JLabel descNome;
    private javax.swing.JTextField inputCusto;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
