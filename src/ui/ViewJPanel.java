/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.ActionListener;
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

        lblEmail = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        lble = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpInfo = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lble1 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblID2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        lblAge2 = new javax.swing.JLabel();
        lblGender2 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Gender = new javax.swing.JTextField();
        EmpLevel = new javax.swing.JTextField();
        lblStartDate1 = new javax.swing.JLabel();
        lblLevel1 = new javax.swing.JLabel();
        StartDate = new javax.swing.JTextField();
        TeamInfo = new javax.swing.JTextField();
        EmpPos = new javax.swing.JTextField();
        lblTeam1 = new javax.swing.JLabel();
        lblPosition1 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        lblPhone1 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();

        lblEmail.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblEmail.setText("Email Address");

        lblTeam.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblTeam.setText("Team Info");

        lblPosition.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblPosition.setText("Employee Position ");

        txtStartDate.setBackground(new java.awt.Color(245, 244, 250));
        txtStartDate.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        txtAge.setBackground(new java.awt.Color(245, 244, 250));
        txtAge.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblGender.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblGender.setText("Gender");

        txtName.setBackground(new java.awt.Color(245, 244, 250));
        txtName.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        txtName.setPreferredSize(new java.awt.Dimension(7, 30));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPhone.setBackground(new java.awt.Color(245, 244, 250));
        txtPhone.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtTeam.setBackground(new java.awt.Color(245, 244, 250));
        txtTeam.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtPosition.setBackground(new java.awt.Color(245, 244, 250));
        txtPosition.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtGender.setBackground(new java.awt.Color(245, 244, 250));
        txtGender.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        txtID.setBackground(new java.awt.Color(245, 244, 250));
        txtID.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblName.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblName.setText("Employee Name");

        lblPhone.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblPhone.setText("Phone Number");

        txtLevel.setBackground(new java.awt.Color(245, 244, 250));
        txtLevel.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblStartDate.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblStartDate.setText("Start Date");

        lblAge.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblAge.setText("Age");

        lblLevel.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblLevel.setText("Employee Level");

        txtEmail.setBackground(new java.awt.Color(245, 244, 250));
        txtEmail.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblID.setText("Employee ID");

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
        tblEmpInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpInfoMouseClicked(evt);
            }
        });
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

        btnUpdate.setBackground(new java.awt.Color(212, 135, 19));
        btnUpdate.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(153, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblImg.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setText("Your Photo Here.");
        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblName2.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblName2.setText("Employee Name");

        lblID2.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblID2.setText("Employee ID");

        Name.setBackground(new java.awt.Color(245, 244, 250));
        Name.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        Name.setPreferredSize(new java.awt.Dimension(7, 30));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        ID.setBackground(new java.awt.Color(245, 244, 250));
        ID.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblAge2.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblAge2.setText("Age");

        lblGender2.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblGender2.setText("Gender");

        Age.setBackground(new java.awt.Color(245, 244, 250));
        Age.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        Gender.setBackground(new java.awt.Color(245, 244, 250));
        Gender.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        EmpLevel.setBackground(new java.awt.Color(245, 244, 250));
        EmpLevel.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblStartDate1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblStartDate1.setText("Start Date");

        lblLevel1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblLevel1.setText("Employee Level");

        StartDate.setBackground(new java.awt.Color(245, 244, 250));
        StartDate.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });

        TeamInfo.setBackground(new java.awt.Color(245, 244, 250));
        TeamInfo.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        EmpPos.setBackground(new java.awt.Color(245, 244, 250));
        EmpPos.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblTeam1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblTeam1.setText("Team Info");

        lblPosition1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblPosition1.setText("Employee Position ");

        Phone.setBackground(new java.awt.Color(245, 244, 250));
        Phone.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N

        lblPhone1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblPhone1.setText("Phone Number");

        Email.setBackground(new java.awt.Color(245, 244, 250));
        Email.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Open Sans", 0, 20)); // NOI18N
        lblEmail1.setText("Email Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(201, 201, 201)
                                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName2)
                                            .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblStartDate1)
                                            .addComponent(lblLevel1)
                                            .addComponent(lblPosition1))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ID)
                                            .addComponent(StartDate)
                                            .addComponent(EmpLevel)
                                            .addComponent(EmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAge2)
                                            .addComponent(lblGender2)
                                            .addComponent(lblTeam1)
                                            .addComponent(lblPhone1)
                                            .addComponent(lblEmail1))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lble1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EmpLevel, EmpPos, ID, Name, StartDate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Age, Email, Gender, Phone, TeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(lble1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAge2)
                                    .addComponent(lblName2)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGender2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblID2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTeam1)
                                    .addComponent(TeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhone1))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail1)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStartDate1)
                                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLevel1)
                                    .addComponent(EmpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPosition1)
                                    .addComponent(EmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(165, 165, 165))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnView});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, txtSearch});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EmpLevel, EmpPos, ID, Name, StartDate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Age, Email, Gender, Phone, TeamInfo});

    }// </editor-fold>//GEN-END:initComponents

    // Delete Button
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

    // Read Button
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

       int selectedRowIndex = tblEmpInfo.getSelectedRow();
        
        if (selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a employee to read thier information!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        EmpInfo selectedEmpInfo = (EmpInfo) model.getValueAt(selectedRowIndex, 0);
        
        Name.setText(String.valueOf(selectedEmpInfo.getName()));
        ID.setText(String.valueOf(selectedEmpInfo.getEmployeeId()));
        StartDate.setText(String.valueOf(selectedEmpInfo.getStartDate()));
        EmpLevel.setText(String.valueOf(selectedEmpInfo.getLevel()));
        EmpPos.setText(String.valueOf(selectedEmpInfo.getPositionTitle()));
        Age.setText(String.valueOf(selectedEmpInfo.getAge()));
        Gender.setText(String.valueOf(selectedEmpInfo.getGender()));
        TeamInfo.setText(String.valueOf(selectedEmpInfo.getTeamInfo()));
        Phone.setText(String.valueOf(selectedEmpInfo.getPhoneNumber()));
        Email.setText(String.valueOf(selectedEmpInfo.getEmail()));    
        
    }//GEN-LAST:event_btnViewActionPerformed


    // Search Functionality
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
    
    // Update Table Info
    private void tblEmpInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpInfoMouseClicked
        // TODO add your handling code here:
        // Set data to their text field
        
        DefaultTableModel table = (DefaultTableModel) tblEmpInfo.getModel();
        
        // Set data to text field when row is selected
    
        
    }//GEN-LAST:event_tblEmpInfoMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        // Get the table model
        DefaultTableModel table = (DefaultTableModel) tblEmpInfo.getModel();
        
        if(tblEmpInfo.getSelectedRowCount() == 1){
            //if single row selected than update
            
            String Name = txtName.getText(); 
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        /*String PATTERN = "^[a-zA-Z0-9] {0,30}[@][a-zA-Z]{0,10}[.][a-zA-z]$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtEmail.getText());

        if(!match.matches()) {
            lble.setText("Invalid Email!");
        }
        else {
            lble.setText(null);
        }

    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
        /* DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY");
        try{
            String date = txtStartDate.getText();
            formatter.parse(date);
            System.out.println("ValidDate");
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
        }*/
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
        /* DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY");
        try{
            String date = txtStartDate.getText();
            formatter.parse(date);
            System.out.println("ValidDate");
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
        }*/
    }//GEN-LAST:event_StartDateActionPerformed

    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        // TODO add your handling code here:
        /*String PATTERN = "^[a-zA-Z0-9] {0,30}[@][a-zA-Z]{0,10}[.][a-zA-z]$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtEmail.getText());

        if(!match.matches()) {
            lble.setText("Invalid Email!");
        }
        else {
            lble.setText(null);
        }
*/
    }//GEN-LAST:event_EmailKeyReleased
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField EmpLevel;
    private javax.swing.JTextField EmpPos;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField StartDate;
    private javax.swing.JTextField TeamInfo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLevel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhone1;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPosition1;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStartDate1;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblTeam1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lble;
    private javax.swing.JLabel lble1;
    private javax.swing.JTable tblEmpInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeam;
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
