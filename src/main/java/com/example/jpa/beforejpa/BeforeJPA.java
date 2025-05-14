/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.jpa.beforejpa;

import java.sql.Connection;
import java.sql.SQLException;

public class BeforeJPA {

    public static void main(String[] args) {
      System.out.println("Hello World!");
      BookDAO bd = new BookDAO();
       // bd.addBook(new Book("12345678","XYZ"));
      System.out.println( bd.getAbook("134").toString());
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
