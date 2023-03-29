package com.mycompany.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {  
    String url = "jdbc:mysql://localhost:3307/test";
    String user = "root";
    String pass = "";
    Connection connection=null;
    public Connection conectar(){
        try {
            connection = DriverManager.getConnection(url,user,pass);     
            System.out.println("Conectado a la BBDD");   
            } catch (SQLException ex) {
            System.out.println("Se ha producido un error en la conexion");            
        }
   return connection;
    }
}
