package files.view;

import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import files.DAO.PegarDadoshistEmp;
import files.model.histEmp;

/**
 *
 * @author Brandow
 */
public class TelaVisualizarEmp extends javax.swing.JFrame {

    public TelaVisualizarEmp() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelAmigo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesAmigo = new javax.swing.JTable();
        labAmigo = new javax.swing.JLabel();
        textAmigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnAmigo = new javax.swing.JButton();

        setTitle("Empréstimo de um Amigo");

        jScrollPane1.setViewportView(jTable1);

        // Dispose Alterado
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Tela");
        setBackground(new java.awt.Color(102, 102, 102));

        panelAmigo.setBackground(new java.awt.Color(51, 51, 51));
        panelAmigo.setName("Historico de emp. por amigos");
        panelAmigo.setPreferredSize(new java.awt.Dimension(1080, 520));
        panelAmigo.setVerifyInputWhenFocusTarget(false);

        tablesAmigo.setBackground(new java.awt.Color(102, 102, 102));
        tablesAmigo.setForeground(new java.awt.Color(255, 255, 255));

        tablesAmigo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "id Emp.", "id Amigo", "Amigo", "id Ferra.", "Ferramenta", "Disp.?"
                }) {

            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablesAmigo);

        labAmigo.setBackground(new java.awt.Color(85, 85, 85));
        labAmigo.setForeground(new java.awt.Color(255, 255, 255));
        labAmigo.setText("Amigo:");

        textAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAmigoActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAmigo.setText("Amigos");
        btnAmigo.setForeground(new java.awt.Color(0, 0, 0));
        btnAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new TelaAmigos().setVisible(true);
            }
        });

        javax.swing.GroupLayout panelAmigoLayout = new javax.swing.GroupLayout(panelAmigo);
        panelAmigo.setLayout(panelAmigoLayout);
        panelAmigoLayout.setHorizontalGroup(
                panelAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(panelAmigoLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(labAmigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnConsultar)
                                .addGap(45, 45, 45)
                                .addComponent(btnAmigo)
                                .addContainerGap(525, Short.MAX_VALUE)));
        panelAmigoLayout.setVerticalGroup(
                panelAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAmigoLayout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addGroup(
                                        panelAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(labAmigo)
                                                .addComponent(textAmigo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnConsultar)
                                                .addComponent(btnAmigo))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelAmigo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAmigo, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        getAccessibleContext().setAccessibleName("Histórico de Empréstimos por Cliente e Ferramenta");

        pack();
        setLocationRelativeTo(null);
    }

    private void textAmigoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            int idAmigo = Integer.parseInt(textAmigo.getText());
            PegarDadoshistEmp dao = new PegarDadoshistEmp();
            List<histEmp> emprestimos = dao.getEmprestimos(idAmigo);
            atualizarTabelaAmigo(emprestimos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digita certo, o bobão >:c");
        }

    }

    private void atualizarTabelaAmigo(List<histEmp> emprestimos) {
        DefaultTableModel model = (DefaultTableModel) tablesAmigo.getModel();
        model.setRowCount(0);
        for (histEmp emp : emprestimos) {
            model.addRow(new Object[] {
                    emp.getIdEmprestimo(),
                    emp.getIdAmigo(),
                    emp.getAmigo(),
                    emp.getIdFerramenta(),
                    emp.getFerramenta(),
                    emp.getAtvEmprestimo(),
            });
        }
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
            java.util.logging.Logger.getLogger(TelaVisualizarEmp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEmp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEmp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEmp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisualizarEmp().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnAmigo;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labAmigo;
    private javax.swing.JPanel panelAmigo;
    private javax.swing.JTable tablesAmigo;
    private javax.swing.JTextField textAmigo;
}