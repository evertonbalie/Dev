/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoservico.jdbc;

 

import java.sql.*;


public class ModuloConexao {
    
    
    
    public static Connection connector(){
    java.sql.Connection conexao=null;
    String driver = "com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/gestaoserviço_mysql_professorassis";
    String user ="root";
    String password="Root@123";
    
        try {
            Class.forName(driver);
            conexao= DriverManager.getConnection(url,user,password);
            
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
    }
    
    
    
    
}
