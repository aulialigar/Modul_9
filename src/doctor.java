/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class doctor extends javax.swing.JFrame {

    /**
     * Creates new form doctor
     */
    public doctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pilih = new javax.swing.JComboBox<>();
        ds = new javax.swing.JTextField();
        wp = new javax.swing.JTextField();
        kn = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        gd = new javax.swing.JTextField();
        jk = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Dokter Spesialis");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 430, 130, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Waktu Praktek");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 390, 130, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Kewarganegaraan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 350, 130, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 310, 130, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Golongan Darah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 270, 130, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 230, 130, 30);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Usia");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 190, 130, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 150, 130, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Nama");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 110, 130, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Pilih Dokter");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(80, 50, 130, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Pemilihan Dokter");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 10, 150, 30);

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Salah Satu ", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        getContentPane().add(pilih);
        pilih.setBounds(240, 50, 130, 30);

        ds.setEditable(false);
        getContentPane().add(ds);
        ds.setBounds(240, 430, 130, 30);

        wp.setEditable(false);
        getContentPane().add(wp);
        wp.setBounds(240, 390, 130, 30);

        kn.setEditable(false);
        getContentPane().add(kn);
        kn.setBounds(240, 350, 130, 30);

        status.setEditable(false);
        getContentPane().add(status);
        status.setBounds(240, 310, 130, 30);

        gd.setEditable(false);
        getContentPane().add(gd);
        gd.setBounds(240, 270, 130, 30);

        jk.setEditable(false);
        getContentPane().add(jk);
        jk.setBounds(240, 230, 130, 30);

        usia.setEditable(false);
        getContentPane().add(usia);
        usia.setBounds(240, 190, 130, 30);

        alamat.setEditable(false);
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(240, 150, 130, 30);

        nama.setEditable(false);
        getContentPane().add(nama);
        nama.setBounds(240, 110, 130, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 90, 340, 390);

        setSize(new java.awt.Dimension(462, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        // TODO add your handling code here:
        if(pilih.getSelectedItem().equals("DR. Farras Yassar")){
            nama.setText("DR. Farras Yassar ");
            alamat.setText("Jl. Surabaya 16, Malang");
            usia.setText("20 Tahun");
            jk.setText("Laki-Laki");
            gd.setText("A");
            status.setText("Belum Menikah ");
            kn.setText("Indonesia");
            ds.setText("Dokter Umum");
            wp.setText(" Pagi (07.00-15.00)");
        }
        else
        if(pilih.getSelectedItem().equals("DR. Anisa Putri")){
            nama.setText("DR. Anisa Putri");
            alamat.setText("Jl. Veteran 3, Malang");
            usia.setText("20 Tahun");
            jk.setText("Perempuan");
            gd.setText("O");
            status.setText("Belum Menikah");
            kn.setText("Indonesia");
            ds.setText("Dokter Gigi");
            wp.setText(" Sore (16.00-22.00)");
        }
        else
        if(pilih.getSelectedItem().equals("DR. Harun Fajar")){
            nama.setText("DR. Harun Fajar ");
            alamat.setText("Jl. Bandung 9, Malang");
            usia.setText("20 Tahun");
            jk.setText("Laki-Laki");
            gd.setText("B");
            status.setText("Belum Menikah");
            kn.setText("Indonesia");
            ds.setText("Dokter Gizi");
            wp.setText(" Malam (22.00-06.00)");
        }
    }//GEN-LAST:event_pilihActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField ds;
    private javax.swing.JTextField gd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jk;
    private javax.swing.JTextField kn;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField wp;
    // End of variables declaration//GEN-END:variables
}
