/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/laundry_pbo";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;
    public ResultSet resultSet;
    
    public Connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi =(Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Connected");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Unconnected");
        }
    }
}