/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Felipe
 */
public class TelaDetalhes extends javax.swing.JDialog {

    /**
     * Creates new form TelaDetalhes
     */
    public TelaDetalhes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagens/HDesk.png")).getImage());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        cbUrgencia = new javax.swing.JComboBox<>();
        lblVoltarCham = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextPane();
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfProtocolo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDtAbertura = new javax.swing.JTextField();
        tfDtAtendimento = new javax.swing.JTextField();
        tfDtConclusao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Desk University");
        setMinimumSize(new java.awt.Dimension(538, 680));

        jPanel7.setBackground(new java.awt.Color(152, 202, 239));
        jPanel7.setMinimumSize(new java.awt.Dimension(538, 525));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 525));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Descrição");

        jLabel39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel39.setText("Departamento");

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setText("Título");

        tfMatricula.setEditable(false);
        tfMatricula.setBackground(new java.awt.Color(255, 255, 255));
        tfMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMatricula.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        cbDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração", "Diretoria", "Financeiro", "Marketing", "RH", "Vendas" }));
        cbDepartamento.setEnabled(false);
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel41.setText("Urgência");

        tfTitulo.setEditable(false);
        tfTitulo.setBackground(new java.awt.Color(255, 255, 255));
        tfTitulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 7, 3, 3));
        tfTitulo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfTitulo.setMargin(new java.awt.Insets(3, 3, 3, 3));

        cbUrgencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbUrgencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Baixa", "Média", "Alta" }));
        cbUrgencia.setEnabled(false);

        lblVoltarCham.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblVoltarCham.setForeground(new java.awt.Color(0, 51, 255));
        lblVoltarCham.setText("<< Voltar");
        lblVoltarCham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarChamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltarChamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltarChamMouseExited(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel42.setText("Matrícula");

        tfDescricao.setEditable(false);
        tfDescricao.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 7, 3, 3));
        tfDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDescricao.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(tfDescricao);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo");

        cbTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dúvida", "Requisição" }));
        cbTipo.setEnabled(false);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Protocolo");

        tfProtocolo.setEditable(false);
        tfProtocolo.setBackground(new java.awt.Color(255, 255, 255));
        tfProtocolo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfProtocolo.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Conclusão");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Data de Abertura");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Data de Atendimento");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Data de Conclusão");

        tfDtAbertura.setEditable(false);
        tfDtAbertura.setBackground(new java.awt.Color(255, 255, 255));
        tfDtAbertura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDtAbertura.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfDtAbertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDtAberturaActionPerformed(evt);
            }
        });

        tfDtAtendimento.setEditable(false);
        tfDtAtendimento.setBackground(new java.awt.Color(255, 255, 255));
        tfDtAtendimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDtAtendimento.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfDtAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDtAtendimentoActionPerformed(evt);
            }
        });

        tfDtConclusao.setEditable(false);
        tfDtConclusao.setBackground(new java.awt.Color(255, 255, 255));
        tfDtConclusao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDtConclusao.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfDtConclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDtConclusaoActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 7, 3, 3));
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextPane1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVoltarCham)
                            .addComponent(jLabel3)
                            .addComponent(jLabel37)
                            .addComponent(jLabel40))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTitulo)
                            .addComponent(jScrollPane7)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addGap(134, 134, 134))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfDtAbertura, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel42)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 139, Short.MAX_VALUE)
                                                    .addComponent(tfMatricula, javax.swing.GroupLayout.Alignment.LEADING))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDtAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbUrgencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDtConclusao)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel42)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDtAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDtAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDtConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVoltarCham)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDepartamentoActionPerformed

    private void lblVoltarChamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarChamMouseClicked
        dispose();
    }//GEN-LAST:event_lblVoltarChamMouseClicked

    private void lblVoltarChamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarChamMouseEntered
        lblVoltarCham.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblVoltarChamMouseEntered

    private void lblVoltarChamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarChamMouseExited
        lblVoltarCham.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblVoltarChamMouseExited

    private void tfDtAberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDtAberturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDtAberturaActionPerformed

    private void tfDtAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDtAtendimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDtAtendimentoActionPerformed

    private void tfDtConclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDtConclusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDtConclusaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDetalhes dialog = new TelaDetalhes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbTipo;
    public javax.swing.JComboBox<String> cbUrgencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblVoltarCham;
    public javax.swing.JTextPane tfDescricao;
    public javax.swing.JTextField tfDtAbertura;
    public javax.swing.JTextField tfDtAtendimento;
    public javax.swing.JTextField tfDtConclusao;
    public javax.swing.JTextField tfMatricula;
    public javax.swing.JTextField tfProtocolo;
    public javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
