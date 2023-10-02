/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import com.mysql.cj.protocol.Resultset;
import connection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class AlunoDao 
    {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet rs;
    ArrayList<Aluno> lista = new ArrayList<>();
    
    public void save(Aluno aluno){
        String sql = "INSERT INTO aluno (nome,"
                + "cpf,"
                + "idade,"
                + "mensalidade,"
                + "multa,"
                + "endereco,"
                + "telefone) VALUES(?, ?, ?, ?, ?, ? , ?)";

        try {
            connection = new conexao().conectaBD();
            statement = connection.prepareStatement(sql);
            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getCpf());
            statement.setInt(3, aluno.getIdade());
            statement.setString(4, aluno.getMensalidade());
            statement.setFloat(5, aluno.getMulta());
            statement.setString(6, aluno.getEndereco());
            statement.setString(7, aluno.getTelefone());           
            statement.execute();
            statement.close();
        } 
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar aluno" + erro);
        }
    }
    
    public ArrayList<Aluno> Pesquisar(){
        String sql = "select * from aluno";
        connection = new conexao().conectaBD();
        try {
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            
            while(rs.next()){
                Aluno objaluno = new Aluno();
                objaluno.setId(rs.getInt("id"));
                objaluno.setNome(rs.getString("nome"));
                objaluno.setCpf(rs.getString("cpf"));
                objaluno.setIdade(rs.getInt("idade"));
                objaluno.setMensalidade(rs.getString("mensalidade"));
                objaluno.setMulta(rs.getFloat("multa"));
                objaluno.setEndereco(rs.getString("endereco"));
                objaluno.setTelefone(rs.getString("telefone"));
                
                lista.add(objaluno);
            } 
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALunoDao pesquisar" + erro);
        }
        return lista;
    }
    
     public void alterar(Aluno aluno){
        String sql = "UPDATE aluno SET nome = ?, cpf = ?, idade = ?, mensalidade = ?, multa = ?, endereco = ?, telefone = ? WHERE id = ?";
        
        connection = new conexao().conectaBD();
            try {
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getCpf());
            statement.setInt(3, aluno.getIdade());
            statement.setString(4, aluno.getMensalidade());
            statement.setFloat(5, aluno.getMulta());
            statement.setString(6, aluno.getEndereco());
            statement.setString(7, aluno.getTelefone());
            statement.setInt(8, aluno.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar dados do Aluno" + erro);
        }
    }
    
    public void excluir(Aluno aluno){
        String sql = "delete from aluno where id = ?";
        
        connection = new conexao().conectaBD();
        try {
            
            statement = connection.prepareStatement(sql);
            statement.setInt(1, aluno.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir dados do ALuno" + erro);
        }
    }
     
}
