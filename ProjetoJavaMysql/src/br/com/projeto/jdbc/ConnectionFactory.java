
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author teste
 */

public class ConnectionFactory {
    
    
    
    public Connection getConnection(){
    
    try{
       
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojavamysql","root","Root@123");
    
    }catch(SQLException erro){

       throw  new RuntimeException(erro);
}
        
    }
}
