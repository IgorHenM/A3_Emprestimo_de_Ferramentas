package files.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import files.model.Cadastro_Amigos;

public class TelaCadastroAmigo extends javax.swing.JFrame {

    
    public TelaCadastroAmigo() {
        initComponents();
    }

                              
    private void initComponents() {

        

        DescNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        DescFone = new javax.swing.JLabel();
        inputFone = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DescNome.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        DescNome.setText("Nome:");

        DescFone.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        DescFone.setText("Fone:");

        btnCancelar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnCadastrar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DescNome)
                            .addComponent(DescFone)
                            .addComponent(inputNome)
                            .addComponent(inputFone, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnCancelar)
                        .addGap(81, 81, 81)
                        .addComponent(btnCadastrar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(DescNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(DescFone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        /**
         * Evento do botão cancelar (chama um método)
         */
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionPerformed();
            }
        });

        /**
         * Evento do botão cadastrar
         */
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Cadastro_Amigos amigo1 = new Cadastro_Amigos();
                String nome = inputNome.getText();
                String fone = inputFone.getText();
                
                amigo1.setNome(nome);
                amigo1.setFone(fone);
                amigo1.cadastrarAmigos();
            }
        });

        pack();
    }                        

    /**
     * Método responsável por fechar tela (está sendo chamado pelo botão cancelar)
     */
    public void btnCancelarActionPerformed() {
        this.dispose();
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
            java.util.logging.Logger.getLogger(TelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAmigo().setVisible(true);
            }
        });
    }

                         
    private javax.swing.JLabel DescFone;
    private javax.swing.JLabel DescNome;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField inputFone;
    private javax.swing.JTextField inputNome;
                       
}
