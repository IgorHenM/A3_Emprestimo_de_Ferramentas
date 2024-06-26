/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import files.DAO.PegarDadosAmigos;
import files.ImagensA3.Imagens;
import files.model.Amigos;

/**
 *
 *
 */
public class TelaCadastroModificaAmigo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroConclusao
     */
    public TelaCadastroModificaAmigo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAmigos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputFone = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        descNome = new javax.swing.JLabel();
        descFone = new javax.swing.JLabel();

        setTitle("Cadastrar ou Editar Amigo");

        // Dispose Alterado
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

        btnDeletar.setBackground(new java.awt.Color(102, 102, 102));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");

        btnAmigos.setBackground(new java.awt.Color(102, 102, 102));
        btnAmigos.setForeground(new java.awt.Color(255, 255, 255));
        btnAmigos.setIcon(img1.getFriends()); // NOI18N
        btnAmigos.setText("Ver Amigos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnDeletar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCancelar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCadastrar)
                                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(69, 69, 69))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel2Layout.createSequentialGroup()
                                                        .addComponent(btnAmigos)
                                                        .addGap(44, 44, 44)))));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnAmigos)
                                .addGap(73, 73, 73)
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setIcon(img1.getLogo()); // NOI18N

        descId.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        descId.setForeground(new java.awt.Color(0, 0, 0));
        descId.setText("Id:");

        inputId.setBackground(new java.awt.Color(102, 102, 102));
        inputId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputId.setForeground(new java.awt.Color(255, 255, 255));

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
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(descId)
                                                                        .addComponent(descFone))
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(inputFone,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                214,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(inputId,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                70,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(descId)
                                                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
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
        btnDeletar.setEnabled(false);
        inputNome.setEnabled(false);
        inputFone.setEnabled(false);

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });

        inputId.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                int id = 0;
                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }

                if (dados.getId(id) > 0) {
                    btnCadastrar.setEnabled(true);
                    btnCadastrar.setText("Editar");
                    inputNome.setText(dados.getNome(Integer.parseInt(inputId.getText())));
                    inputFone.setText(dados.getFone(Integer.parseInt(inputId.getText())));
                    inputNome.setEnabled(true);
                    inputFone.setEnabled(true);
                    btnDeletar.setEnabled(true);

                    btnDeletar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            int id = Integer.parseInt(inputId.getText());
                            am1.setId(id);
                            am1.removeAmigo();
                            reload();
                        }
                    });

                } else if (dados.getId(id) == 0) {
                    btnCadastrar.setText("Cadastrar");
                    inputNome.setEnabled(true);
                    inputFone.setEnabled(true);
                    btnDeletar.setEnabled(false);
                    inputNome.setText("");
                    inputFone.setText("");

                    inputNome.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent evt1) {
                            if (!inputNome.getText().isEmpty() && !inputNome.getText().isBlank()
                                    && !inputFone.getText().isEmpty() && !inputFone.getText().isBlank()) {
                                btnCadastrar.setEnabled(true);
                            }
                        }

                        public void removeUpdate(DocumentEvent evt1) {
                            if (inputNome.getText().length() < 1 || inputFone.getText().length() < 1) {
                                btnCadastrar.setEnabled(false);
                            }
                        }

                        public void changedUpdate(DocumentEvent evt1) {

                        }

                    });

                    inputFone.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent evt) {
                            if (inputFone.getText().length() > 0) {
                                btnCadastrar.setEnabled(true);
                            }
                        }

                        public void removeUpdate(DocumentEvent evt) {
                            if (inputFone.getText().length() < 1) {
                                btnCadastrar.setEnabled(false);
                            }
                        }

                        public void changedUpdate(DocumentEvent evt) {

                        }
                    });

                }
            }

            public void removeUpdate(DocumentEvent evt) {
                int id = 0;

                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }
                if (inputId.getText().length() < 1 && dados.getId(id) == 0) {
                    btnCadastrar.setEnabled(false);
                    inputNome.setText("");
                    inputFone.setText("");
                    inputNome.setEnabled(false);
                    inputFone.setEnabled(false);
                    btnDeletar.setEnabled(false);
                } else if (dados.getId(id) > 0 && id > 0) {
                    btnCadastrar.setText("Editar");
                    inputNome.setText(dados.getNome(Integer.parseInt(inputId.getText())));
                    inputFone.setText(dados.getFone(Integer.parseInt(inputId.getText())));
                    btnDeletar.setEnabled(true);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputId.setText("");
                inputNome.setText("");
                inputFone.setText("");
            }
        });
        btnAmigos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaAmigos().setVisible(true);
            }
        });

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int id = 0;
                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }
                if (dados.getId(id) == 0) {
                    int selecaoEtapa = JOptionPane.showConfirmDialog(null,
                            "O amigo que você tentou editar não está cadastrado, deseja cadastrá-lo?");

                    if (selecaoEtapa == 0) {
                        am1.setNome(inputNome.getText());
                        am1.setFone(inputFone.getText());
                        am1.cadastrarAmigos();
                        reload();
                    } else if (selecaoEtapa == 2) {
                        return;
                    }
                } else if (dados.getId(id) > 0) {
                    am1.setId(Integer.parseInt(inputId.getText()));
                    am1.setNome(inputNome.getText());
                    am1.setFone(inputFone.getText());
                    am1.modificarAmigo();
                    reload();
                }
            }
        });

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */

    private void btnCancelarActionPerformed() {
        this.dispose();
    }

    private void reload() {
        this.dispose();
        new TelaCadastroModificaAmigo().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaCadastroModificaAmigo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModificaAmigo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModificaAmigo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModificaAmigo.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroModificaAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify

    private PegarDadosAmigos dados = new PegarDadosAmigos();
    private Amigos am1 = new Amigos();
    private Imagens img1 = new Imagens();

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnAmigos;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel descFone;
    private javax.swing.JLabel descId;
    private javax.swing.JLabel descNome;
    private javax.swing.JTextField inputFone;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
/*
 * Informações importantes:
 * Quando o usuario apagar incompletamente o id, buscar o id digitado no banco
 * de dados e se tiver amigo registrado, retornar informações
 * -Resolver erro de exceção quando usuário digita letras ao invés de números.
 */