
package model.dao;
import connection.conexao;
import model.bean.Visitante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VisitanteDao {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet rs;
    ArrayList<Visitante> lista = new ArrayList<>();
            
    public void save(Visitante visitante){
        String sql = "INSERT INTO visitante (nome,"
                + "cpf,"
                + "valorpagar) VALUES(?, ?, ?)";

        try {
            connection = new conexao().conectaBD();
            statement = connection.prepareStatement(sql);
            statement.setString(1, visitante.getNome());
            statement.setString(2, visitante.getCpf());
            statement.setInt(3, visitante.getValorpagar());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Visitante" + erro);
        }
        
    }
    
    public ArrayList<Visitante> Pesquisar(){
        String sql = "select * from visitante";
        connection = new conexao().conectaBD();
        try {
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            
            while(rs.next()){
                Visitante objvisitante = new Visitante();
                objvisitante.setId(rs.getInt("id"));
                objvisitante.setNome(rs.getString("nome"));
                objvisitante.setCpf(rs.getString("cpf"));
                objvisitante.setValorpagar(rs.getInt("valorpagar"));
                
                lista.add(objvisitante);
            } 
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VisitanteDAO pesquisar" + erro);
        }
        return lista;
    }
    
    public void alterar(Visitante visitante){
        String sql = "UPDATE visitante SET nome = ?, cpf = ?, valorpagar = ? WHERE id = ?";
        
        connection = new conexao().conectaBD();
            try {
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, visitante.getNome());
            statement.setString(2, visitante.getCpf());
            statement.setInt(3, visitante.getValorpagar());
            statement.setInt(4, visitante.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar dados do Visitante" + erro);
        }
    }
    
    public void excluir(Visitante visitante){
        String sql = "delete from visitante where id = ?";
        
        connection = new conexao().conectaBD();
        try {
            
            statement = connection.prepareStatement(sql);
            statement.setInt(1, visitante.getId());
            statement.execute();
            statement.close();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir dados do Visitante" + erro);
        }
    }
    
}
