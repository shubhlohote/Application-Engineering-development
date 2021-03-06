/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BranchAdminRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class CustomerDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerDetailJPanel
     */
    
     JPanel userProcessContainer; 
     Enterprise enterprise;
     Ecosystem system;
    CustomerDetailJPanel(JPanel userProcessContainer, Enterprise enterprise,Ecosystem system) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.enterprise=enterprise;
       this.system=system;
       
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewCustomerDirectory = new javax.swing.JButton();
        btnCreateCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(8, 32, 56));
        setForeground(new java.awt.Color(255, 255, 255));

        btnViewCustomerDirectory.setBackground(new java.awt.Color(4, 29, 54));
        btnViewCustomerDirectory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewCustomerDirectory.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomerDirectory.setText("View Customer Directory");
        btnViewCustomerDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerDirectoryActionPerformed(evt);
            }
        });

        btnCreateCustomer.setBackground(new java.awt.Color(4, 29, 54));
        btnCreateCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateCustomer.setText("Create Customer");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Management:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/BranchAdminRole/images8.jpg"))); // NOI18N

        backjButton1.setBackground(new java.awt.Color(4, 30, 57));
        backjButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewCustomerDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCustomerDirectory)
                    .addComponent(btnCreateCustomer))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomerDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerDirectoryActionPerformed
        // TODO add your handling code here:
        ViewCustomerDirectorJpanel accountOpeningJPanel = new ViewCustomerDirectorJpanel(userProcessContainer, system);
        userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewCustomerDirectoryActionPerformed

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
        // TODO add your handling code here:
        ManageCustomerJPanel accountOpeningJPanel = new ManageCustomerJPanel(userProcessContainer, enterprise,system);
        userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnViewCustomerDirectory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
