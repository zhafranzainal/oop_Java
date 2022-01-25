/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbankms;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class GUI_BBMS_Menu1 extends javax.swing.JFrame {

    /**
     * Creates new form GUI_BBMS_Menu
     */
    public GUI_BBMS_Menu1() {
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

        btngrpChoose_Option = new javax.swing.ButtonGroup();
        btnOk = new javax.swing.JButton();
        radDonate_Blood = new javax.swing.JRadioButton();
        radReceive_Blood = new javax.swing.JRadioButton();
        radDisplay_Blood = new javax.swing.JRadioButton();
        radHelp = new javax.swing.JRadioButton();
        btnExit = new javax.swing.JButton();
        lbMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk.setText("Confirm ");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btngrpChoose_Option.add(radDonate_Blood);
        radDonate_Blood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radDonate_Blood.setText("Donate Blood");
        radDonate_Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDonate_BloodActionPerformed(evt);
            }
        });

        btngrpChoose_Option.add(radReceive_Blood);
        radReceive_Blood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radReceive_Blood.setText("Receive Blood");
        radReceive_Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radReceive_BloodActionPerformed(evt);
            }
        });

        btngrpChoose_Option.add(radDisplay_Blood);
        radDisplay_Blood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radDisplay_Blood.setText("Display Blood");
        radDisplay_Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDisplay_BloodActionPerformed(evt);
            }
        });

        btngrpChoose_Option.add(radHelp);
        radHelp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radHelp.setText("Help / Information");
        radHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radHelpActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lbMenu.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbMenu.setText("BBMS MENU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(lbMenu)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radDonate_Blood)
                            .addComponent(radDisplay_Blood)
                            .addComponent(radHelp)
                            .addComponent(radReceive_Blood))
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(342, 342, 342))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radDonate_Blood)
                .addGap(18, 18, 18)
                .addComponent(radReceive_Blood)
                .addGap(18, 18, 18)
                .addComponent(radDisplay_Blood)
                .addGap(18, 18, 18)
                .addComponent(radHelp)
                .addGap(49, 49, 49)
                .addComponent(btnOk)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
//        if(radDonate_Blood.isSelected()){
//            //open frame DB
//            GUI_DB frmDB = new GUI_DB();
//            frmDB.show();//display frame
//            dispose();//close current frame
//        }
//        else if(radReceive_Blood.isSelected()){
//            GUI_RB frmRB = new GUI_RB();
//            frmRB.show();
//            dispose();
//        }
//        else if(radDisplay_Blood.isSelected()){
//            GUI_DISB frmDISB = new GUI_DISB();
//            frmDISB.show();
//            dispose();
//        }
//        else if(radHelp.isSelected()){
//            GUI_HELP frmHELP = new GUI_HELP();
//            frmHELP.show();
//            dispose();
//        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void radDonate_BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDonate_BloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radDonate_BloodActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        String [] options = {"Yes", "Confirm Exit"}; // button text 
        int x = JOptionPane.showOptionDialog(null , "Continue session?",
                "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            //when user choose yes
            if(x == 0){
                setVisible(true);}
            //when user choose no
            else{
                JOptionPane.showMessageDialog(null, "You have successfully logged out from Blood Bank Management System (BBMS)");
                this.dispose();}
                
    }//GEN-LAST:event_btnExitActionPerformed

    private void radReceive_BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radReceive_BloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radReceive_BloodActionPerformed

    private void radDisplay_BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDisplay_BloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radDisplay_BloodActionPerformed

    private void radHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radHelpActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_BBMS_Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_BBMS_Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_BBMS_Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_BBMS_Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_BBMS_Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup btngrpChoose_Option;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JRadioButton radDisplay_Blood;
    private javax.swing.JRadioButton radDonate_Blood;
    private javax.swing.JRadioButton radHelp;
    private javax.swing.JRadioButton radReceive_Blood;
    // End of variables declaration//GEN-END:variables
}