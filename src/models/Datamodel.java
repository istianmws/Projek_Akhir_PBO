/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import connector.Connector;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Datamodel {

    //method update admin
    public void update(String id, String nama, String hp, String tgl, String berat, String harga, String bayar, String alamat) {
        Connector konek = new Connector();
        try {
            konek.statement = konek.koneksi.createStatement();
            konek.statement.executeUpdate("UPDATE data set " 
            + "nama     ='"     + nama   + "', "
            + "hp       ='"     + hp     + "', "
            + "tgl      ='"     + tgl    + "', "
            + "berat    ='"     + berat  + "', "
            + "harga    ='"     + harga  + "', "        
            + "total    ='"     + bayar  + "', "        
            + "alamat   ='"     + alamat + "'  " 
            + "WHERE id_pesanan ='" +id+   "'");
        
        } catch (Exception e) {
        e.printStackTrace();
      }
    }

    //methode delete
    public void delete(String id) {
         Connector konek = new Connector();
        int jawab;
        try {
            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                konek.statement = konek.koneksi.createStatement();
                konek.statement.executeUpdate("DELETE FROM data WHERE id_pesanan='" +id+ "'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //methode simpan
    public void simpan(String nama, String hp, String tgl, String berat, String harga, String bayar, String alamat) {
        Connector konek = new Connector();
        try {
            String query = "INSERT INTO `data`(`nama`, `hp`, `tgl`, `berat`, `harga`, `total`, `alamat` )"
                           +" VALUES ('"+nama+"','"+hp+"','"+tgl+"','"+berat+"','"+harga+"','"+bayar+"','"+alamat+"')";
            konek.statement = konek.koneksi.createStatement();
            konek.statement.executeUpdate(query);
        
        } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
