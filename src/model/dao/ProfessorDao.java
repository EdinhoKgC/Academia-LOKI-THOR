package model.dao;

import connection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Professor;

/**
 *
 * @author andre
 */
public class ProfessorDao {
     Connection connection = null;
    PreparedStatement statement = null;
    ResultSet rs;
    ArrayList<Professor> lista = new ArrayList<>();
    
    public void save(Professor professor){
        String sql = "INSERT INTO professor (nome,"
                + "cpf,"
                + "salario,"
                + "endereco,"
                + "telefone,"
                + "horas) VALUES(?, ?, ?, ?, ?, ?)";

        try {
            connection = new conexao().conectaBD();
            statement = connection.prepareStatement(sql);
            statement.setString(1, professor.getNome());
            statement.setString(2, professor.getCpf());
            statement.setInt(3, professor.getSalario());
            statement.setString(4, professor.getEndereco());
            statement.setString(5, professor.getTelefone());
            statement.setString(6, professor.getHoras());
            statement.execute();
            statement.close();
        } 
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Professor" + erro);
        }
    }
    public ArrayList<Professor> Pesquisar(){
        String sql = "select * from professor";
        connection = new conexao().conectaBD();
        try {
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            
            while(rs.next()){
                Professor objprofessor = new Professor();
                objprofessor.setId(rs.getInt("id"));
                objprofessor.setNome(rs.getString("nome"));
                objprofessor.setCpf(rs.getString("cpf"));
                objprofessor.setSalario(rs.getInt("salario"));
                objprofessor.setEndereco(rs.getString("endereco"));
                objprofessor.setTelefone(rs.getString("telefone"));
                objprofessor.setHoras(rs.getString("horas"));
                
                lista.add(objprofessor);
            } 
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO pesquisar" + erro);
        }
        return lista;
    }
    
    public void alterar(Professor professor){
        String sql = "UPDATE professor SET nome = ?, cpf = ?, salario = ?, endereco = ?, telefone = ?, horas = ? WHERE id = ?";
        
        connection = new conexao().conectaBD();
            try {           
            statement = connection.prepareStatement(sql);
            statement.setString(1, professor.getNome());
            statement.setString(2, professor.getCpf());
            statement.setInt(3, professor.getSalario());
            statement.setString(4, professor.getEndereco());
            statement.setString(5, professor.getTelefone());
            statement.setString(6, professor.getHoras());
            statement.setInt(7, professor.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar dados do Professor" + erro);
        }
    }
    
    public void excluir(Professor professor){
        String sql = "delete from professor where id = ?";
        
        connection = new conexao().conectaBD();
        try {
            
            statement = connection.prepareStatement(sql);
            statement.setInt(1, professor.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir dados do Professor" + erro);
        }
    }
    
    
}
