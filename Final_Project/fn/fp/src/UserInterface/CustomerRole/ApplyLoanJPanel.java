/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Department.DepartmentDirectory;
import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class ApplyLoanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApplyLoanJPanel
     */
    JPanel userProcessContainer; 
    Enterprise enterprise;
    Useraccount account;
    
    

    ApplyLoanJPanel(JPanel userProcessContainer, Useraccount account, Enterprise enterprise) {
       initComponents(); 
       this.userProcessContainer=userProcessContainer;
       this.account=account;
       this.enterprise=enterprise;
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmitLoanDetails = new javax.swing.JButton();

        btnSubmitLoanDetails.setText("Submit Loan Details");
        btnSubmitLoanDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitLoanDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnSubmitLoanDetails)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btnSubmitLoanDetails)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitLoanDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitLoanDetailsActionPerformed
        // TODO add your handling code here:
        LoanDetailJPanel manageCustomerJPanel = new LoanDetailJPanel(userProcessContainer,account, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageCustomerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSubmitLoanDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitLoanDetails;
    // End of variables declaration//GEN-END:variables
}
