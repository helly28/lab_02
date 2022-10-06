/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.EmpInfo;
import model.EmpInfoDatabase;

/**
 *
 * @author HELLY
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    EmpInfo empinfo;
    private BufferedImage image;
    private Image img;
    
    EmpInfoDatabase database;
    
    public CreateJPanel(EmpInfoDatabase database) {
        initComponents();
        
        this.database = database;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Open Sans SemiBold", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(19, 105, 191));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee Profile");

        lblName.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblName.setText("Employee Name");

        lblID.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblID.setText("Employee ID");

        lblAge.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblAge.setText("Age");

        lblGender.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblGender.setText("Gender");

        lblStartDate.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblStartDate.setText("Start Date");

        lblLevel.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblLevel.setText("Employee Level");

        lblTeam.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblTeam.setText("Team Info");

        lblPosition.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblPosition.setText("Employee Position ");

        lblPhone.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblPhone.setText("Phone Number");

        lblEmail.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblEmail.setText("Email Address");

        txtName.setBackground(new java.awt.Color(245, 244, 250));
        txtName.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        txtName.setPreferredSize(new java.awt.Dimension(7, 30));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtID.setBackground(new java.awt.Color(245, 244, 250));
        txtID.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtAge.setBackground(new java.awt.Color(245, 244, 250));
        txtAge.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtGender.setBackground(new java.awt.Color(245, 244, 250));
        txtGender.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtStartDate.setBackground(new java.awt.Color(245, 244, 250));
        txtStartDate.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtLevel.setBackground(new java.awt.Color(245, 244, 250));
        txtLevel.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtTeam.setBackground(new java.awt.Color(245, 244, 250));
        txtTeam.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtPosition.setBackground(new java.awt.Color(245, 244, 250));
        txtPosition.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtPhone.setBackground(new java.awt.Color(245, 244, 250));
        txtPhone.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtEmail.setBackground(new java.awt.Color(245, 244, 250));
        txtEmail.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        btnSave.setBackground(new java.awt.Color(19, 105, 191));
        btnSave.setFont(new java.awt.Font("Open Sans SemiBold", 0, 20)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save Information");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle1.setFont(new java.awt.Font("Open Sans SemiBold", 0, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(19, 105, 191));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Employee Management System");

        lblImg.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setText("Your Photo Here.");
        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpload.setBackground(new java.awt.Color(19, 105, 191));
        btnUpload.setFont(new java.awt.Font("Open Sans SemiBold", 0, 20)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setText("Upload Photo");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEmail)
                                            .addComponent(btnUpload))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAge)
                                                    .addComponent(lblGender)
                                                    .addComponent(lblStartDate)
                                                    .addComponent(lblLevel))
                                                .addGap(115, 115, 115))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(107, 107, 107))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTeam)
                                                    .addComponent(lblPosition)
                                                    .addComponent(lblPhone))
                                                .addGap(88, 88, 88)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtID)
                                            .addComponent(txtAge)
                                            .addComponent(txtGender)
                                            .addComponent(txtStartDate)
                                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTeam)
                                            .addComponent(txtPosition)
                                            .addComponent(txtPhone)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnSave)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblImg, txtAge, txtEmail, txtGender, txtID, txtLevel, txtName, txtPhone, txtPosition, txtStartDate, txtTeam});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeam)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPosition)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtEmail, txtGender, txtID, txtLevel, txtName, txtPhone, txtPosition, txtStartDate, txtTeam});

    }// </editor-fold>//GEN-END:initComponents
    
        
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
           
        String name = txtName.getText();
        int EmployeeId = Integer.parseInt(txtID.getText());
        int Age = Integer.parseInt(txtAge.getText());
        String Gender = txtGender.getText();
        String StartDate = txtStartDate.getText();
        String Level = txtLevel.getText();
        String TeamInfo = txtTeam.getText();
        String Position = txtPosition.getText();
        int Phone = Integer.parseInt(txtPhone.getText());
        String Email = txtEmail.getText();
        
        EmpInfo ei = database.addNewEmp();
        
        ei.setName(name);
        ei.setEmployeeId(EmployeeId);
        ei.setAge(Age);
        ei.setGender(Gender);
        ei.setStartDate(StartDate);
        ei.setLevel(Level);
        ei.setTeamInfo(TeamInfo);
        ei.setPositionTitle(Position);
        ei.setPhoneNumber(Phone);
        ei.setEmail(Email);
        
        JOptionPane.showMessageDialog(this, "New Employee Information Added.");
        
        txtName.setText("");
        txtID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeam.setText("");
        txtPosition.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}
