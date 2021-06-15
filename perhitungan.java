package tugas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class perhitungan extends javax.swing.JFrame {

    public ArrayList menu = new ArrayList();
    public ArrayList harga = new ArrayList();
    public ArrayList jumlah = new ArrayList();
    public ArrayList subtotal = new ArrayList();
    
    
    public perhitungan() {
        initComponents();
    }
    
    private void setHargaMakanan(){
        int harga=0;
        int pilihan = cbMakanan.getSelectedIndex();
        switch (pilihan){
            case 1:
                harga = 20000;
                break;
            case 2:
                harga = 15000;
                break;
            case 3:
                harga = 16000;
                break;
            case 4: 
                harga = 21000;
                break;
            case 5:
                harga = 10000;
                break;
        }
        txtHargaMakanan.setText("" + harga);
    }
    
    private void setHargaMinuman(){
       int harga=0;
        int pilihan = cbMinuman.getSelectedIndex();
        switch (pilihan){
            case 1:
                harga = 5000;;
            case 2:
                harga = 10000;
                break;
            case 3:
                harga = 16000;
                break;
            case 4: 
                harga = 5000;
                break;
            case 5:
                harga = 10000;
                break;
        }
        txtHargaMinuman.setText("" + harga);
    }
    
    private void setTable(){
        int total=0;
        double pajak=0;
        int bayar=0;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Menu");
        tbl.addColumn("Harga");
        tbl.addColumn("Jumlah");
        tbl.addColumn("Sub Total");
        
        for(int n=0; n<menu.size(); n++){
            total = total + Integer.parseInt(subtotal.get(n).toString());
            
            tbl.addRow(new Object[]{
                menu.get(n),
                harga.get(n),
                jumlah.get(n),
                subtotal.get(n),
            });
        }
        pajak = total * 0.03;
        bayar = (int) (total + pajak);
        
       dataTable.setModel(tbl);
       txtTotal.setText("" + total);
       txtPajak.setText("" + pajak);
       txtTotalBayar.setText("" + bayar);
       
       txtJumlahBayar.requestFocus();
        
    }
    
    private boolean cekKosong(boolean makanan){
        boolean hasil = true;
        
        if (makanan == true){
            if(txtJumlahMakanan.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Jumlah makanan harus diisi!");
                hasil=true;
            }
        }else{
            if (txtJumlahMinuman.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Jumlah minuman harus diisi");
            }
        }
        return false;
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMakanan = new javax.swing.JComboBox<>();
        txtHargaMakanan = new javax.swing.JTextField();
        txtJumlahMakanan = new javax.swing.JTextField();
        txtSubTotalMakanan = new javax.swing.JTextField();
        btnMakanan = new javax.swing.JButton();
        btnTambahMakanan = new javax.swing.JButton();
        btnTambahMinuman = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbMinuman = new javax.swing.JComboBox<>();
        txtHargaMinuman = new javax.swing.JTextField();
        txtJumlahMinuman = new javax.swing.JTextField();
        txtSubTotalMinuman = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnMinuman = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPajak = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtJumlahBayar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblInfo1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELI'S");
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Menu Makanan :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 100, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Harga :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 79, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Jumlah :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 160, 50, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sub Total :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 79, 20);

        cbMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -", "AYAM GEPREK", "AYAM BAKAR", "SEBLAK CEKER", "BAKSO", "SIOMAY" }));
        cbMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMakananActionPerformed(evt);
            }
        });
        getContentPane().add(cbMakanan);
        cbMakanan.setBounds(110, 80, 133, 30);

        txtHargaMakanan.setEditable(false);
        txtHargaMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaMakananActionPerformed(evt);
            }
        });
        getContentPane().add(txtHargaMakanan);
        txtHargaMakanan.setBounds(110, 120, 133, 30);

        txtJumlahMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahMakananActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlahMakanan);
        txtJumlahMakanan.setBounds(110, 160, 88, 30);

        txtSubTotalMakanan.setEditable(false);
        getContentPane().add(txtSubTotalMakanan);
        txtSubTotalMakanan.setBounds(110, 200, 133, 30);

        btnMakanan.setText("*");
        btnMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakananActionPerformed(evt);
            }
        });
        getContentPane().add(btnMakanan);
        btnMakanan.setBounds(200, 160, 39, 30);

        btnTambahMakanan.setText("Tambahkan");
        btnTambahMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMakananActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambahMakanan);
        btnTambahMakanan.setBounds(140, 240, 100, 30);

        btnTambahMinuman.setText("Tambahkan");
        btnTambahMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambahMinuman);
        btnTambahMinuman.setBounds(140, 440, 100, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Harga :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 320, 90, 30);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Jumlah :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 360, 60, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Sub Total :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 400, 79, 30);

        cbMinuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -", "ES TEH", "ES CAPPUCINO", "ES KEPAL MILO", "ES DEGAN", "JUICE JERUK" }));
        cbMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(cbMinuman);
        cbMinuman.setBounds(110, 280, 133, 30);

        txtHargaMinuman.setEditable(false);
        txtHargaMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(txtHargaMinuman);
        txtHargaMinuman.setBounds(110, 320, 133, 30);

        txtJumlahMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlahMinuman);
        txtJumlahMinuman.setBounds(110, 360, 88, 30);

        txtSubTotalMinuman.setEditable(false);
        getContentPane().add(txtSubTotalMinuman);
        txtSubTotalMinuman.setBounds(110, 400, 133, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Menu Minuman :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 280, 100, 30);

        btnMinuman.setText("*");
        btnMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinuman);
        btnMinuman.setBounds(200, 360, 40, 30);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 80, 530, 120);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Total :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 220, 73, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Pajak (3%) :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 260, 73, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total Bayar :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(270, 300, 73, 30);

        txtPajak.setEditable(false);
        getContentPane().add(txtPajak);
        txtPajak.setBounds(350, 260, 139, 30);

        txtTotalBayar.setEditable(false);
        getContentPane().add(txtTotalBayar);
        txtTotalBayar.setBounds(350, 300, 139, 30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Jumlah Bayar : ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(580, 220, 100, 30);
        getContentPane().add(txtJumlahBayar);
        txtJumlahBayar.setBounds(670, 220, 130, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Kembalian :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(580, 300, 80, 30);

        txtKembalian.setEditable(false);
        getContentPane().add(txtKembalian);
        txtKembalian.setBounds(670, 300, 130, 30);

        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar);
        btnBayar.setBounds(740, 260, 60, 30);

        btnClear.setText("RESET");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(720, 360, 80, 30);

        lblInfo1.setBackground(new java.awt.Color(153, 153, 0));
        lblInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblInfo1);
        lblInfo1.setBounds(120, 540, 600, 30);
        getContentPane().add(txtTotal);
        txtTotal.setBounds(350, 220, 140, 30);

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DAPOER NUSANTARA");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(250, 20, 290, 40);

        btnKeluar.setBackground(new java.awt.Color(255, 51, 51));
        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(720, 410, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer - D\\Downloads\\images (1).jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 480);

        setSize(new java.awt.Dimension(848, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMakananActionPerformed
        // TODO add your handling code here:
        setHargaMakanan();
    }//GEN-LAST:event_cbMakananActionPerformed

    private void cbMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinumanActionPerformed
        // TODO add your handling code here:
        setHargaMinuman();
    }//GEN-LAST:event_cbMinumanActionPerformed

    private void btnMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinumanActionPerformed
        // TODO add your handling code here:
        try{
            int hargaMinuman = Integer.parseInt(txtHargaMinuman.getText());
            int jumlahMinuman = Integer.parseInt(txtJumlahMinuman.getText());
            txtSubTotalMinuman.setText("" + (hargaMinuman*jumlahMinuman));
        }catch(ArithmeticException e){
            txtSubTotalMinuman.setText("0");
        }
    }//GEN-LAST:event_btnMinumanActionPerformed

    private void btnTambahMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMakananActionPerformed
        // TODO add your handling code here:
        if (cekKosong(true) == false){
            String menuItem = cbMakanan.getSelectedItem().toString();
          {
                int hrg = Integer.parseInt(txtHargaMakanan.getText());
                int kuantiti = Integer.parseInt(txtJumlahMakanan.getText());
                txtSubTotalMakanan.setText("" + (hrg*kuantiti));
                
                menu.add(menuItem);
                harga.add(txtHargaMakanan.getText());
                jumlah.add(txtJumlahMakanan.getText());
                subtotal.add(txtSubTotalMakanan.getText());
                  dataTable.requestFocus();    
              setTable();
            }
        }
        cbMakanan.setSelectedIndex(0);
        txtHargaMakanan.setText("");
        txtJumlahMakanan.setText("");
        txtSubTotalMakanan.setText("");
       
    }//GEN-LAST:event_btnTambahMakananActionPerformed

    private void btnTambahMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMinumanActionPerformed
        // TODO add your handling code here:
        if (cekKosong(false) == false){
            String menuItem = cbMinuman.getSelectedItem().toString();
            {
                int hrg = Integer.parseInt(txtHargaMinuman.getText());
                int kuantiti = Integer.parseInt(txtJumlahMinuman.getText());
                txtSubTotalMinuman.setText("" + (hrg*kuantiti));
                
                menu.add(menuItem);
                harga.add(txtHargaMinuman.getText());
                jumlah.add(txtJumlahMinuman.getText());
                subtotal.add(txtSubTotalMinuman.getText());
                
              setTable();
            }
        }
        cbMinuman.setSelectedIndex(0);
        txtHargaMinuman.setText("");
        txtJumlahMinuman.setText("");
        txtSubTotalMinuman.setText("");
    }//GEN-LAST:event_btnTambahMinumanActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        int totalBayar = Integer.parseInt(txtTotalBayar.getText());
        int jumlahBayar = Integer.parseInt(txtJumlahBayar.getText());
        txtKembalian.setText("" + (jumlahBayar-totalBayar));
       
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtTotal.setText("");
        txtPajak.setText("");
        txtTotalBayar.setText("");
        txtJumlahBayar.setText("");
        txtKembalian.setText("");
        lblInfo1.setText("");
        
        menu.clear();
        harga.clear();
        jumlah.clear();
        subtotal.clear();
        
        setTable();
       
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakananActionPerformed
        // TODO add your handling code here:
         try{
            int hargaMakanan = Integer.parseInt(txtHargaMakanan.getText());
            int jumlahMakanan = Integer.parseInt(txtJumlahMakanan.getText());
            txtSubTotalMakanan.setText("" + (hargaMakanan*jumlahMakanan));
        }catch(ArithmeticException e){
            txtSubTotalMakanan.setText("0");
        }
        
    }//GEN-LAST:event_btnMakananActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        if
                (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Peringatan", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) ==JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtHargaMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaMakananActionPerformed
        // TODO add your handling code here:
        txtJumlahMakanan.requestFocus();
    }//GEN-LAST:event_txtHargaMakananActionPerformed

    private void txtJumlahMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahMakananActionPerformed
         // TODO add your handling code here:
        btnMakanan.requestFocus();
    }//GEN-LAST:event_txtJumlahMakananActionPerformed

    private void txtHargaMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaMinumanActionPerformed
        // TODO add your handling code here:
        txtJumlahMinuman.requestFocus();
    }//GEN-LAST:event_txtHargaMinumanActionPerformed

    private void txtJumlahMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahMinumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahMinumanActionPerformed

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
            java.util.logging.Logger.getLogger(perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perhitungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMakanan;
    private javax.swing.JButton btnMinuman;
    private javax.swing.JButton btnTambahMakanan;
    private javax.swing.JButton btnTambahMinuman;
    private javax.swing.JComboBox<String> cbMakanan;
    private javax.swing.JComboBox<String> cbMinuman;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JTextField txtHargaMakanan;
    private javax.swing.JTextField txtHargaMinuman;
    private javax.swing.JTextField txtJumlahBayar;
    private javax.swing.JTextField txtJumlahMakanan;
    private javax.swing.JTextField txtJumlahMinuman;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtPajak;
    private javax.swing.JTextField txtSubTotalMakanan;
    private javax.swing.JTextField txtSubTotalMinuman;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables

    private void setTabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
