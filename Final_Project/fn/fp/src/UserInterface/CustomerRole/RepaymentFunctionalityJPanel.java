/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class RepaymentFunctionalityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RepaymentFunctionalityJPanel
     */
    JPanel userProcessContainer; 
    Enterprise enterprise;
    Useraccount account;

    RepaymentFunctionalityJPanel(JPanel userProcessContainer,Useraccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.account=account;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRepayInstallements = new javax.swing.JButton();
        btnRepaymentStatus = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(21, 64, 107));

        btnRepayInstallements.setBackground(new java.awt.Color(3, 27, 51));
        btnRepayInstallements.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRepayInstallements.setForeground(new java.awt.Color(255, 255, 255));
        btnRepayInstallements.setText("Repay Installements");
        btnRepayInstallements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepayInstallementsActionPerformed(evt);
            }
        });

        btnRepaymentStatus.setBackground(new java.awt.Color(3, 27, 51));
        btnRepaymentStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRepaymentStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnRepaymentStatus.setText("Repayment Status");
        btnRepaymentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepaymentStatusActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(2, 27, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Welcome to Repayment Section:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/images (2).jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRepayInstallements, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRepaymentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepayInstallements)
                    .addComponent(btnRepaymentStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepayInstallementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepayInstallementsActionPerformed
        // TODO add your handling code here:
       RepayLoanJPanel accountOpeningJPanel = new RepayLoanJPanel(userProcessContainer,account, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        
        
    }//GEN-LAST:event_btnRepayInstallementsActionPerformed

    private void btnRepaymentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepaymentStatusActionPerformed
        // TODO add your handling code here:
        RepaymentDetailsJPanel accountOpeningJPanel = new RepaymentDetailsJPanel(userProcessContainer,account, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRepaymentStatusActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRepayInstallements;
    private javax.swing.JButton btnRepaymentStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
