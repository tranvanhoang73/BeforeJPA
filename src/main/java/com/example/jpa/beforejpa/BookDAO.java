
package com.example.jpa.beforejpa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// update nhieu lam

public class BookDAO {
    
    Dbconnection db = new Dbconnection();   
    
    public int addBook(Book b){
        int so =0;
        String sql =  "INSERT INTO `students`.`book` (`isbn`, `title`) VALUES (?, ?)";  
        try{
            Connection cn = db.getConnection();// UPDATE HÊRE UPDATE AGAIN
            PreparedStatement  pre = cn.prepareStatement(sql);
            pre.setString(1, b.getIsbn());
            pre.setString(2, b.getTitle());
            so = pre.executeUpdate();       
        }catch(SQLException e){
            
            System.out.println("loi connect.....");
            
        }
       return so;     
    }
    
    
    public Book getAbook(String isbn){
        Book  b = null;
       String sql = "SELECT * FROM students.book where isbn = ?";
       try{
            Connection cn = db.getConnection();
            PreparedStatement  pre = cn.prepareStatement(sql);
            pre.setString(1, isbn); 
            ResultSet rs =  pre.executeQuery();
            
            while (rs.next()){
                b = new Book(rs.getString(1),rs.getString(2));
            }           
        }catch(SQLException e){         
            System.out.println("loi connect.....");         
        }        
        return b;        
    }
    
    public int addBook1(Book b){
         int so = 0;
         String sql =  "INSERT INTO `students`.`book` (`isbn`, `title`) VALUES (?, ?)";  
         try{
            Connection cn = db.getConnection();
            PreparedStatement pre = cn.prepareStatement(sql);
            pre.setString(1, b.getIsbn());pre.setString(2, b.getTitle());         
            so = pre.executeUpdate();
 
         }catch(SQLException e){
            System.out.println("error....");
         }       
         return so;        
    }
  
}
