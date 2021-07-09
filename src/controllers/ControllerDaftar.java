/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JOptionPane;
import models.Akunmodel;
import views.Loginpage;

/**
 *
 * @author User
 */
public class ControllerDaftar {
    
    //method untuk mengambil inputan username dan password oleh user
    public void prosesdaftar(String username, String password) {
        //instansiasi daftar sebagai bagian dari Akunmodel
        Akunmodel daftar = new Akunmodel();
        //melakukan method insertdaftar untuk medaftarkan diri
        daftar.insertdaftar( username, password);
        String INFO_MESSAGE = "berhasil signup";
        JOptionPane.showMessageDialog(null,INFO_MESSAGE);
        //
        this.kembali();
    }
    //method logout
    public void kembali(){
        new Loginpage().show();
    }
}
