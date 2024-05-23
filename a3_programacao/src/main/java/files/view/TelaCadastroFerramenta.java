package files.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import files.model.Cadastro_Ferramentas;

public class TelaCadastroFerramenta extends javax.swing.JFrame {
    private javax.swing.JLabel DescMarca;
    private javax.swing.JLabel DescNome;
    private javax.swing.JLabel DescValor;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputValor;

    public TelaCadastroFerramenta() {
        initComponents();
    }

    private void initComponents() {

        DescNome = new javax.swing.JLabel();
        DescMarca = new javax.swing.JLabel();
        DescValor = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        inputValor = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Ferramenta");

        DescNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DescNome.setText("Nome:");

        DescMarca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DescMarca.setText("Marca:");

        DescValor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DescValor.setText("Valor:");

        inputMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        inputValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorActionPerformed(evt);
            }
        });

        inputNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescValor)
                    .addComponent(DescMarca)
                    .addComponent(DescNome)
                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(DescNome)
                .addGap(18, 18, 18)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(DescMarca)
                .addGap(18, 18, 18)
                .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(DescValor)
                .addGap(18, 18, 18)
                .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        /**
         * Evento do botão cancelar (chama um método)
         */
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelarPerformedEvent();
            }
        });

        /**
         * Evento do botão cadastrar
         */
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Cadastro_Ferramentas addF = new Cadastro_Ferramentas();
                float custo = 0;

                addF.setNome(inputNome.getText());
                addF.setMarca(inputMarca.getText());

                try{
                    custo = Float.parseFloat(inputValor.getText());
                    addF.setCusto(custo);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite o campo de valor corretamente!");
                }
                addF.cadastrarFerramenta();
            }
        });

        pack();
    }
    /**
     * Método responsável por fechar tela (está sendo chamado pelo botão cancelar)
     */
    private void btnCancelarPerformedEvent() {
        this.dispose();
    }

    private void inputValorActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFerramenta().setVisible(true);
            }
        });
    }

}
