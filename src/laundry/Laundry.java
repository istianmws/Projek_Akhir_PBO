/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import connector.Connector;
import views.Loginpage;

/**
 *
 * @author User
 */
public class Laundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connector coba = new Connector();
        //pemanggilan page login atau awal
        new Loginpage().show();
    }
    
}
