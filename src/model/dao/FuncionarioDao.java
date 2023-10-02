package model.dao;

import connection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Funcionario;

public class FuncionarioDao {
    Connection connection = null;
    PreparedStatement statement = null; 
    ResultSet rs;
    ArrayList<Funcionario> lista = new ArrayList<>();    
    
    public void save(Funcionario funcionario){
        String sql = "INSERT INTO funcionario (nome,"
                + "salario,"
                + "funcao,"
                + "endereco,"
                + "telefone) VALUES(?, ?, ?, ?, ?)";

        try {
            connection = new conexao().conectaBD();
            statement = connection.prepareStatement(sql);
            statement.setString(1, funcionario.getNome());
            statement.setFloat(2, funcionario.getSalario());
            statement.setString(3, funcionario.getFuncao());
            statement.setString(4, funcionario.getEndereco());
            statement.setString(5, funcionario.getTelefone());
            statement.execute();
            statement.close();
        } 
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Funcionário" + erro);
        }
    }
    
    public ArrayList<Funcionario> Pesquisar(){
        String sql = "select * from funcionario";
        connection = new conexao().conectaBD();
        try {
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            
            while(rs.next()){
                Funcionario objfuncionario = new Funcionario();
                objfuncionario.setId(rs.getInt("id"));
                objfuncionario.setNome(rs.getString("nome"));
                objfuncionario.setSalario(rs.getFloat("salario"));
                objfuncionario.setFuncao(rs.getString("funcao"));
                objfuncionario.setEndereco(rs.getString("endereco"));
                objfuncionario.setTelefone(rs.getString("telefone"));
                
                lista.add(objfuncionario);
            } 
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDao pesquisar" + erro);
        }
        return lista;
    }
    
    public void excluir(Funcionario funcionario){
        String sql = "delete from funcionario where id = ?";
        
        connection = new conexao().conectaBD();
        try {
            
            statement = connection.prepareStatement(sql);
            statement.setInt(1, funcionario.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir dados do Funcionario" + erro);
        }
    }
    
}       
