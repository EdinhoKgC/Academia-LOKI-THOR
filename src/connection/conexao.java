
package connection;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/lokithor";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection conectaBD(){

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER, PASS);
        } 
        catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com o bando de dados" + ex.getMessage(), ex);
        }

    }
           
           
           
    
}
