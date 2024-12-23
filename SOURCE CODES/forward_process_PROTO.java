/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sys_prototype_revised;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author Rodulfo R. Lopez
 */
public class forward_process_PROTO extends javax.swing.JFrame {

    private String username;
    private Connection Dbcon;
    
    public forward_process_PROTO(String username, Connection Dbcon) {
        
        this.username = username;
        this.Dbcon = Dbcon;
        initComponents();

    }
    
    public class DatabaseConnection {
    private String DBUrl = "jdbc:mysql://localhost:3306/census_system_db";
    private String DBUser = "root";
    private String DBPass = "";

    public Connection connect() throws Exception {
        return DriverManager.getConnection(DBUrl, DBUser, DBPass);
    }
}
    private forward_process_PROTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
        jLabel1 = new javax.swing.JLabel();
        input_w_name_f = new javax.swing.JTextField();
        forward_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(220, 227, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 170));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("ENTER YOUR USERNAME HERE TO LET THE ADMIN KNOW WHO YOU ARE");
        jLabel1.setPreferredSize(new java.awt.Dimension(380, 15));

        input_w_name_f.setBackground(new java.awt.Color(247, 247, 247));
        input_w_name_f.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        input_w_name_f.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        input_w_name_f.setPreferredSize(new java.awt.Dimension(80, 20));
        input_w_name_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_w_name_fActionPerformed(evt);
            }
        });

        forward_btn.setBackground(new java.awt.Color(247, 247, 247));
        forward_btn.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        forward_btn.setForeground(new java.awt.Color(40, 40, 40));
        forward_btn.setText("FORWARD DATA TO ADMIN");
        forward_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        forward_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward_btnActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(76, 119, 102));
        back_btn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(235, 230, 224));
        back_btn.setText("<");
        back_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(220, 227, 238));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("NAME CHECK !");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(247, 247, 247), null, null));
        jLabel2.setPreferredSize(new java.awt.Dimension(170, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(input_w_name_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(forward_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_w_name_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forward_btn)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_w_name_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_w_name_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_w_name_fActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
            close();
            WORKER_DB_FOR_EDIT w_db = new WORKER_DB_FOR_EDIT(username, Dbcon);
            w_db.setVisible(true);
            w_db.pack();
            w_db.setLocationRelativeTo(null);
            this.dispose();
        
    }//GEN-LAST:event_back_btnActionPerformed

    private void forward_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward_btnActionPerformed
        forward_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAndTransferData();
                close();
                WORKER_DB_FOR_EDIT main_L = new WORKER_DB_FOR_EDIT(username, Dbcon);
                main_L.setVisible(true);
                main_L.pack();
                main_L.setLocationRelativeTo(null);
            }
            });
    }//GEN-LAST:event_forward_btnActionPerformed

    private void checkAndTransferData() {
    
    String inputname = input_w_name_f.getText().trim();

    try (Connection conn = new DatabaseConnection().connect()) {
        // Step 1: Check if code exists in login_details
        String checkLoginQuery = "SELECT * FROM login_details WHERE username = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(checkLoginQuery)) {
            stmt.setString(1, inputname);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) { // Code exists
                String sUrl = "jdbc:mysql://localhost:3306/user_" + inputname; // Use inputname directly
                // Step 2: Check for validated rows in res_info
                String checkValidationQuery = "SELECT * FROM user_" + inputname + ".res_info WHERE validation = 'VALIDATED'";
                
                try (PreparedStatement validationStmt = conn.prepareStatement(checkValidationQuery)) {
                    //validationStmt.setString(1, inputname); // Use inputname directly
                    try (ResultSet validationRs = validationStmt.executeQuery()) {
                        if (!validationRs.isBeforeFirst()) { // No rows found
                            JOptionPane.showMessageDialog(this, "No validated data found.");
                            return;
                        }

                        // Step 3: Transfer validated rows to respondent_info
                        while (validationRs.next()) {
                            String insertQuery = "INSERT INTO respondent_main_info (a_respondent_email, a_f_name, a_l_name, a_address, a_contact_no, a_household_serial," 
                                    + " a_date_listed, a_worker_incharge, a_suffix, a_m_name, a_r_sex, a_r_status, a_r_age," 
                                    + " a_r_birthdate, a_r_birthplace, a_r_religion, a_r_citizenship, a_r_profession, a_r_attainment, a_enumeration_serial,"
                                    + " a_building_serial, a_housing_unit_serial,"
                                    + " a_worker_validation, a_time_forwarded) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())"; // Adjust columns as necessary
                            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                                insertStmt.setString(1, validationRs.getString("respondent_email")); // Replace with actual column names
                                insertStmt.setString(2, validationRs.getString("f_name"));
                                insertStmt.setString(3, validationRs.getString("l_name"));
                                insertStmt.setString(4, validationRs.getString("address"));
                                insertStmt.setString(5, validationRs.getString("contact_no"));
                                insertStmt.setString(6, validationRs.getString("household_serial"));
                                insertStmt.setString(7, validationRs.getString("date_listed"));
                                insertStmt.setString(8, validationRs.getString("worker_incharge"));
                                insertStmt.setString(9, validationRs.getString("suffix"));
                                insertStmt.setString(10, validationRs.getString("m_name"));
                                insertStmt.setString(11, validationRs.getString("r_sex"));
                                insertStmt.setString(12, validationRs.getString("r_status"));
                                insertStmt.setString(13, validationRs.getString("r_age"));
                                insertStmt.setString(14, validationRs.getString("r_birthdate"));
                                insertStmt.setString(15, validationRs.getString("r_birthplace"));
                                insertStmt.setString(16, validationRs.getString("r_religion"));
                                insertStmt.setString(17, validationRs.getString("r_citizenship"));
                                insertStmt.setString(18, validationRs.getString("r_profession"));
                                insertStmt.setString(19, validationRs.getString("r_attainment"));
                                insertStmt.setString(20, validationRs.getString("enumeration_serial"));
                                insertStmt.setString(21, validationRs.getString("building_serial"));
                                insertStmt.setString(22, validationRs.getString("housing_unit_serial"));
                                insertStmt.setString(23, validationRs.getString("validation"));
                                insertStmt.executeUpdate();
                            }
                        }
                        input_w_name_f.setText("");
                        JOptionPane.showMessageDialog(this, "Data transferred successfully!");
                        
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Code does not exist.");
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}
    
    /*private void checkAndTransferData() {
        
        String inputname = input_w_name_f.getText().trim();

        try (Connection conn = new DatabaseConnection().connect()) {
            // Step 1: Check if code exists in login_details
            String checkLoginQuery = "SELECT * FROM login_details WHERE username = ?";
            
            try (PreparedStatement stmt = conn.prepareStatement(checkLoginQuery)) {
                stmt.setString(1, inputname);
                ResultSet rs = stmt.executeQuery();

                if (inputname.equals(username)) { // Code exists
                    
                    String sUrl = "jdbc:mysql://localhost:3306/user_" + username;
                    String sUser = "root";
                    String spass = "";
                    // Step 2: Check for validated rows in res_info
                    String uname = username; // Replace with actual username logic
                    String checkValidationQuery = "SELECT * FROM user_" + username + ".res_info WHERE validation = 'VALIDATED BY WORKER' AND worker_incharge = ?";
                    try (PreparedStatement validationStmt = conn.prepareStatement(checkValidationQuery)) {
                        validationStmt.setString(1, uname);
                        ResultSet validationRs = validationStmt.executeQuery();

                        // Step 3: Transfer validated rows to respondent_info
                        while (validationRs.next()) {
                            
                            String insertQuery = "INSERT INTO respondent_main_info (respondent_email, f_name, l_name, address, contact_no, household_serial," 
                                    + "date_listed, worker_incharge, suffix, m_name, r_sex, r_status, r_age," 
                                    + "r_birthdate, r_birthplace, r_religion, r_citizenship, r_profession, r_attainment, enumeration_serial,"
                                    + " building_serial, housing_unit_serial, "
                                    + "worker_validation, time_forwarded) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())"; // Adjust columns as necessary
                            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                                insertStmt.setString(1, validationRs.getString("respondent_email")); // Replace with actual column names
                                insertStmt.setString(2, validationRs.getString("f_name"));
                                insertStmt.setString(3, validationRs.getString("l_name"));
                                insertStmt.setString(4, validationRs.getString("address"));
                                insertStmt.setString(5, validationRs.getString("contact_no"));
                                insertStmt.setString(6, validationRs.getString("household_serial"));
                                insertStmt.setString(7, validationRs.getString("date_listed"));
                                insertStmt.setString(8, validationRs.getString("worker_incharge"));
                                insertStmt.setString(9, validationRs.getString("suffix"));
                                insertStmt.setString(10, validationRs.getString("m_name"));
                                insertStmt.setString(11, validationRs.getString("r_sex"));
                                insertStmt.setString(12, validationRs.getString("r_status"));
                                insertStmt.setString(13, validationRs.getString("r_age"));
                                insertStmt.setString(14, validationRs.getString("r_birthdate"));
                                insertStmt.setString(15, validationRs.getString("r_birthplace"));
                                insertStmt.setString(16, validationRs.getString("r_religion"));
                                insertStmt.setString(17, validationRs.getString("r_citizenship"));
                                insertStmt.setString(18, validationRs.getString("r_profession"));
                                insertStmt.setString(19, validationRs.getString("r_attainment"));
                                insertStmt.setString(20, validationRs.getString("enumeration_serial"));
                                insertStmt.setString(21, validationRs.getString("building_serial"));
                                insertStmt.setString(22, validationRs.getString("housing_unit_serial"));
                                insertStmt.setString(23, validationRs.getString("validation"));
                                insertStmt.executeUpdate();
                            }
                        }
                        JOptionPane.showMessageDialog(this, "Data transferred successfully!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Code does not exist.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }*/

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
            java.util.logging.Logger.getLogger(forward_process_PROTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forward_process_PROTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forward_process_PROTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forward_process_PROTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forward_process_PROTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton forward_btn;
    private javax.swing.JTextField input_w_name_f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
