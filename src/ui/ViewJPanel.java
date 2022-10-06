/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EmpInfo;
import model.EmpInfoDatabase;

/**
 *
 * @author HELLY
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmpInfoDatabase database;
    
    public ViewJPanel(EmpInfoDatabase database) {
        initComponents();
        
        this.database = database; 
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpInfo = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Open Sans SemiBold", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(19, 105, 191));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee Profile");

        tblEmpInfo.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tblEmpInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpInfo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblEmpInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEmpInfo.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpInfo.setMinimumSize(new java.awt.Dimension(150, 150));
        tblEmpInfo.setRequestFocusEnabled(false);
        tblEmpInfo.setRowHeight(30);
        tblEmpInfo.setShowGrid(true);
        jScrollPane1.setViewportView(tblEmpInfo);

        btnDelete.setBackground(new java.awt.Color(221, 38, 38));
        btnDelete.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(153, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(14, 153, 112));
        btnView.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("Read");
        btnView.setPreferredSize(new java.awt.Dimension(153, 35));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(19, 105, 191));
        jButton1.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/search.png"))); // NOI18N
        jButton1.setText(" Search");

        txtSearch.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(350, 350, 350))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnView});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, txtSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmpInfo.getSelectedRow();
        
        if (selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        EmpInfo selectedEmpInfo = (EmpInfo) model.getValueAt(selectedRowIndex, 0);
        
        database.deleteEmpInfo(selectedEmpInfo);
        
        JOptionPane.showMessageDialog(this, "Employee Information Delete!");
        
        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmpInfo.getSelectedRow();
        
        if (selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        EmpInfo selectedEmpInfo = (EmpInfo) model.getValueAt(selectedRowIndex, 0);
        
        ReadJPanel readPanel = new ReadJPanel(database);
        ViewJPanel.setJPanel(readPanel);
        
        txtName.setText(selectedEmpInfo.getName());
        txtID.setText(String.valueOf(selectedEmpInfo.getEmployeeId()));
        txtAge.setText(String.valueOf(selectedEmpInfo.getAge()));
        txtGender.setText(String.valueOf(selectedEmpInfo.getGender()));
        txtStartDate.setText(selectedEmpInfo.getStartDate());
        txtLevel.setText(selectedEmpInfo.getLevel());
        txtTeam.setText(selectedEmpInfo.getTeamInfo());
        txtPosition.setText(selectedEmpInfo.getPositionTitle());
        txtPhone.setText(selectedEmpInfo.getPhoneNumber());
        txtEmail.setText(selectedEmpInfo.getEmail());
        
        
          
    }//GEN-LAST:event_btnViewActionPerformed


    public void search(String str) {
        DefaultTableModel table = (DefaultTableModel) tblEmpInfo.getModel();
           TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
           tblEmpInfo.setRowSorter(trs);
           trs.setRowFilter(RowFilter.regexFilter(str));
        }

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:    
        String searchString = txtSearch.getText();
        search(searchString);
    }//GEN-LAST:event_txtSearchKeyReleased
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmpInfo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        model.setRowCount(0);
        
        for (EmpInfo ei : database.getDatabase()) {
            
            Object[] row = new Object[10];
            row[0] = ei;
            row[1] = ei.getEmployeeId();
            row[2] = ei.getAge();
            row[3] = ei.getGender();
            row[4] = ei.getStartDate();
            row[5] = ei.getLevel();
            row[6] = ei.getTeamInfo();
            row[7] = ei.getPositionTitle();
            row[8] = ei.getPhoneNumber();
            row[9] = ei.getEmail();
            
            model.addRow(row);
            
        }
    }

}
