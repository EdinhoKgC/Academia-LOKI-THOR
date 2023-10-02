/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Funcionario;
import model.dao.FuncionarioDao;

/**
 *
 * @author andre
 */
public class Cadastrar_Funcionario extends javax.swing.JDialog {

    /**
     * Creates new form Cadastrar_Funcionario
     */
    public Cadastrar_Funcionario(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtFuncao = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        bntCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bntExcluir = new javax.swing.JButton();
        bntAlterar = new javax.swing.JButton();
        bntLimparCampos = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        bntAtualizarTabela = new javax.swing.JButton();
        bntCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        txtSalario.setBorder(javax.swing.BorderFactory.createTitledBorder("Salário"));
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtFuncao.setBorder(javax.swing.BorderFactory.createTitledBorder("Função"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        bntCadastrar.setText("Cadastrar");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar Funcionário");

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntAlterar.setText("Alterar");

        bntLimparCampos.setText("Limpar");
        bntLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparCamposActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFuncao))
                    .addComponent(txtEndereco)
                    .addComponent(txtTelefone)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bntCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntLimparCampos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCadastrar)
                    .addComponent(bntExcluir)
                    .addComponent(bntAlterar)
                    .addComponent(bntLimparCampos))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Salário", "Função", "Telefone", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionario);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntCarregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntAtualizarTabela)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAtualizarTabela)
                    .addComponent(bntCarregar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
      CadastrarFuncionario();
      listar();
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void bntAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarTabelaActionPerformed
       listar();
    }//GEN-LAST:event_bntAtualizarTabelaActionPerformed

    private void bntCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCarregarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_bntCarregarActionPerformed

    private void bntLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCamposActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bntLimparCamposActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        excluir();
        listar();
        LimparCampos();
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastrar_Funcionario dialog = new Cadastrar_Funcionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton bntCarregar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
private void listar() {

        try {
            FuncionarioDao objfuncionariodao = new FuncionarioDao();

            DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
            model.setNumRows(0);

            ArrayList<Funcionario> lista = objfuncionariodao.Pesquisar();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getSalario(),
                    lista.get(num).getFuncao(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getEndereco(),                   
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar" + erro);
        }
    }

    private void CarregarCampos(){
        int setar = tabelaFuncionario.getSelectedRow();
        txtID.setText(tabelaFuncionario.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaFuncionario.getModel().getValueAt(setar, 1).toString());
        txtSalario.setText(tabelaFuncionario.getModel().getValueAt(setar, 2).toString());
        txtFuncao.setText(tabelaFuncionario.getModel().getValueAt(setar, 3).toString());
        txtTelefone.setText(tabelaFuncionario.getModel().getValueAt(setar, 4).toString());
        txtEndereco.setText(tabelaFuncionario.getModel().getValueAt(setar, 5).toString());
        
    }
    
    private void CadastrarFuncionario(){
        String nome, funcao, endereco, telefone;
      float salario;
      
      
          
       nome = txtNome.getText();
       funcao = txtFuncao.getText();
       endereco = txtEndereco.getText();
       telefone = txtTelefone.getText();
       salario = Float.parseFloat(txtSalario.getText());
       
       if(salario < 0){
           JOptionPane.showMessageDialog(rootPane, "isira um valor válido para: salário");
       }
       else{
       Funcionario funcionarios = new Funcionario();
       funcionarios.setNome(nome);
       funcionarios.setEndereco(endereco);
       funcionarios.setFuncao(funcao);
       funcionarios.setTelefone(telefone);
       funcionarios.setSalario(salario);
       
       FuncionarioDao funcionario = new FuncionarioDao();
       funcionario.save(funcionarios);
       
        JOptionPane.showMessageDialog(rootPane, "Funcionário Cadastrado!");
       }
    }
    
    private void LimparCampos(){
        txtID.setText("");
        txtNome.setText("");
        txtFuncao.setText("");        
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtSalario.setText("");
        txtNome.requestFocus();
    }

    private void excluir(){
        int id;
        
        id = Integer.parseInt(txtID.getText());
        Funcionario objfuncionario = new Funcionario();
        objfuncionario.setId(id);
        
        FuncionarioDao objfuncionariodao = new FuncionarioDao();
        objfuncionariodao.excluir(objfuncionario);
    }
    
}
