/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import static java.lang.System.err;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oryza
 */
public class Penjualan extends javax.swing.JInternalFrame {

    /**
     * Creates new form Penjualan
     */
    private DefaultTableModel model;
     Object[ ] obj;
    public Penjualan() {
        initComponents();
        combobox();
        AmbilData();
    }
    
    public void combobox(){
    try{
    //membuat statemen pemanggilan data pada table tblGaji dari database
    Statement stat = (Statement) Koneksi.getKoneksi().createStatement( );
    
    String sql = "Select * from barang";
    ResultSet res = stat.executeQuery(sql);
    //penelusuran baris pada tabel tblGaji dari database
    while(res.next ()){
        String data = res.getString("barcode");
         cbarcode.addItem(data);
    }
    }catch(SQLException err){
    JOptionPane.showMessageDialog(null, err.getMessage() );
    }
    }
    
    public void AmbilData(){
    
        model=new DefaultTableModel();
        Ttransaksi.setModel(model);
        model.addColumn("NO");
        model.addColumn("tanggal");
        model.addColumn("barcode");
        model.addColumn("jumlah");
        
    model.getDataVector( ).removeAllElements( );
    model.fireTableDataChanged( );
    int i=1;
    try{
    //membuat statemen pemanggilan data pada table tblGaji dari database
    Statement stat = (Statement) Koneksi.getKoneksi().createStatement( );
    
    String sql = "Select * from transaksi";
    ResultSet res = stat.executeQuery(sql);
    //penelusuran baris pada tabel tblGaji dari database
    while(res.next ()){
    obj= new Object[4];
    
    obj[0] =i;
    obj[1] = res.getString("tanggal");
    obj[2] = res.getString("barcode");
    obj[3] = res.getString("jumlah");
   
    
    model.addRow(obj);
    i++;
}
}catch(SQLException err){
JOptionPane.showMessageDialog(null, err.getMessage() );
}
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbarcode = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        NBarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Juang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Songsong = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttransaksi = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("from transaksi");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("barcode");

        cbarcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang" }));
        cbarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbarcodeActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("nama barang");

        NBarang.setEditable(false);
        NBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NBarangActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jumlah");

        jButton1.setText("Check Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbarcode, 0, 101, Short.MAX_VALUE)
                                        .addComponent(Jumlah))
                                    .addComponent(NBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("from pembayaran");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("total");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jumlah uang");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("kembalian");

        jButton2.setText("bayar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                            .addComponent(Juang)
                                            .addComponent(Songsong)))
                                    .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jLabel8))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Juang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Songsong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(Reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 250));

        Ttransaksi.setForeground(new java.awt.Color(255, 255, 255));
        Ttransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Ttransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 460, 140));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\sus\\foto\\trik meningkatkan penjualan toko online.png")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NBarangActionPerformed

    private void cbarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbarcodeActionPerformed
     String combo;
        combo = (String) cbarcode.getSelectedItem();
        try{
    //membuat statemen pemanggilan data pada table tblGaji dari database
    Statement stat = (Statement) Koneksi.getKoneksi().createStatement( );
    
    String sql = "Select * from barang where barcode="+combo+"";
    ResultSet res = stat.executeQuery(sql);
    //penelusuran baris pada tabel tblGaji dari database
    while(res.next ()){
        String data = res.getString("nama_barang");
         NBarang.setText(data);
    }
    }catch(SQLException err){
    JOptionPane.showMessageDialog(null, err.getMessage() );
    }
    }//GEN-LAST:event_cbarcodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String barcode,nbarang,jml;
        barcode =(String) cbarcode.getSelectedItem();
        nbarang = (String) NBarang.getText();
        jml = (String) Jumlah.getText();
        try{
    //membuat statemen pemanggilan data pada table tblGaji dari database
    Statement stat = (Statement) Koneksi.getKoneksi().createStatement( );
    
    String sql = "Select * from barang where barcode="+barcode+"";
    ResultSet res = stat.executeQuery(sql);
    //penelusuran baris pada tabel tblGaji dari database
    while(res.next ()){
        String data = res.getString("harga");
        int total , harga1, jml1;
        harga1 = Integer.parseInt(data);
        jml1 = Integer.parseInt(jml);
        
           total=harga1 * jml1;
         Total.setText(Integer.toString(total));
    }
    }catch(SQLException err){
    JOptionPane.showMessageDialog(null, err.getMessage() );
    }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String total1,jmluang;
        int kembalian;
         String barcode,nbarang,jml;
        barcode =(String) cbarcode.getSelectedItem();
        nbarang = (String) NBarang.getText();
        jml = (String) Jumlah.getText();
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            String sql = "INSERT INTO transaksi VALUES (null,'2020-06-27' , '"+barcode+"', '"+jml+"')";
            stat.executeUpdate(sql);
            System.out.println(sql);
            AmbilData();
            JOptionPane.showMessageDialog(this,"Penambahan Data Berhasil ");
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
            }
        
        total1= Total.getText();
        jmluang = Juang.getText();
        kembalian =  Integer.parseInt(jmluang) - Integer.parseInt(total1);
        Songsong.setText(Integer.toString(kembalian));
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
     cbarcode.setSelectedItem(null);
     NBarang.setText("");
     Jumlah.setText("");
     Total.setText("");
     Juang.setText("");
     Songsong.setText("");
    }//GEN-LAST:event_ResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Juang;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField NBarang;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Songsong;
    private javax.swing.JTextField Total;
    private javax.swing.JTable Ttransaksi;
    private javax.swing.JComboBox<String> cbarcode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
