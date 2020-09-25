/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloddbank2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class connectjdbc {
    
    Connection conn=null;
    
     public static Connection ConnecrDb(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank2","root","203040na");
               JOptionPane.showMessageDialog(null, "Database connected !!! ");
               return conn;
         }
         catch(Exception e){
          JOptionPane.showMessageDialog(null, "Database Connection Failed !!! ");
          return null;
         }
     }
   
    
}
