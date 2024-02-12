/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.company2566;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthit LungYa
 */
public class OrderDetail extends javax.swing.JFrame {

    /**
     * Creates new form OrderDetail
     */
    public OrderDetail() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderNo = new javax.swing.JTextField();
        itemCode = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        ButtonNew = new javax.swing.JButton();
        ButtonShow = new javax.swing.JButton();
        ButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OrderDetail");

        jLabel1.setText("OrderNumber");

        jLabel2.setText("itemCode");

        jLabel3.setText("Price");

        jLabel4.setText("Qty");

        jLabel5.setText("Total");

        orderNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                orderNoKeyPressed(evt);
            }
        });

        itemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemCodeKeyPressed(evt);
            }
        });

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
        });

        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyKeyPressed(evt);
            }
        });

        ButtonNew.setText("New");
        ButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNewActionPerformed(evt);
            }
        });

        ButtonShow.setText("Show");
        ButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowActionPerformed(evt);
            }
        });

        ButtonClose.setText("Close");
        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonShow, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderNo)
                    .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNew)
                    .addComponent(ButtonShow)
                    .addComponent(ButtonClose))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNewActionPerformed
        orderNo.setText("");
        itemCode.setText("");
        price.setText("");
        qty.setText("");
        total.setText("");
        orderNo.requestFocus();
    }//GEN-LAST:event_ButtonNewActionPerformed

    private void calculateAmount() {
        try {
            double priceValue = Double.parseDouble(price.getText());
            int qtyValue = Integer.parseInt(qty.getText());
            double Total = priceValue * qtyValue;
            total.setText(String.valueOf(Total));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
   
    private void ButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowActionPerformed
        calculateAmount();
        String Orno = orderNo.getText();
        String OritemCode = itemCode.getText();
        String OrPrice = price.getText();
        String OrQty = qty.getText();
        String OrTotal = total.getText();
        String message = "Order Code: " + Orno + "\nItem Code: " + OritemCode +  "\nitemPrice: " + OrPrice
        + "\nitemQty: " + OrQty + "\nitemAmount: " + OrTotal;
        JOptionPane.showMessageDialog(this, message, "Order Detail", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ButtonShowActionPerformed

    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCloseActionPerformed
        int pressed = JOptionPane.showConfirmDialog(null, "Confirm", "Exit ?", JOptionPane.OK_CANCEL_OPTION);
        if (pressed == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_ButtonCloseActionPerformed

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            qty.requestFocus();
            calculateAmount();
        }
    }//GEN-LAST:event_priceKeyPressed

    private void qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calculateAmount();
        }
    }//GEN-LAST:event_qtyKeyPressed

    private void orderNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderNoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            itemCode.requestFocus();
        }
    }//GEN-LAST:event_orderNoKeyPressed

    private void itemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           price.requestFocus();
        }
    }//GEN-LAST:event_itemCodeKeyPressed

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
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClose;
    private javax.swing.JButton ButtonNew;
    private javax.swing.JButton ButtonShow;
    private javax.swing.JTextField itemCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField orderNo;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}