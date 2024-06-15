/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import files.model.Ferramentas;
import files.DAO.PegarDadosFerramentas;
import files.ImagensA3.Imagens;

public class TelaCadastroModificaFerramenta extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroModificaFerramenta
     */
    public TelaCadastroModificaFerramenta() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnFerramentas = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descId = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        descMarca = new javax.swing.JLabel();
        inputCusto = new javax.swing.JTextField();
        inputId = new javax.swing.JTextField();
        descNome = new javax.swing.JLabel();
        descCusto = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();

        setTitle("Cadastrar ou Modificar Ferramentas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnFerramentas.setBackground(new java.awt.Color(102, 102, 102));
        btnFerramentas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFerramentas.setForeground(new java.awt.Color(255, 255, 255));
        btnFerramentas.setIcon(img1.getTools()); // NOI18N
        btnFerramentas.setText("Ver Ferramentas");//corrigir imagens
        

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

        btnDeletar.setBackground(new java.awt.Color(102, 102, 102));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(82, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel2Layout.createSequentialGroup()
                                                        .addComponent(btnFerramentas)
                                                        .addGap(76, 76, 76))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(btnCadastrar,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(129, 129, 129)))));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnFerramentas)
                                .addGap(85, 85, 85)
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setIcon(img1.getLogo()); // NOI18N

        descId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descId.setForeground(new java.awt.Color(0, 0, 0));
        descId.setText("Id:");

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

        inputId.setBackground(new java.awt.Color(102, 102, 102));
        inputId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputId.setForeground(new java.awt.Color(255, 255, 255));

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
                                                .addGap(299, 299, 299)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(descNome,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(descMarca,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(descCusto,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(descId))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inputMarca,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inputCusto,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descId))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(descNome)
                                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descMarca)
                                        .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descCusto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        btnDeletar.setEnabled(false);
        inputNome.setEnabled(false);
        inputMarca.setEnabled(false);
        inputCusto.setEnabled(false);

        inputId.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                int id = 0;
                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException e) {
                    id = 0;
                }

                if (dados.getId(id, null) > 0) {
                    btnCadastrar.setEnabled(true);
                    btnCadastrar.setText("Editar");
                    btnDeletar.setEnabled(true);
                    inputNome.setEnabled(true);
                    inputMarca.setEnabled(true);
                    inputCusto.setEnabled(true);

                    inputNome.setText(dados.getNome(id));
                    inputMarca.setText(dados.getMarca(id));
                    inputCusto.setText(dados.getCusto(id) + "");

                } else if (dados.getId(id, null) == 0) {
                    btnCadastrar.setEnabled(false);
                    btnCadastrar.setText("Cadastrar");
                    btnDeletar.setEnabled(false);
                    inputNome.setEnabled(true);
                    inputMarca.setEnabled(true);
                    inputCusto.setEnabled(true);

                    inputNome.setText("");
                    inputMarca.setText("");
                    inputCusto.setText("");

                    inputNome.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent evt) {
                            if (inputMarca.getText().length() > 0 && inputNome.getText().length() > 0
                                    && inputCusto.getText().length() > 0) {
                                btnCadastrar.setEnabled(true);
                            }
                        }

                        public void removeUpdate(DocumentEvent evt) {
                            if (inputMarca.getText().length() < 1 || inputNome.getText().length() < 1
                                    || inputCusto.getText().length() < 1) {
                                btnCadastrar.setEnabled(false);
                            }
                        }

                        public void changedUpdate(DocumentEvent evt) {

                        }
                    });
                    inputMarca.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent evt) {
                            if (inputMarca.getText().length() > 0 && inputNome.getText().length() > 0
                                    && inputCusto.getText().length() > 0) {
                                btnCadastrar.setEnabled(true);
                            }
                        }

                        public void removeUpdate(DocumentEvent evt) {
                            if (inputMarca.getText().length() < 1 || inputNome.getText().length() < 1
                                    || inputCusto.getText().length() < 1) {
                                btnCadastrar.setEnabled(false);
                            }
                        }

                        public void changedUpdate(DocumentEvent evt) {

                        }
                    });

                    inputCusto.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent evt) {
                            if (inputMarca.getText().length() > 0 && inputNome.getText().length() > 0
                                    && inputCusto.getText().length() > 0) {
                                btnCadastrar.setEnabled(true);
                            }
                        }

                        public void removeUpdate(DocumentEvent evt) {
                            if (inputMarca.getText().length() < 1 || inputNome.getText().length() < 1
                                    || inputCusto.getText().length() < 1) {
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

                if (dados.getId(id, null) > 0) {
                    btnCadastrar.setEnabled(true);
                    btnCadastrar.setText("Editar");
                    btnDeletar.setEnabled(true);
                    inputNome.setEnabled(true);
                    inputMarca.setEnabled(true);
                    inputCusto.setEnabled(true);

                    inputNome.setText(dados.getNome(id));
                    inputMarca.setText(dados.getMarca(id));
                    inputCusto.setText(dados.getCusto(id) + "");

                } else if (dados.getId(id, null) == 0) {
                    btnCadastrar.setEnabled(false);
                    btnCadastrar.setText("Cadastrar");
                    btnDeletar.setEnabled(false);
                    inputNome.setEnabled(true);
                    inputMarca.setEnabled(true);
                    inputCusto.setEnabled(true);

                    inputNome.setText("");
                    inputMarca.setText("");
                    inputCusto.setText("");
                }
                if (inputId.getText().length() < 1) {
                    btnCadastrar.setEnabled(false);
                    btnCadastrar.setText("Cadastrar");
                    btnDeletar.setEnabled(false);
                    inputNome.setEnabled(false);
                    inputMarca.setEnabled(false);
                    inputCusto.setEnabled(false);
                }
            }

            public void changedUpdate(DocumentEvent evt) {

            }
        });

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int id = 0;

                try {
                    id = Integer.parseInt(inputId.getText());
                } catch (NumberFormatException exx) {
                    id = 0;
                }
                if (dados.getId(id, null) > 0) {

                    String nome = inputNome.getText();
                    String marca = inputMarca.getText();

                    double custo = 0;

                    try {
                        custo = Double.parseDouble(inputCusto.getText());
                    } catch (NumberFormatException ex) {
                        custo = 0;
                    }
                    fr1.setId(id);
                    fr1.setNome(nome);
                    fr1.setMarca(marca);
                    fr1.setCusto(custo);
                    fr1.modificarFerramenta();

                } else if (id == 0 || dados.getId(id, null) == 0) {
                    String nome = inputNome.getText();
                    String marca = inputMarca.getText();

                    double custo = 0;

                    try {
                        custo = Double.parseDouble(inputCusto.getText());
                    } catch (NumberFormatException ex) {
                        custo = 0;
                    }

                    int selecao = JOptionPane.showConfirmDialog(null,
                            "A ferramenta que você tentou editar não foi encontrada no registro de ferramentas, gostaria de registrá-la?");

                    if (selecao == 0) {
                        fr1.setId(id);
                        fr1.setNome(nome);
                        fr1.setMarca(marca);
                        fr1.setCusto(custo);
                        fr1.cadastrarFerramenta();
                    } else if (selecao == 1) {
                        return;
                    }
                }
                reload();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCancelarActionPerformed();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputId.setText("");
                inputNome.setText("");
                inputMarca.setText("");
                inputCusto.setText("");

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
            }
        });

        btnFerramentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new TelaFerramentas().setVisible(true);
            }
        });

        pack();
    }// </editor-fold>

    private void btnCancelarActionPerformed() {
        this.dispose();
    }

    private void reload() {
        this.dispose();
        new TelaCadastroModificaFerramenta().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaCadastroModificaFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModificaFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModificaFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModificaFerramenta.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroModificaFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private Ferramentas fr1 = new Ferramentas();
    private PegarDadosFerramentas dados = new PegarDadosFerramentas();
    private Imagens img1 = new Imagens();

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFerramentas;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel descCusto;
    private javax.swing.JLabel descId;
    private javax.swing.JLabel descMarca;
    private javax.swing.JLabel descNome;
    private javax.swing.JTextField inputCusto;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
