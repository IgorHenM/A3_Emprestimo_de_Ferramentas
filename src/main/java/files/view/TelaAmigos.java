/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package files.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import files.DAO.PegarDadosAmigos;

import files.model.Amigos;

/**
 *
 *
 */
public class TelaAmigos extends javax.swing.JFrame {

    /**
     * Creates new form TelaAmigos
     */
    public TelaAmigos() {
        initComponents();
    }

    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        descCadastros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAmigos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        descMaisEmprestimos = new javax.swing.JLabel();
        idAmigo = new javax.swing.JLabel();
        nomeAmigo = new javax.swing.JLabel();
        empsAmigo = new javax.swing.JLabel();
        descTotal = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();

        setTitle("Amigos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        descCadastros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descCadastros.setForeground(new java.awt.Color(255, 255, 255));
        descCadastros.setText("Amigos Cadastrados:");

        tableAmigos.setBackground(new java.awt.Color(102, 102, 102));
        tableAmigos.setForeground(new java.awt.Color(255, 255, 255));
        tableAmigos.setModel(new javax.swing.table.DefaultTableModel(
                am1.pegarTodosAmigos(),
                new String[] {
                        "Id", "Nome", "Telefone", "Total de Empréstimos:"
                }));
        jScrollPane1.setViewportView(tableAmigos);

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        descMaisEmprestimos.setForeground(new java.awt.Color(255, 255, 255));
        descMaisEmprestimos.setText("Amigo com mais Empréstimos:");

        idAmigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idAmigo.setForeground(new java.awt.Color(255, 255, 255));
        idAmigo.setText(dados.getIdMaxEmprestimo() + "");

        nomeAmigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeAmigo.setForeground(new java.awt.Color(255, 255, 255));
        nomeAmigo.setText(am1.primeiroNomeAmigoMaxEmprestimo());

        empsAmigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        empsAmigo.setForeground(new java.awt.Color(255, 255, 255));
        empsAmigo.setText(dados.getMaxEmprestimo() + "");

        descTotal.setForeground(new java.awt.Color(255, 255, 255));
        descTotal.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descMaisEmprestimos)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(idAmigo)
                                                .addGap(18, 18, 18)
                                                .addComponent(nomeAmigo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descTotal)
                                        .addComponent(empsAmigo))
                                .addGap(14, 14, 14)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(descMaisEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idAmigo)
                                        .addComponent(nomeAmigo)
                                        .addComponent(empsAmigo))
                                .addGap(0, 13, Short.MAX_VALUE)));

        btnAtualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(descCadastros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)
                                .addContainerGap(280, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(descCadastros)
                                                .addGap(40, 40, 40))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(19, 19, 19)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCancelar)
                                        .addComponent(btnAtualizar))
                                .addGap(18, 18, 18)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });

        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reload();
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
        new TelaAmigos().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private Amigos am1 = new Amigos();
    private PegarDadosAmigos dados = new PegarDadosAmigos();

    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel descCadastros;
    private javax.swing.JLabel descMaisEmprestimos;
    private javax.swing.JLabel descTotal;
    private javax.swing.JLabel empsAmigo;
    private javax.swing.JLabel idAmigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeAmigo;
    private javax.swing.JTable tableAmigos;
    // End of variables declaration
}
