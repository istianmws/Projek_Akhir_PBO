/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JOptionPane;
import models.Akunmodel;
import views.Adminpage;
import views.Loginpage;
import views.Userpage;

/**
 *
 * @author User
 */
public class ControllerLogin {
    //pengecekan akun
    public void ceklogin(String username, String password) {
        //instansiasi loginsebagi bagina dari akunmodel
        Akunmodel login = new Akunmodel();
        //pengerjaan method cek pada akunmodel dengan paramater yang diinput user
        login.cek( username, password);
    }

    //pengecekan login useer atau admin
    public void role(String role) {
        if ("admin".equals(role)){
            new Adminpage().show();
        }else if("user".equals(role)){
            new Userpage().show();
        }else{
            String ERROR_MESSAGE = "username/password salah";
            JOptionPane.showMessageDialog(null,ERROR_MESSAGE);
            new Loginpage().show();
        }
    }
    
}
