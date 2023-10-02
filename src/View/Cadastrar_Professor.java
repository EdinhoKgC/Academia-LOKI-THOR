package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Professor;

import model.dao.ProfessorDao;



/**
 *
 * @author andre
 */
public class Cadastrar_Professor extends javax.swing.JDialog {

    /**
     * Creates new form Cadastrar_Professor
     */
    public Cadastrar_Professor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        bntCadProf = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        bntAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProfessor = new javax.swing.JTable();
        bntAtualizarTabela = new javax.swing.JButton();
        bntCarregar = new javax.swing.JButton();
        bntLimparCampos = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        txtSalario.setBorder(javax.swing.BorderFactory.createTitledBorder("Salário"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        txtHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Trabalhadas"));

        bntCadProf.setText("Cadastrar");
        bntCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadProfActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntAlterar.setText("Alterar");
        bntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAlterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Professor");

        tabelaProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "CPF", "Salário", "Endereço", "Telefone", "Horas Trabalhadas"
            }
        ));
        jScrollPane1.setViewportView(tabelaProfessor);

        bntAtualizarTabela.setText("Atualizar");
        bntAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarTabelaActionPerformed(evt);
            }
        });

        bntCarregar.setText("Carregar");
        bntCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCarregarActionPerformed(evt);
            }
        });

        bntLimparCampos.setText("Limpar");
        bntLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparCamposActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntCadProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntLimparCampos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntCarregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntAtualizarTabela))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCadProf)
                    .addComponent(bntExcluir)
                    .addComponent(bntAlterar)
                    .addComponent(bntLimparCampos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAtualizarTabela)
                    .addComponent(bntCarregar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadProfActionPerformed
      CadastrarProfessor();
      listar();
    }//GEN-LAST:event_bntCadProfActionPerformed

    private void bntAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarTabelaActionPerformed
        listar();
        
    }//GEN-LAST:event_bntAtualizarTabelaActionPerformed

    private void bntCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCarregarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_bntCarregarActionPerformed

    private void bntLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCamposActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bntLimparCamposActionPerformed

    private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed
        AlterarProfessor();
        listar();
        LimparCampos();
    }//GEN-LAST:event_bntAlterarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        excluir();
        listar();
        LimparCampos();
    }//GEN-LAST:event_bntExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastrar_Professor dialog = new Cadastrar_Professor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bntAlterar;
    private javax.swing.JButton bntAtualizarTabela;
    private javax.swing.JButton bntCadProf;
    private javax.swing.JButton bntCarregar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProfessor;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void listar() {

        try {
            ProfessorDao objprofessordao = new ProfessorDao();

            DefaultTableModel model = (DefaultTableModel) tabelaProfessor.getModel();
            model.setNumRows(0);

            ArrayList<Professor> lista = objprofessordao.Pesquisar();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getSalario(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getHoras(),
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar" + erro);
        }
    }
    
    private void CarregarCampos(){
        int setar = tabelaProfessor.getSelectedRow();
        txtID.setText(tabelaProfessor.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaProfessor.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tabelaProfessor.getModel().getValueAt(setar, 2).toString());
        txtSalario.setText(tabelaProfessor.getModel().getValueAt(setar, 3).toString());
        txtEndereco.setText(tabelaProfessor.getModel().getValueAt(setar, 4).toString());
        txtTelefone.setText(tabelaProfessor.getModel().getValueAt(setar, 5).toString());
        txtHoras.setText(tabelaProfessor.getModel().getValueAt(setar, 6).toString());
        
    }
    
    private void CadastrarProfessor(){
        String nome, cpf, endereco, telefone, horas;
      
       int salario ;
       nome = txtNome.getText();
       cpf = txtCpf.getText();
       endereco = txtEndereco.getText();
       telefone = txtTelefone.getText();
       horas = txtHoras.getText();
       salario = Integer.parseInt(txtSalario.getText());
       
       if(salario < 0){
           JOptionPane.showMessageDialog(rootPane, "isira um valor válido para: salário");
       }
       else{
       Professor professores = new Professor();
       professores.setNome(nome);
       professores.setCpf(cpf);
       professores.setEndereco(endereco);
       professores.setHoras(horas);
       professores.setTelefone(telefone);
       professores.setSalario(salario);
       
       ProfessorDao professor = new ProfessorDao();
       professor.save(professores);
       
        JOptionPane.showMessageDialog(rootPane, "Professor Cadastrado!");
       }
    }
    
    private void LimparCampos(){
        txtID.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtSalario.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtHoras.setText("");
        txtNome.requestFocus();
    }
    
    private void AlterarProfessor(){
        String nome, cpf, endereco, telefone, horas;
        int  id, salario;
        nome = txtNome.getText();
        cpf = txtCpf.getText();
        id = Integer.parseInt(txtID.getText());
        salario = Integer.parseInt(txtSalario.getText());
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        horas = txtHoras.getText();
        
        Professor professores = new Professor();
        professores.setId(id);
        professores.setNome(nome);
        professores.setCpf(cpf);
        professores.setSalario(salario);
        professores.setEndereco(endereco);
        professores.setTelefone(telefone);
        professores.setHoras(horas);

        ProfessorDao professor = new ProfessorDao();
        professor.alterar(professores);

        JOptionPane.showMessageDialog(rootPane, "Dados Alterados!");
    }
    
    private void excluir(){
        int id;
        
        id = Integer.parseInt(txtID.getText());
        Professor objprofessor = new Professor();
        objprofessor.setId(id);
        
        ProfessorDao objprofessordao = new ProfessorDao();
        objprofessordao.excluir(objprofessor);
    }
    
}