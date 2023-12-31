/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.dao.AlunoDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Cadastrar_Aluno extends javax.swing.JDialog {

    /**
     * Creates new form Cadastrar_Aluno
     */
    public Cadastrar_Aluno(java.awt.Frame parent, boolean modal) {
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
        txtCpf = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtMensalidade = new javax.swing.JTextField();
        txtMulta = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        CmbPlanMens = new javax.swing.JComboBox<>();
        bntCadAluno = new javax.swing.JButton();
        bntAtualizar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        bntCarregar = new javax.swing.JButton();
        bntLimparCampos = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        txtIdade.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));

        txtMensalidade.setEditable(false);
        txtMensalidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensalidade"));

        txtMulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Multa"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        CmbPlanMens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Básico", "Médio", "Completo" }));
        CmbPlanMens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbPlanMensActionPerformed(evt);
            }
        });

        bntCadAluno.setText("Cadastrar");
        bntCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadAlunoActionPerformed(evt);
            }
        });

        bntAtualizar.setText("Alterar");
        bntAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Aluno");

        btnAtualizarTabela.setText("Atualizar");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "CPF", "Idade", "Mensalidade", "Multa", "Endereço", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabelaAluno);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMensalidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CmbPlanMens, 0, 161, Short.MAX_VALUE))
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bntCadAluno)
                                        .addGap(17, 17, 17)
                                        .addComponent(bntExcluir)
                                        .addGap(17, 17, 17)
                                        .addComponent(bntAtualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bntLimparCampos))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntCarregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarTabela)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbPlanMens, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntAtualizar)
                        .addComponent(bntLimparCampos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarTabela)
                    .addComponent(bntCarregar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void bntCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadAlunoActionPerformed
        CadastrarAluno();
        listar();
    }//GEN-LAST:event_bntCadAlunoActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        listar();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void bntCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCarregarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_bntCarregarActionPerformed

    private void bntLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCamposActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bntLimparCamposActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
        AlterarAluno();
        listar();
        LimparCampos();

    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void CmbPlanMensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbPlanMensActionPerformed
        String valorSelecionado = CmbPlanMens.getSelectedItem().toString();

        if (valorSelecionado == "Básico") {
            txtMensalidade.setText("R$70,00");
        } else if (valorSelecionado == "Médio") {
            txtMensalidade.setText("R$90,00");
        } else if (valorSelecionado == "Completo") {
            txtMensalidade.setText("R$120,00");
        } else {
            txtMensalidade.setText("------");
        }

    }//GEN-LAST:event_CmbPlanMensActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastrar_Aluno dialog = new Cadastrar_Aluno(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> CmbPlanMens;
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntCadAluno;
    private javax.swing.JButton bntCarregar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntLimparCampos;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAluno;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtMensalidade;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void listar() {

        try {
            AlunoDao objalunodao = new AlunoDao();

            DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
            model.setNumRows(0);

            ArrayList<Aluno> lista = objalunodao.Pesquisar();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getIdade(),
                    lista.get(num).getMensalidade(),
                    lista.get(num).getMulta(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar" + erro);
        }
    }

    private void CarregarCampos() {
        int setar = tabelaAluno.getSelectedRow();
        txtID.setText(tabelaAluno.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaAluno.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tabelaAluno.getModel().getValueAt(setar, 2).toString());
        txtIdade.setText(tabelaAluno.getModel().getValueAt(setar, 3).toString());
        txtMensalidade.setText(tabelaAluno.getModel().getValueAt(setar, 4).toString());
        txtMulta.setText(tabelaAluno.getModel().getValueAt(setar, 5).toString());
        txtEndereco.setText(tabelaAluno.getModel().getValueAt(setar, 6).toString());
        txtTelefone.setText(tabelaAluno.getModel().getValueAt(setar, 7).toString());
    }

    private void CadastrarAluno() {
        String nome, cpf, telefone, endereco, mensalidade;
        int idade;
        float multa;

        nome = txtNome.getText();
        cpf = txtCpf.getText();
        endereco = txtEndereco.getText();
        mensalidade = txtMensalidade.getText();
        telefone = txtTelefone.getText();
        idade = Integer.parseInt(txtIdade.getText());
        multa = Float.parseFloat(txtMulta.getText());
        if(idade < 10){
           JOptionPane.showMessageDialog(rootPane, "isira um valor válido para: idade");
       }
        else{
            if(multa < 0){
                JOptionPane.showMessageDialog(rootPane, "isira um valor válido para: multa");
            }
            else{
                Aluno alunos = new Aluno();
        alunos.setNome(nome);
        alunos.setCpf(cpf);
        alunos.setTelefone(telefone);
        alunos.setEndereco(endereco);
        alunos.setMensalidade(mensalidade);
        alunos.setIdade(idade);
        alunos.setMulta(multa);

        AlunoDao aluno = new AlunoDao();
        aluno.save(alunos);

        JOptionPane.showMessageDialog(rootPane, "Aluno Cadastrado!");
            }
        }
        
        
    }

    private void LimparCampos() {
        txtID.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtMensalidade.setText("");
        txtIdade.setText("");
        txtMulta.setText("");
        txtNome.requestFocus();
    }

    private void AlterarAluno() {
        String nome, cpf, mensalidade, endereco, telefone;
        int id, idade;
        float multa;

        nome = txtNome.getText();
        cpf = txtCpf.getText();
        id = Integer.parseInt(txtID.getText());
        idade = Integer.parseInt(txtIdade.getText());
        mensalidade = txtMensalidade.getText();
        multa = Float.parseFloat(txtMulta.getText());
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        
        Aluno alunos = new Aluno();
        alunos.setId(id);
        alunos.setNome(nome);
        alunos.setCpf(cpf);
        alunos.setIdade(idade);
        alunos.setMensalidade(mensalidade);
        alunos.setMulta(multa);
        alunos.setEndereco(endereco);
        alunos.setTelefone(telefone);

        AlunoDao aluno = new AlunoDao();
        aluno.alterar(alunos);

        JOptionPane.showMessageDialog(rootPane, "Dados Alterados!");
    }

    private void excluir() {
        int id;

        id = Integer.parseInt(txtID.getText());
        Aluno objaluno = new Aluno();
        objaluno.setId(id);

        AlunoDao objalunodao = new AlunoDao();
        objalunodao.excluir(objaluno);
    }

}
