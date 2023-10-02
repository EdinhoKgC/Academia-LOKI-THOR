/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
public class Interface extends javax.swing.JFrame {


    public Interface() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bntCadVisitante = new javax.swing.JButton();
        bntCadFuncionario = new javax.swing.JButton();
        bntCadProf = new javax.swing.JButton();
        bntCadAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Irmãos Loki e Thor");

        bntCadVisitante.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bntCadVisitante.setText(" Visitante");
        bntCadVisitante.setActionCommand("bntCadVisitante");
        bntCadVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadVisitanteActionPerformed(evt);
            }
        });

        bntCadFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bntCadFuncionario.setText(" Funcionário");
        bntCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadFuncionarioActionPerformed(evt);
            }
        });

        bntCadProf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bntCadProf.setText("Professor");
        bntCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadProfActionPerformed(evt);
            }
        });

        bntCadAluno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bntCadAluno.setText("Aluno");
        bntCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(bntCadVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntCadProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bntCadVisitante)
                .addGap(18, 18, 18)
                .addComponent(bntCadFuncionario)
                .addGap(18, 18, 18)
                .addComponent(bntCadProf)
                .addGap(18, 18, 18)
                .addComponent(bntCadAluno)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCadVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadVisitanteActionPerformed
       Cadastrar_Visitante cadastrarVisitante = new Cadastrar_Visitante(this, rootPaneCheckingEnabled);
        cadastrarVisitante.setVisible(true);
    }//GEN-LAST:event_bntCadVisitanteActionPerformed

    private void bntCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadFuncionarioActionPerformed
               Cadastrar_Funcionario cadastrarFuncionario = new Cadastrar_Funcionario(this, rootPaneCheckingEnabled);
               cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_bntCadFuncionarioActionPerformed

    private void bntCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadProfActionPerformed
        Cadastrar_Professor cadastrarProfessor = new Cadastrar_Professor(this, rootPaneCheckingEnabled);
               cadastrarProfessor.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bntCadProfActionPerformed

    private void bntCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadAlunoActionPerformed
      Cadastrar_Aluno cadastrarAluno = new Cadastrar_Aluno(this, rootPaneCheckingEnabled);
               cadastrarAluno.setVisible(true);
    }//GEN-LAST:event_bntCadAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadAluno;
    private javax.swing.JButton bntCadFuncionario;
    private javax.swing.JButton bntCadProf;
    private javax.swing.JButton bntCadVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
