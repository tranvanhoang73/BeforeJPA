/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.jpa.beforejpa;

import java.sql.Connection;
import java.sql.SQLException;

public class BeforeJPA {

    public static void main(String[] args) {
      System.out.println("Hello World you!");//update
      BookDAO bd = new BookDAO();
     int so = bd.addBook(new Book("128","XYZ"));
     System.out.println( "so dong = " + so);
//        
//     Dbconnection db = new Dbconnection();
//     Connection cn = null;
//     try{
//        cn  = db.getConnection();
//        System.out.println("Done!");
//     
//     }catch(SQLException e){
//          System.out.println("Not Done!");         
//     }
//     finally{
//         db.closeConnection(cn);
//          System.out.println("Close Connection!");     
//     }
    
    }
}
