/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubes_pbo;

import javax.swing.JOptionPane;



/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Pemberitahuan = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnMasuk = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnBuatAkun = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        Pemberitahuan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Pemberitahuan.setTitle("Pemberitahuan");

        javax.swing.GroupLayout PemberitahuanLayout = new javax.swing.GroupLayout(Pemberitahuan.getContentPane());
        Pemberitahuan.getContentPane().setLayout(PemberitahuanLayout);
        PemberitahuanLayout.setHorizontalGroup(
            PemberitahuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PemberitahuanLayout.setVerticalGroup(
            PemberitahuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Admin" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Zilla Slab Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN TAK");

        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnBuatAkun.setText("Buat Akun");
        btnBuatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatAkunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBatal)
                        .addGap(96, 96, 96)
                        .addComponent(btnMasuk))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(57, 57, 57)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnBuatAkun)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBuatAkun)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasuk)
                    .addComponent(btnBatal))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
      String username = txtUsername.getText();
      String password = txtPassword.getText();
      String role = (String)cmbRole.getSelectedItem();
      
      if (role.equals("Admin") && username.equals(username) && password.equals(password)) {
                    Pemberitahuan.dispose(); 
                    TAK_Admin TAK_AdminFrame = new TAK_Admin();
                    TAK_AdminFrame .setVisible(true);
                    TAK_AdminFrame .pack();
                    TAK_AdminFrame .setLocationRelativeTo(null);
                    this.dispose();
                } else if (role.equals("Mahasiswa") && username.equals(username) && password.equals(password)) {
                    Pemberitahuan.dispose();
                    TAK_Mahasiswa TAK_Mahasiswa = new TAK_Mahasiswa();
                    TAK_Mahasiswa .setVisible(true);
                    TAK_Mahasiswa .pack();
                    TAK_Mahasiswa .setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(Pemberitahuan, "Username atau Password Salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnBuatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatAkunActionPerformed
       Registrasi RegistrasiFrame = new Registrasi();
       RegistrasiFrame.setVisible(true);
       RegistrasiFrame.pack();
       RegistrasiFrame.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnBuatAkunActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Pemberitahuan;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBuatAkun;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}