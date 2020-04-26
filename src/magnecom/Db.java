/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnecom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author evilnapsis
 */
public class Db {

    /**
     *
     */
    public static Connection con;
    public static Connection connect(){
    String url = "jdbc:mysql://localhost:3306/idyfact";
    String user = "root";
    String pass = "";
    System.out.println("Conectando");
    try{
         con = DriverManager.getConnection(url,user,pass);
    
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    return con;
    }

    PreparedStatement prepareStatement(String select_into_facturafechametodo_de_pagouso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



      
}
