/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LoanProcessingManagerRole;

import Business.Department.Department;
import Business.Department.LoanProcessingDepartment;
import Business.Enterprise.Enterprise;
import Business.Loan.Loan;
import Business.Network.Customer;
import Business.Network.CustomerDirectory;
import Business.UserAccount.Useraccount;
import Business.Workqueue.InfoAlertWorkRequest;
import Business.Workqueue.RiskAssessmentWorkRequest;
import Business.Workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin01
 */
public class RepaymentManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RepaymentManagementJPanel
     */
    JPanel userProcessContainer;
    Useraccount userAccount;
    LoanProcessingDepartment department;
    CustomerDirectory customerDirectory;

    RepaymentManagementJPanel(JPanel userProcessContainer, Useraccount userAccount, LoanProcessingDepartment department, CustomerDirectory customerDirectory) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.userAccount=userAccount;
       this.department=department;
       this.customerDirectory=customerDirectory;
       for (Customer customer : customerDirectory.getCustomerList()) {

            custIdComboBox.addItem(customer);
        }
       
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        Customer customer = (Customer) custIdComboBox.getSelectedItem();
        model.setRowCount(0);
        //for()
        for (Loan loan : customer.getLoanDirectory().getLoanList()){
            Object[] row = new Object[8];
            row[0] = loan;
            row[1] = loan.getRepaymentStartDate();
            row[2] = loan.getRepaymentEndDAte();
            row[3] = loan.getLoanAmount();
            row[4] = loan.getNoOfInstallments();
            row[5] = loan.getNoOfInstallmentsUnpaid();
            row[6] = loan.getNoOfInstallmentsPaid();
            row[7] = loan.getStatus();
            
            
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        custIdComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 102));

        workRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loan Id", "Start Date", "End Date", "Loan Amount", "Total No Of Installment", "No Of Installments unpaid", "No Of Installments paid", "Loan Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestJTable);

        custIdComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        custIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIdComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer SSN");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 51));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Status");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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
        jLabel1.setText("Repayment Management:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(backJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(custIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(305, 305, 305)
                            .addComponent(btnUpdate))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custIdComboBox)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(backJButton)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void custIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIdComboBoxActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_custIdComboBoxActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, "Please select the row","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        Loan loan = (Loan)workRequestJTable.getValueAt(selectedRow, 0);
        Date repayEndDate=loan.getRepaymentEndDAte();
        if(loan.getNoOfInstallments()==loan.getNoOfInstallmentsPaid())
        {
        loan.setStatus("Closed");
        Customer customer = (Customer) custIdComboBox.getSelectedItem();
        customer.setStatus("Good");
        
        populateRequestTable();
        }
        else if(0<loan.getNoOfInstallmentsUnpaid() || loan.getNoOfInstallmentsUnpaid()<loan.getNoOfInstallments())
        {
          loan.setStatus("Escalated");
          Customer customer = (Customer) custIdComboBox.getSelectedItem();
        customer.setStatus("Black-Listed");
          populateRequestTable();
          
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox custIdComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}