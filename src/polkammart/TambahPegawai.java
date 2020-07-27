/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oryza
 */
public class TambahPegawai extends javax.swing.JInternalFrame {

    /**
     * Creates new form TambahPegawai
     */
    
    public TambahPegawai() {
        initComponents();
        this.setTitle("Tambah Data Pegawai");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sandi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox();
        tambah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 640, 40));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 282, -1));

        jLabel2.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sandi : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPanel2.add(sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 282, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Pegawai" }));
        jPanel2.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 280, -1));

        tambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel2.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\sus\\foto\\Labor_Day_header.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 640, 330));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        Enkripsi s=new Enkripsi();
        String z=nama.getText();
        String y=s.encryptPasswordMD5(sandi.getText());
        String l=Integer.toString(level.getSelectedIndex()+1);
        System.out.println("Nama : "+z+" Sandi : "+y+" "+l);
        Pegawai peg=new Pegawai();
        try {
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            String query="Select * from pengguna, level where pengguna.level=level.no";
            ResultSet res = stat.executeQuery(query);
            String id_pengguna="";
            while(res.next()){
                id_pengguna=Integer.toString(Integer.parseInt(res.getString("id"))+1);
            }
            String sql = "INSERT INTO pengguna VALUES ('"+id_pengguna+"' , '"+z+"', '"+y+"', '"+l+"')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Penambahan Data Berhasil ");

            peg.AmbilData();
            this.getParent().add(peg);
            peg.setVisible(true);
            peg.setSize(this.getWidth(),this.getHeight());
            peg.setLocation(0,0);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(TambahPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pegawai peg=new Pegawai();
        peg.AmbilData();
        this.getParent().add(peg);
        peg.setVisible(true);
        peg.setSize(this.getWidth(),this.getHeight());
        peg.setLocation(0,0);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox level;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField sandi;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
