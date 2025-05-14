package com.example.jpa.beforejpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  //dsdd

public class Dbconnection {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/students";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789";

    public  Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("error upload driver MySQL");
        }
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

  public void closeConnection(Connection connection) {
    if (connection != null) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}
}
