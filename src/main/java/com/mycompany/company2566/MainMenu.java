/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.company2566;

import java.awt.Font;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Arthit LungYa
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        MainMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openCustomer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        openDepartment = new javax.swing.JMenuItem();
        openEmployee = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        openitemType = new javax.swing.JMenuItem();
        openitem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        openCustomerOrder = new javax.swing.JMenuItem();
        openOrderDetail = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainMenu");
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setText("Company Management");

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jButton1.setText("Enter");
        jButton1.setFocusable(false);

        closeButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        closeButton.setText("Close");
        closeButton.setFocusable(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        MainMenu.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        jMenu1.setText("Customer Manage");
        jMenu1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        openCustomer.setText("Customer");
        openCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(openCustomer);

        MainMenu.add(jMenu1);

        jMenu2.setText("Employee Manage");
        jMenu2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        openDepartment.setText("Department");
        openDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDepartmentActionPerformed(evt);
            }
        });
        jMenu2.add(openDepartment);

        openEmployee.setText("Employee");
        openEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(openEmployee);

        MainMenu.add(jMenu2);

        jMenu3.setText("Stock Manage");
        jMenu3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        openitemType.setText("itemType");
        openitemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openitemTypeActionPerformed(evt);
            }
        });
        jMenu3.add(openitemType);

        openitem.setText("item");
        openitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openitemActionPerformed(evt);
            }
        });
        jMenu3.add(openitem);

        MainMenu.add(jMenu3);

        jMenu4.setText("Sale Manage");

        openCustomerOrder.setText("CustomerOrder");
        openCustomerOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCustomerOrderActionPerformed(evt);
            }
        });
        jMenu4.add(openCustomerOrder);

        openOrderDetail.setText("OrderDetail");
        openOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOrderDetailActionPerformed(evt);
            }
        });
        jMenu4.add(openOrderDetail);

        MainMenu.add(jMenu4);

        setJMenuBar(MainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(closeButton)
                        .addGap(55, 55, 55))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(closeButton))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        int pressed = JOptionPane.showConfirmDialog(null, "Confirm", "Exit ?", JOptionPane.OK_CANCEL_OPTION);
        if (pressed == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void openCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCustomerActionPerformed
        new Customer().setVisible(true);
    }//GEN-LAST:event_openCustomerActionPerformed

    private void openEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openEmployeeActionPerformed
        new Employee().setVisible(true);
    }//GEN-LAST:event_openEmployeeActionPerformed

    private void openitemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openitemTypeActionPerformed
        new itemType().setVisible(true);
    }//GEN-LAST:event_openitemTypeActionPerformed

    private void openitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openitemActionPerformed
        new Item().setVisible(true);
    }//GEN-LAST:event_openitemActionPerformed

    private void openDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDepartmentActionPerformed
        new Department().setVisible(true);
    }//GEN-LAST:event_openDepartmentActionPerformed

    private void openCustomerOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCustomerOrderActionPerformed
        new CustomerOrder().setVisible(true);
    }//GEN-LAST:event_openCustomerOrderActionPerformed

    private void openOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOrderDetailActionPerformed
        new OrderDetail().setVisible(true);
    }//GEN-LAST:event_openOrderDetailActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Font microsoftSansSerifFont = new Font("Microsoft Sans Serif", Font.PLAIN, 14);
        setGlobalFont(microsoftSansSerifFont);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MainMenu;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem openCustomer;
    private javax.swing.JMenuItem openCustomerOrder;
    private javax.swing.JMenuItem openDepartment;
    private javax.swing.JMenuItem openEmployee;
    private javax.swing.JMenuItem openOrderDetail;
    private javax.swing.JMenuItem openitem;
    private javax.swing.JMenuItem openitemType;
    // End of variables declaration//GEN-END:variables
}
