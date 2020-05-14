/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nadir
 */
public class connect {
    Connection con ;
  public connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/pfe","root","");
        }catch(SQLException e) {
                  System.err.println(e);
        }
    }
    Connection obtenirconnextion (){
        return con;
    }
}

