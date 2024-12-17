/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sys_prototype_revised;


import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingUtilities;


public class proto_admin_UI extends javax.swing.JFrame {

    private Connection con;
    private String sUrl = "jdbc:mysql://localhost:3306/census_system_db";
    private String sUser = "root";
    private String spass = "";
        
        
    private static PreparedStatement pst;
    private static ResultSet result;
    
    public proto_admin_UI() {
        initComponents();
        SwingUtilities.invokeLater(this::connectLoadData);
    }
    
    public void UpdateDB(){
        
        String sUrl = "jdbc:mysql://localhost:3306/census_system_db";
        String sUser = "root";
        String spass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sUrl, sUser, spass);
            pst = con.prepareStatement("SELECT * FROM respondent_main_info ORDER BY a_time_forwarded, a_l_name ASC");
            
            result = pst.executeQuery();
            ResultSetMetaData resultData = result.getMetaData();
            
            int q = resultData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)admin_table.getModel();
            RecordTable.setRowCount(0);
            
            while(result.next()){
                Vector columnData = new Vector();
                
                for(int r = 1; r <= q; r++){
                    columnData.add(result.getString("a_respondent_email"));
                    columnData.add(result.getString("a_f_name"));
                    columnData.add(result.getString("a_l_name"));
                    columnData.add(result.getString("a_r_sex"));
                    columnData.add(result.getString("a_contact_no"));
                    columnData.add(result.getString("a_household_serial"));
                    columnData.add(result.getString("a_worker_validation"));
                    columnData.add(result.getString("a_worker_incharge"));
                    columnData.add(result.getString("a_time_forwarded"));
                    
                }
                RecordTable.addRow(columnData);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void showTableDb()throws SQLException{
        if(con == null || con.isClosed()){
            System.out.println("CHECK DATABASE CONNECTION");
            return;
        }
        String query = "SELECT * FROM respondent_main_info ORDER BY a_time_forwarded DESC, a_l_name ASC";
        try(PreparedStatement stmt = con.prepareStatement(query)){
            
            result = stmt.executeQuery();
            
            DefaultTableModel RecordTable = (DefaultTableModel)admin_table.getModel();
            RecordTable.setRowCount(0);
              
            while(result.next()){
                
                String r_email = result.getString("a_respondent_email");
                String first_name = result.getString("a_f_name");
                String last_name = result.getString("a_l_name");
                String sex = result.getString("a_r_sex");
                String contact = result.getString("a_contact_no");
                String household_s = result.getString("a_household_serial");
                String validation = result.getString("a_worker_validation");
                String worker = result.getString("a_worker_incharge");
                String forward_date = result.getString("a_time_forwarded");
                
                RecordTable.addRow(new Object[]{r_email, first_name,last_name, sex, contact, household_s, validation, worker, forward_date});
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Error loading data" + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE );
        }     
    }

    public void connectLoadData(){
        try{
            connectToDB();
            showTableDb();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE );
        }
    }
    
    public void connectToDB() throws SQLException{
        String SUrl = "jdbc:mysql://localhost:3306/census_system_db";
        String SUser = "root";
        String Spass = "";
        con = DriverManager.getConnection(SUrl, SUser, Spass);
    }
    
    private void showError(String message) {
         JOptionPane.showMessageDialog(new proto_admin_UI.JFrame(), message,"Error", JOptionPane.ERROR_MESSAGE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ADMIN_MAIN_PANEL = new javax.swing.JPanel();
        admin_Label = new javax.swing.JLabel();
        export = new javax.swing.JButton();
        return_main = new javax.swing.JButton();
        show_workers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_feild_a = new javax.swing.JTextField();
        admin_search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_table = new javax.swing.JTable();
        show_details = new javax.swing.JButton();
        entry_delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(850, 500));

        ADMIN_MAIN_PANEL.setBackground(new java.awt.Color(220, 227, 238));
        ADMIN_MAIN_PANEL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ADMIN_MAIN_PANEL.setPreferredSize(new java.awt.Dimension(1020, 500));

        admin_Label.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        admin_Label.setForeground(new java.awt.Color(40, 40, 40));
        admin_Label.setText("WELCOME ADMIN");
        admin_Label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_Label.setPreferredSize(new java.awt.Dimension(168, 25));
        admin_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_LabelMouseClicked(evt);
            }
        });

        export.setBackground(new java.awt.Color(76, 119, 102));
        export.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        export.setForeground(new java.awt.Color(235, 230, 224));
        export.setText("EXPORT TO PDF FILE");
        export.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        export.setPreferredSize(new java.awt.Dimension(126, 22));
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        return_main.setBackground(new java.awt.Color(76, 119, 102));
        return_main.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        return_main.setForeground(new java.awt.Color(235, 230, 224));
        return_main.setText("<");
        return_main.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        return_main.setPreferredSize(new java.awt.Dimension(30, 30));
        return_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_mainActionPerformed(evt);
            }
        });

        show_workers.setBackground(new java.awt.Color(76, 119, 102));
        show_workers.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        show_workers.setForeground(new java.awt.Color(235, 230, 224));
        show_workers.setText("YOUR TEAM");
        show_workers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_workers.setPreferredSize(new java.awt.Dimension(80, 25));
        show_workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_workersActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(247, 247, 247));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("DATA FROM WORKERS");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 20));

        search_feild_a.setBackground(new java.awt.Color(76, 119, 102));
        search_feild_a.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        search_feild_a.setForeground(new java.awt.Color(235, 230, 224));
        search_feild_a.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_feild_a.setPreferredSize(new java.awt.Dimension(200, 25));
        search_feild_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_feild_aActionPerformed(evt);
            }
        });
        search_feild_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_feild_aKeyReleased(evt);
            }
        });

        admin_search_button.setBackground(new java.awt.Color(76, 119, 102));
        admin_search_button.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        admin_search_button.setForeground(new java.awt.Color(235, 230, 224));
        admin_search_button.setText("SEARCH");
        admin_search_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_search_button.setPreferredSize(new java.awt.Dimension(80, 25));
        admin_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_search_buttonActionPerformed(evt);
            }
        });

        admin_table.setBackground(new java.awt.Color(247, 247, 247));
        admin_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Res. Email", "First Name", "Last Name", "Sex", "Contact Number", "Household Serial", "Validation", "Worker In Charge", "Time Forwarded"
            }
        ));
        jScrollPane1.setViewportView(admin_table);

        show_details.setBackground(new java.awt.Color(76, 119, 102));
        show_details.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        show_details.setForeground(new java.awt.Color(235, 230, 224));
        show_details.setText("SHOW MORE");
        show_details.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_details.setPreferredSize(new java.awt.Dimension(80, 25));
        show_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_detailsActionPerformed(evt);
            }
        });

        entry_delete.setBackground(new java.awt.Color(76, 119, 102));
        entry_delete.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        entry_delete.setForeground(new java.awt.Color(235, 230, 224));
        entry_delete.setText("DELETE");
        entry_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entry_delete.setPreferredSize(new java.awt.Dimension(80, 25));
        entry_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_deleteActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(247, 247, 247));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("RESPONDENT DETAILS");
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 20));

        javax.swing.GroupLayout ADMIN_MAIN_PANELLayout = new javax.swing.GroupLayout(ADMIN_MAIN_PANEL);
        ADMIN_MAIN_PANEL.setLayout(ADMIN_MAIN_PANELLayout);
        ADMIN_MAIN_PANELLayout.setHorizontalGroup(
            ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMIN_MAIN_PANELLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMIN_MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(admin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(762, 762, 762)
                        .addComponent(return_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ADMIN_MAIN_PANELLayout.createSequentialGroup()
                        .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ADMIN_MAIN_PANELLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search_feild_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(admin_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ADMIN_MAIN_PANELLayout.createSequentialGroup()
                                .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(entry_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(show_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(show_workers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))))
        );
        ADMIN_MAIN_PANELLayout.setVerticalGroup(
            ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMIN_MAIN_PANELLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMIN_MAIN_PANELLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ADMIN_MAIN_PANELLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_feild_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(ADMIN_MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show_workers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entry_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADMIN_MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ADMIN_MAIN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admin_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_LabelMouseClicked
        close();
        SHOW_WHO_ADMIN main_L = new SHOW_WHO_ADMIN();
        main_L.setVisible(true);
        main_L.pack();
        main_L.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_admin_LabelMouseClicked

    private void search_feild_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_feild_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_feild_aActionPerformed

    private void admin_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_search_buttonActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)admin_table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(RecordTable);
        admin_table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_feild_a.getText()));
    }//GEN-LAST:event_admin_search_buttonActionPerformed

    private void return_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_mainActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "LOGOUT", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            close();
            Main_login_PROTOTYPE main_L = new Main_login_PROTOTYPE();
            main_L.setVisible(true);
            main_L.pack();
            main_L.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_return_mainActionPerformed

    private void show_workersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_workersActionPerformed
        close();
        worker_list w_List = new worker_list();
        w_List.setVisible(true);
        w_List.pack();
        w_List.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_show_workersActionPerformed

    private void show_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_detailsActionPerformed
        int selectedRow = admin_table.getSelectedRow();
        String sUrl = "jdbc:mysql://localhost:3306/census_system_db";
        String sUser = "root";
        String spass = "";

        if (selectedRow != -1) {  
            String email = admin_table.getValueAt(selectedRow, 0).toString();

            String query = "SELECT * FROM respondent_main_info WHERE a_respondent_email = ? ORDER BY a_time_forwarded DESC";

            try (Connection conn = DriverManager.getConnection(sUrl, sUser, spass);
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setString(1, email);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {  
                        Map<String, String> data = new HashMap<>();
                        data.put("FirstName", rs.getString("a_f_name"));
                        data.put("LastName", rs.getString("a_l_name"));
                        data.put("Address", rs.getString("a_address"));
                        data.put("Email", rs.getString("a_respondent_email"));
                        data.put("Contact", rs.getString("a_contact_no"));
                        data.put("Household", rs.getString("a_household_serial"));
                        data.put("Worker", rs.getString("a_worker_incharge"));
                        data.put("Suffix", rs.getString("a_suffix"));
                        data.put("M_name", rs.getString("a_m_name"));
                        data.put("Age", rs.getString("a_r_age"));
                        data.put("B_date", rs.getString("a_r_birthdate"));
                        data.put("B_place", rs.getString("a_r_birthplace"));
                        data.put("Religion", rs.getString("a_r_religion"));
                        data.put("Citizenship", rs.getString("a_r_citizenship"));
                        data.put("Profession", rs.getString("a_r_profession"));
                        data.put("Enumer", rs.getString("a_enumeration_serial"));
                        data.put("Build", rs.getString("a_building_serial"));
                        data.put("Housing", rs.getString("a_housing_unit_serial"));
                        data.put("Sex", rs.getString("a_r_sex"));
                        data.put("Status", rs.getString("a_r_status"));
                        data.put("Attainment", rs.getString("a_r_attainment"));
                        data.put("Date_Added", rs.getString("a_date_listed"));
                        data.put("Entry", rs.getString("a_worker_validation"));
                        data.put("Forwarded", rs.getString("a_time_forwarded"));

                        close();
                        FROM_ADMIN_SHOW_DETAILS show_UI = new FROM_ADMIN_SHOW_DETAILS(data);
                        show_UI.setVisible(true);
                        show_UI.pack();
                        show_UI.setLocationRelativeTo(null);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "No data found for the selected email.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while retrieving data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }
    
    
    }//GEN-LAST:event_show_detailsActionPerformed

    private void search_feild_aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_feild_aKeyReleased
        DefaultTableModel RecordTable = (DefaultTableModel)admin_table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(RecordTable);
        admin_table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_feild_a.getText()));
    }//GEN-LAST:event_search_feild_aKeyReleased

    private void entry_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_deleteActionPerformed
        
        int[] selectedRows = admin_table.getSelectedRows(); // Get all selected rows

        if (selectedRows.length > 0) {  // Check if at least one row is selected
            String sUrl = "jdbc:mysql://localhost:3306/census_system_db";
            String sUser = "root";
            String spass = "";

            try (Connection conn = DriverManager.getConnection(sUrl, sUser, spass)) {
                java.util.List<java.util.Map<String, String>> dataList = new java.util.ArrayList<>();

                for (int selectedRow : selectedRows) {
                    String email = admin_table.getValueAt(selectedRow, 0).toString();

                    String query = "SELECT * FROM respondent_main_info WHERE a_respondent_email = ? ORDER BY a_time_forwarded DESC";

                    try (PreparedStatement stmt = conn.prepareStatement(query)) {
                        stmt.setString(1, email);

                        try (ResultSet rs = stmt.executeQuery()) {
                            if (rs.next()) {  
                                Map<String, String> data = new HashMap<>();
                                data.put("FirstName", rs.getString("a_f_name"));
                                data.put("LastName", rs.getString("a_l_name"));
                                data.put("Address", rs.getString("a_address"));
                                data.put("Email", rs.getString("a_respondent_email"));
                                data.put("Contact", rs.getString("a_contact_no"));
                                data.put("Household", rs.getString("a_household_serial"));
                                data.put("Worker", rs.getString("a_worker_incharge"));
                                data.put("Suffix", rs.getString("a_suffix"));
                                data.put("M_name", rs.getString("a_m_name"));
                                data.put("Age", rs.getString("a_r_age"));
                                data.put("B_date", rs.getString("a_r_birthdate"));
                                data.put("B_place", rs.getString("a_r_birthplace"));
                                data.put("Religion", rs.getString("a_r_religion"));
                                data.put("Citizenship", rs.getString("a_r_citizenship"));
                                data.put("Profession", rs.getString("a_r_profession"));
                                data.put("Enumer", rs.getString("a_enumeration_serial"));
                                data.put("Build", rs.getString("a_building_serial"));
                                data.put("Housing", rs.getString("a_housing_unit_serial"));
                                data.put("Sex", rs.getString("a_r_sex"));
                                data.put("Status", rs.getString("a_r_status"));
                                data.put("Attainment", rs.getString("a_r_attainment"));
                                data.put("Date_Added", rs.getString("a_date_listed"));
                                data.put("Entry", rs.getString("a_worker_validation"));
                                data.put("Forwarded", rs.getString("a_time_forwarded"));

                                // Add the map to the list
                                dataList.add(data);
                            } else {
                                JOptionPane.showMessageDialog(null, "No data found for the email: " + email);
                            }
                        }
                    }
                }

                // Pass dataList to the UI or process it as needed
                close();
                FROM_ADMIN_DELETE_PROCESS v_UI = new FROM_ADMIN_DELETE_PROCESS(dataList);
                v_UI.setVisible(true);
                v_UI.pack();
                v_UI.setLocationRelativeTo(null);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while retrieving data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No rows selected");
        }
    }//GEN-LAST:event_entry_deleteActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        
        
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();

            // Ensure path ends with a separator
            if (!path.endsWith("/") && !path.endsWith("\\")) {
                path += "/";
            }
        }

        Document docs = new Document();
        try {
            PdfWriter.getInstance(docs, new FileOutputStream(path + "census_records.pdf"));
            docs.open();

            // Get selected rows
            int[] selectedRows = admin_table.getSelectedRows();

            // Check if any rows are selected
            if (selectedRows.length == 0) {
                JOptionPane.showMessageDialog(null, "No rows selected! Please select at least one row.");
                return; // Exit method early
            }

            // Create a StringBuilder to store paragraph content
            StringBuilder paragraphContent = new StringBuilder();

            // Loop through each selected row
            for (int r : selectedRows) {
                int modelRowIndex = admin_table.convertRowIndexToModel(r);

                for (int col = 0; col < admin_table.getColumnCount(); col++) {
                    String header = admin_table.getColumnName(col);
                    String cellValue = admin_table.getModel().getValueAt(modelRowIndex, col).toString();

                    // Append header and value to paragraph content
                    paragraphContent.append(header).append(": ").append(cellValue).append("  \n");
                }

                // Add a line break between rows
                paragraphContent.append("\n");
            }

            // Add the paragraph to the document
            Paragraph paragraph = new Paragraph(paragraphContent.toString());
            docs.add(paragraph);

            JOptionPane.showMessageDialog(null, "PDF GENERATED");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace(); // For debugging
            JOptionPane.showMessageDialog(null, "SOMETHING WENT WRONG! PLEASE DOUBLE CHECK");
        } finally {
            docs.close();
        }

        /*
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();

            // Ensure path ends with a separator
            if (!path.endsWith("/") && !path.endsWith("\\")) {
                path += "/";
            }
        }

        Document docs = new Document();
        try {
            PdfWriter.getInstance(docs, new FileOutputStream(path + "census_records.pdf"));
            docs.open();

            PdfPTable ctb1 = new PdfPTable(admin_table.getColumnCount());

            // Get selected rows
            int[] selectedRows = admin_table.getSelectedRows();

            // Check if any rows are selected
            if (selectedRows.length == 0) {
                JOptionPane.showMessageDialog(null, "No rows selected! Please select at least one row.");
                return; // Exit method early
            }

            // Optional: Add headers to PDF table
            for (int col = 0; col < admin_table.getColumnCount(); col++) {
                String headerValue = admin_table.getColumnName(col);
                ctb1.addCell(headerValue);
            }

            // Loop through each selected row
            for (int r : selectedRows) {
                int modelRowIndex = admin_table.convertRowIndexToModel(r);

                for (int col = 0; col < admin_table.getColumnCount(); col++) {
                    String cellValue = admin_table.getModel().getValueAt(modelRowIndex, col).toString();
                    ctb1.addCell(cellValue);
                }
            }

            docs.add(ctb1);
            JOptionPane.showMessageDialog(null, "PDF GENERATED");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace(); // For debugging
            JOptionPane.showMessageDialog(null, "SOMETHING WENT WRONG! PLEASE DOUBLE CHECK");
        } finally {
            docs.close();
        }*/
    }//GEN-LAST:event_exportActionPerformed
    
    /*
    public void generatePdfFromDatabase() {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
            if (!path.endsWith("/") && !path.endsWith("\\")) {
                path += "/";
            }
        }

        Document docs = new Document();
        try {
            PdfWriter.getInstance(docs, new FileOutputStream(path + "census_records.pdf"));
            docs.open();

            // Connect to the database and retrieve data
            Connection conn = DriverManager.getConnection(sUrl, sUser, spass);
            Statement stmt = conn.createStatement();
            String query = "SELECT title, season, episode FROM movie";
            ResultSet rs = stmt.executeQuery(query);

            // Build the paragraph content
            StringBuilder contentBuilder = new StringBuilder();
            while (rs.next()) {
                String title = rs.getString("title");
                String season = rs.getString("season");
                String episode = rs.getString("episode");
                contentBuilder.append("Title: ").append(title)
                              .append(", Season: ").append(season)
                              .append(", Episode: ").append(episode).append("\n");
            }

            // Add content to PDF
            Paragraph paragraph = new Paragraph(contentBuilder.toString());
            docs.add(paragraph);
            JOptionPane.showMessageDialog(null, "PDF GENERATED");

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace(); // For debugging
            JOptionPane.showMessageDialog(null, "SOMETHING WENT WRONG! PLEASE DOUBLE CHECK");
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        } finally {
            docs.close(); // Handle exception on close
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
            java.util.logging.Logger.getLogger(proto_admin_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proto_admin_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proto_admin_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proto_admin_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proto_admin_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADMIN_MAIN_PANEL;
    private javax.swing.JLabel admin_Label;
    private javax.swing.JButton admin_search_button;
    public static javax.swing.JTable admin_table;
    private javax.swing.JButton entry_delete;
    private javax.swing.JButton export;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton return_main;
    private javax.swing.JTextField search_feild_a;
    private javax.swing.JButton show_details;
    private javax.swing.JButton show_workers;
    // End of variables declaration//GEN-END:variables

    private static class JFrame extends Component {

        public JFrame() {
        }
    }
}
