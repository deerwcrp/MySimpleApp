/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysimpleapp;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        txtA = new javax.swing.JTextField();
        lbPlus = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lbEqual = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        bnCalculate = new javax.swing.JButton();
        txtA1 = new javax.swing.JTextField();
        lbPlus1 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        lbEqual1 = new javax.swing.JLabel();
        txtC1 = new javax.swing.JTextField();
        bnCalculate1 = new javax.swing.JButton();
        txtA2 = new javax.swing.JTextField();
        lbPlus2 = new javax.swing.JLabel();
        txtB2 = new javax.swing.JTextField();
        lbEqual2 = new javax.swing.JLabel();
        txtC2 = new javax.swing.JTextField();
        bnCalculate2 = new javax.swing.JButton();
        txtA3 = new javax.swing.JTextField();
        lbPlus3 = new javax.swing.JLabel();
        txtB3 = new javax.swing.JTextField();
        lbEqual3 = new javax.swing.JLabel();
        txtC3 = new javax.swing.JTextField();
        bnCalculate3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello World");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lbPlus.setText("+");

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        lbEqual.setText("=");

        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        bnCalculate.setText("+");
        bnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalculateActionPerformed(evt);
            }
        });

        txtA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA1ActionPerformed(evt);
            }
        });

        lbPlus1.setText("-");

        txtB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB1ActionPerformed(evt);
            }
        });

        lbEqual1.setText("=");

        txtC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1ActionPerformed(evt);
            }
        });

        bnCalculate1.setText("-");
        bnCalculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalculate1ActionPerformed(evt);
            }
        });

        txtA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA2ActionPerformed(evt);
            }
        });

        lbPlus2.setText("*");

        txtB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB2ActionPerformed(evt);
            }
        });

        lbEqual2.setText("=");

        txtC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2ActionPerformed(evt);
            }
        });

        bnCalculate2.setText("*");
        bnCalculate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalculate2ActionPerformed(evt);
            }
        });

        txtA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA3ActionPerformed(evt);
            }
        });

        lbPlus3.setText("/");

        txtB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB3ActionPerformed(evt);
            }
        });

        lbEqual3.setText("=");

        txtC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3ActionPerformed(evt);
            }
        });

        bnCalculate3.setText("/");
        bnCalculate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalculate3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbPlus1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnCalculate1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbPlus2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbEqual2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnCalculate2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lbPlus3)
                        .addGap(18, 18, 18)
                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbEqual3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnCalculate3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnCalculate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus1)
                    .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual1)
                    .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnCalculate1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus2)
                    .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual2)
                    .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnCalculate2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus3)
                    .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual3)
                    .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnCalculate3))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void bnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalculateActionPerformed
        // TODO add your handling code here:
        
        String a = txtA.getText();
        String b = txtB.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        String c = Integer.toString(intC);
               
        txtC.setText(c); 
        
    }//GEN-LAST:event_bnCalculateActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
        
         
       
    }//GEN-LAST:event_txtAActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA1ActionPerformed

    private void txtB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB1ActionPerformed

    private void txtC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1ActionPerformed

    private void bnCalculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalculate1ActionPerformed
        // TODO add your handling code here:
         String a1 = txtA1.getText();
        String b1 = txtB1.getText();
        
        int intA1 = new Integer(a1);
        int intB1 = new Integer(b1);
        int intC1 = intA1-intB1;
        
        String c1 = Integer.toString(intC1);
               
        txtC1.setText(c1); 
        
    }//GEN-LAST:event_bnCalculate1ActionPerformed

    private void txtA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA2ActionPerformed

    private void txtB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB2ActionPerformed

    private void txtC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2ActionPerformed

    private void bnCalculate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalculate2ActionPerformed
        // TODO add your handling code here:
         String a2 = txtA2.getText();
        String b2 = txtB2.getText();
        
        int intA2 = new Integer(a2);
        int intB2 = new Integer(b2);
        int intC2 = intA2*intB2;
        
        String c2 = Integer.toString(intC2);
               
        txtC2.setText(c2); 
    }//GEN-LAST:event_bnCalculate2ActionPerformed

    private void txtA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA3ActionPerformed

    private void txtB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtB3ActionPerformed

    private void txtC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3ActionPerformed

    private void bnCalculate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalculate3ActionPerformed
        // TODO add your handling code here:
         String a3 = txtA3.getText();
        String b3 = txtB3.getText();
        
        int intA3 = new Integer(a3);
        int intB3 = new Integer(b3);
        int intC3 = intA3/intB3;
        
        String c3 = Integer.toString(intC3);
               
        txtC3.setText(c3); 
    }//GEN-LAST:event_bnCalculate3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCalculate;
    private javax.swing.JButton bnCalculate1;
    private javax.swing.JButton bnCalculate2;
    private javax.swing.JButton bnCalculate3;
    private javax.swing.JLabel lbEqual;
    private javax.swing.JLabel lbEqual1;
    private javax.swing.JLabel lbEqual2;
    private javax.swing.JLabel lbEqual3;
    private javax.swing.JLabel lbPlus;
    private javax.swing.JLabel lbPlus1;
    private javax.swing.JLabel lbPlus2;
    private javax.swing.JLabel lbPlus3;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtA2;
    private javax.swing.JTextField txtA3;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtC3;
    // End of variables declaration//GEN-END:variables
}
