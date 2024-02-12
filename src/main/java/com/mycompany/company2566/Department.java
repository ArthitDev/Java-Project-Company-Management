/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.company2566;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthit LungYa
 */
public class Department extends javax.swing.JFrame {

    /**
     * Creates new form Department
     */
    Connection conn = null;
    Statement statement = null;
    DefaultTableModel tableModel = new DefaultTableModel();

    public Department() {
        initComponents();
        connectDB();
        testConnection();
        dataTable.setModel(tableModel);
        tableModel.setRowCount(0);
        displayDepartmentData();
    }

    public static void setGlobalFont(Font font) {
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof Font) {
                UIManager.put(key, font);
            }
        }
    }

    public void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db", "root", "");
                statement = (Statement) conn.createStatement();
            } catch (SQLException ex) {
            }
        } catch (ClassNotFoundException ex) {
        }
    }

    public void testConnection() {
        if (conn != null) {
            try {
                if (!conn.isClosed()) {
                    System.out.println("Connection is valid");
                } else {
                    System.out.println("Connection is closed");
                }
            } catch (SQLException e) {
                System.err.println("Error checking connection validity: " + e.getMessage());
            }
        } else {
            System.out.println("Connection is null");
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

        dCode = new javax.swing.JLabel();
        dName = new javax.swing.JLabel();
        DepartmentCode = new javax.swing.JTextField();
        DepartmentName = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        showButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Department");

        dCode.setText("DepartmentCode");

        dName.setText("DepartmentName");

        DepartmentCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DepartmentCodeKeyPressed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        dataTable.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "รหัสแผนก", "ชื่อแผนก"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dCode)
                    .addComponent(dName))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(335, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(Delete)
                    .addComponent(Update))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dCode)
                    .addComponent(DepartmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dName)
                    .addComponent(DepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(showButton)
                    .addComponent(closeButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayDepartmentData() {
//        String sql = "select * from department order by departmentCode asc";
//        try {
//            ResultSet resultSet = statement.executeQuery(sql);
//            ResultSetMetaData metaData = resultSet.getMetaData();
//            int columnCount = metaData.getColumnCount();
//            Vector<String> columnNames = new Vector<>();
//            for (int column = 1; column <= columnCount; column++) {
//                columnNames.add(metaData.getColumnName(column));
//            }
//            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//            while (resultSet.next()) {
//                Vector<Object> rowData = new Vector<>();
//                for (int i = 1; i <= columnCount; i++) {
//                    rowData.add(resultSet.getObject(i));
//                }
//                model.addRow(rowData);
//            }
//            dataTable.setModel(model);
//            resultSet.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
        try {
            DefaultTableModel tablemodel = new DefaultTableModel();
            Object[] header = {"DepartmentCode", "departmentName"};
            tablemodel.setColumnIdentifiers(header);
            dataTable.setModel(tablemodel);

            ResultSet rs = statement.executeQuery("SELECT * FROM department order by departmentCode asc");
            while (rs.next()) {
                Object[] row = {rs.getString(1), rs.getString(2)};
                tablemodel.addRow(row);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int pressed = JOptionPane.showConfirmDialog(null, "ยืนยัน", "ปิดหน้านี้ ?", JOptionPane.OK_CANCEL_OPTION);
        if (pressed == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        DepartmentCode.setText("");
        DepartmentName.setText("");
        DepartmentCode.requestFocus();
    }//GEN-LAST:event_newButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        try {
            String selectQuery = "SELECT * FROM department order by departmentCode asc";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            StringBuilder message = new StringBuilder("ข้อมูลแผนก\n");
            message.append("--------------------------------------------------- ").append("\n");
            while (resultSet.next()) {
                int code = resultSet.getInt("departmentCode");
                String name = resultSet.getString("departmentName");
                message.append("รหัสแผนก : ").append(code);
                message.append("ชื่อแผนก : ").append(name).append("\n");
            }
            JOptionPane.showMessageDialog(this, message.toString(), "ข้อมูลแผนก", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_showButtonActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        boolean check = true;
        if (check) {
            String insert = "INSERT INTO department VALUES (" + DepartmentCode.getText() + ", '" + DepartmentName.getText() + "');";
            try {
                statement.executeUpdate(insert);
                check = false;
            } catch (Exception ex) {
            }
        }
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลแผนกเรียบร้อยแล้ว");
        newButton.doClick();
        displayDepartmentData();
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int pressed = JOptionPane.showConfirmDialog(null, "ตกลง", "ลบข้อมูล ?", JOptionPane.OK_CANCEL_OPTION);
        if (pressed == 0) {
            String Dcode = DepartmentCode.getText();
            try {
                String deleteQuery = "DELETE FROM department WHERE departmentCode = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(deleteQuery);
                preparedStatement.setString(1, Dcode);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อยแล้ว.", "แจ้งเตือน", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "ลบข้อมูลไม่สำเร็จ", "แจ้งเตือน", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            newButton.doClick();
            displayDepartmentData();
        }
        newButton.doClick();
        displayDepartmentData();
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String update = "UPDATE department SET DepartmentName = '" + DepartmentName.getText() + "' WHERE DepartmentCode = " + DepartmentCode.getText() + ";";
        try {
            statement.executeUpdate(update);
        } catch (SQLException ex) {
        }

        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลแผนกเรียบร้อยแล้ว");
        newButton.doClick();
        displayDepartmentData();
    }//GEN-LAST:event_UpdateActionPerformed

    private void DepartmentCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepartmentCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String selectQuery = "SELECT * FROM department where departmentCode=" + DepartmentCode.getText();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                while (resultSet.next()) {
                    DepartmentName.setText(resultSet.getString(2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_DepartmentCodeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        Font microsoftSansSerifFont = new Font("Microsoft Sans Serif", Font.PLAIN, 14);
        setGlobalFont(microsoftSansSerifFont);
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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField DepartmentCode;
    private javax.swing.JTextField DepartmentName;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel dCode;
    private javax.swing.JLabel dName;
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
}