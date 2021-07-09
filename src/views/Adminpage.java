/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import connector.Connector;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Datamodel;

/**
 *
 * @author User
 */
public class Adminpage extends javax.swing.JFrame {

    /**
     * Creates new form Adminpage
     */
    public DefaultTableModel tabModel;
    int beratt, hargaa, all;
    public Adminpage() {
        initComponents();
        tgl(); //instansiasi tanggal
        headertabel();
        tampildata();
        input_id.setEnabled(false);
        delete.setEnabled(false);
        update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input_hp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_tanggal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        input_berat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        input_bayar = new javax.swing.JTextField();
        input_harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_alamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelData = new javax.swing.JTable();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pengelolaan Data Transaksi Laundry");

        jLabel2.setText("Nama");

        input_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_idActionPerformed(evt);
            }
        });
        input_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_idKeyTyped(evt);
            }
        });

        jLabel3.setText("Id");

        jLabel4.setText("Nomor HP");

        input_hp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_hpKeyTyped(evt);
            }
        });

        jLabel5.setText("Tanggal");

        input_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tanggalActionPerformed(evt);
            }
        });

        jLabel6.setText("Berat Pakaian");

        input_berat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_beratKeyTyped(evt);
            }
        });

        jLabel7.setText("Harga");

        jLabel8.setText("Total Bayar");

        input_bayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_bayarMouseClicked(evt);
            }
        });
        input_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_bayarActionPerformed(evt);
            }
        });
        input_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_bayarKeyTyped(evt);
            }
        });

        input_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_hargaKeyTyped(evt);
            }
        });

        jLabel9.setText("Alamat");

        TabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Id", "Nama", "No Hp", "Alamat", "Berat (Kg)", "Harga (Rp/Kg)", "Total Bayar (Rp)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelData);

        save.setText("Simpan");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_alamat))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_nama))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_id))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_hp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_tanggal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_berat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_harga))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(delete)
                                .addGap(18, 18, 18)
                                .addComponent(refresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(save)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(refresh)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //method generated tanggal
    public void tgl(){
        Date x = new Date();
        SimpleDateFormat y = new SimpleDateFormat("yyyy-MM-dd"); 
        input_tanggal.setText(y.format(x));
    }
    
    //menampilkan data dalam tabel
    public void tampildata(){
        try {
        Connector konek = new Connector();
        String query = ("SELECT * FROM `data` " );
        konek.statement = konek.koneksi.createStatement();
        konek.resultSet = konek.statement.executeQuery(query);
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        
        while (konek.resultSet.next()) {
            Object[] data = {
                
                konek.resultSet.getString("id_pesanan"),
                konek.resultSet.getString("nama"),
                konek.resultSet.getString("hp"),
                konek.resultSet.getString("tgl"),
                konek.resultSet.getString("berat"),
                konek.resultSet.getString("harga"),
                konek.resultSet.getString("total"),
                konek.resultSet.getString("alamat")
            };

            tabModel.addRow(data);
            }
        } catch(Exception e) {
        e.printStackTrace();
        }
    }
    
    //bagian header tabel
    public void headertabel() {
        Object[] header = {
          "ID","Nama", "No HP", "Tanggal", "Berat", "Harga", "Total", "Alamat"
        };
        tabModel = new DefaultTableModel(null, header);
        TabelData.setModel(tabModel);
    }
    
    private void input_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_idActionPerformed

    private void input_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tanggalActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        input_id.setText("");
        input_nama.setText("");
        input_hp.setText("");
        input_tanggal.setText("");
        input_berat.setText("");
        input_harga.setText("");
        input_bayar.setText("");
        input_alamat.setText("");
        input_id.setEnabled(true);
        delete.setEnabled(false);
        update.setEnabled(false);
        
    }//GEN-LAST:event_refreshActionPerformed

    private void input_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_bayarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_input_bayarActionPerformed

    private void TabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataMouseClicked
        // TODO add your handling code here:
        input_nama.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 1).toString());
        input_id.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 0).toString());
        input_hp.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 2).toString());
        input_tanggal.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 3).toString());
        input_berat.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 4).toString());
        input_harga.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 5).toString());
        input_bayar.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 6).toString());
        input_alamat.setText(TabelData.getValueAt(TabelData.getSelectedRow(), 7).toString());
        save.setEnabled(false);
        update.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_TabelDataMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Datamodel update_isi = new Datamodel();
        String id       = input_id.getText();
        String nama     = input_nama.getText();
        String hp       = input_hp.getText();
        String tgl      = input_tanggal.getText();
        String berat    = input_berat.getText();
        String harga    = input_harga.getText();
        String bayar    = input_bayar.getText();
        String alamat   = input_alamat.getText();
        
        update_isi.update(id, nama, hp, tgl, berat, harga, bayar, alamat);
        tampildata();
        JOptionPane.showMessageDialog(null, "Update Berhasil");
        save.setEnabled(true);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        Datamodel delete_isi = new Datamodel();
        String id       = input_id.getText();
        delete_isi.delete(id);
        tampildata();
        save.setEnabled(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        Datamodel simpan_isi = new Datamodel();
        String id       = input_id.getText();
        String nama     = input_nama.getText();
        String hp       = input_hp.getText();
        String tgl      = input_tanggal.getText();
        String berat    = input_berat.getText();
        String harga    = input_harga.getText();
        String bayar    = input_bayar.getText();
        String alamat   = input_alamat.getText();
        
        simpan_isi.simpan( nama, hp, tgl, berat, harga, bayar, alamat);
        tampildata();
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan"); 
    }//GEN-LAST:event_saveActionPerformed

    private void input_bayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_bayarMouseClicked
        // TODO add your handling code here:
        beratt=Integer.parseInt(input_berat.getText());
        hargaa=Integer.parseInt(input_harga.getText());
        all = beratt*hargaa;
        input_bayar.setText(String.valueOf(all));
    }//GEN-LAST:event_input_bayarMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Loginpage().show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void input_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_idKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hanya Masukkan Angka", "Error", JOptionPane.ERROR_MESSAGE);
            input_id.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_input_idKeyTyped

    private void input_hpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_hpKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hanya Masukkan Angka", "Error", JOptionPane.ERROR_MESSAGE);
            input_hp.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_input_hpKeyTyped

    private void input_beratKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_beratKeyTyped
        // TODO add your handling code here:
        
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hanya Masukkan Angka", "Error", JOptionPane.ERROR_MESSAGE);
            input_berat.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_input_beratKeyTyped

    private void input_hargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_hargaKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hanya Masukkan Angka", "Error", JOptionPane.ERROR_MESSAGE);
            input_harga.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_input_hargaKeyTyped

    private void input_bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_bayarKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Hanya Masukkan Angka", "Error", JOptionPane.ERROR_MESSAGE);
            input_bayar.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_input_bayarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelData;
    private javax.swing.JButton delete;
    private javax.swing.JTextField input_alamat;
    private javax.swing.JTextField input_bayar;
    private javax.swing.JTextField input_berat;
    private javax.swing.JTextField input_harga;
    private javax.swing.JTextField input_hp;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_tanggal;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
