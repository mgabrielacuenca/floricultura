/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tecnologia
 */
public class BancoDados {

    public static Object connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost/floricultura", "root", "");
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
