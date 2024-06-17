package files.view;


import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import files.ImagensA3.Imagens;

import files.model.Amigos;

/**
 *
 * 
 */
public class TelaCadastroAmigos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroConclusao
     */
    public TelaCadastroAmigos() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputFone = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        descNome = new javax.swing.JLabel();
        descFone = new javax.swing.JLabel();

        

        setTitle("Cadastrar Amigo");

        //Dispose Alterado
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");

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
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCadastrar)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setIcon(img1.getLogo()); // NOI18N

        inputFone.setBackground(new java.awt.Color(102, 102, 102));
        inputFone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputFone.setForeground(new java.awt.Color(255, 255, 255));

        inputNome.setBackground(new java.awt.Color(102, 102, 102));
        inputNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputNome.setForeground(new java.awt.Color(255, 255, 255));

        descNome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        descNome.setForeground(new java.awt.Color(0, 0, 0));
        descNome.setText("Nome:");

        descFone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        descFone.setForeground(new java.awt.Color(0, 0, 0));
        descFone.setText("Fone:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGap(0, 288, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(descFone)
                                                                .addGap(21, 21, 21)
                                                                .addComponent(inputFone,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 214,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(descNome)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(inputNome,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 290,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(207, 207, 207)))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(84, 246, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(descNome)
                                                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(descFone))
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
        btnCadastrar.setEnabled(false);

        inputNome.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                if (inputNome.getText().length() > 0 && inputFone.getText().length() > 0) {
                    btnCadastrar.setEnabled(true);

                } else {
                    btnCadastrar.setEnabled(false);

                }
            }

            public void removeUpdate(DocumentEvent evt) {
                if (inputNome.getText().length() > 0 && inputFone.getText().length() > 0) {
                    btnCadastrar.setEnabled(true);
                } else {
                    btnCadastrar.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });
        inputFone.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                if (inputNome.getText().length() > 0 && inputFone.getText().length() > 0) {
                    btnCadastrar.setEnabled(true);

                } else {
                    btnCadastrar.setEnabled(false);

                }
            }

            public void removeUpdate(DocumentEvent evt) {
                if (inputNome.getText().length() > 0 && inputFone.getText().length() > 0) {
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
                am1.setNome(inputNome.getText());
                am1.setFone(inputFone.getText());
                am1.cadastrarAmigos();
                reload();
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputNome.setText("");
                inputFone.setText("");
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();

            }
        });
        pack();
    }// </editor-fold>

    public void reload() {
        this.dispose();
        new TelaCadastroAmigos().setVisible(true);
    }

    public void btnCancelarActionPerformed() {
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(TelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAmigos.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private Amigos am1 = new Amigos();
    private Imagens img1 = new Imagens(); 

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel descFone;
    private javax.swing.JLabel descNome;
    private javax.swing.JTextField inputFone;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
