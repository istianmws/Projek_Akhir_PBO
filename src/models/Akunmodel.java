/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import connector.Connector;
import controllers.ControllerLogin;

/**
 *
 * @author User
 */
public class Akunmodel {
    public String role;
    
    //method untuk cek akun
    public void cek(String username, String password) {
        Connector konek = new Connector();
        //instansiai masuk sebagai bagian dari class controllerlogin
        ControllerLogin masuk = new ControllerLogin();
        try{
            String query = "SELECT * FROM `akun` WHERE username ='"+username+"' AND password='"+password+"'";
            konek.statement = konek.koneksi.createStatement();
            konek.resultSet = konek.statement.executeQuery(query);
            
            while(konek.resultSet.next()){
                role = konek.resultSet.getString("role");
            }
            //pengerjaan method role pada controller masuk dengan paramater role
            masuk.role(role);
        }
        catch(java.sql.SQLException e){
        }
    }
    
    //proses daftar user
    public void insertdaftar(String username, String password) {
        Connector konek = new Connector();
        
        try{
            String query = "INSERT INTO `akun`(`username`, `password`) VALUES ('"+username+"','"+password+"')";
            konek.statement = konek.koneksi.createStatement();
            konek.statement.executeUpdate(query);
        }
        catch (java.sql.SQLException e){
        }
    }
    
}
