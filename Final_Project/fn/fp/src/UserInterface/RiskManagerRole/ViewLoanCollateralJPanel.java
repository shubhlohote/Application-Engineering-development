/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RiskManagerRole;

import Business.Collateral.Collateral;
import Business.Department.CustomerServiceDepartment;
import Business.Department.Department;
import Business.Department.LoanProcessingDepartment;
import Business.Department.RiskAssessmentDepartment;
import Business.Enterprise.Enterprise;
import Business.Loan.Loan;
import Business.UserAccount.Useraccount;
import Business.Workqueue.RiskAssessmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class ViewLoanCollateralJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLoanCollateralJPanel
     */
    JPanel userProcessContainer;
    RiskAssessmentWorkRequest request;
    Useraccount userAccount;
    RiskAssessmentDepartment department;
    Enterprise enterprise;

    ViewLoanCollateralJPanel(JPanel userProcessContainer, RiskAssessmentWorkRequest request, Useraccount userAccount, RiskAssessmentDepartment department, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        this.userAccount=userAccount;
        this.department=department;
        this.enterprise=enterprise;
        txtssn.setText(String.valueOf(request.getSender().getCustomer().getSSN()));
        txtLoanAmount.setText(String.valueOf(request.getLoanAmount()));
        txtLoanType.setText(request.getLoanType());
        txtYearlyIncome.setText(String.valueOf(request.getSender().getCustomer().getYearlyIncome()));
        txtdues.setText(request.getDues());
        txtCollType.setText(request.getCollateralType());
        txtInsuranceAmount.setText(String.valueOf(request.getInsuranceAmount()));
        txtHazards.setText(request.getHazard());
       // txtOwnerDate.setText(String.valueOf(request.getOwnershipDate()));
       txtValuation.setText(String.valueOf(request.getValuation()));
       txtOwnerDate.setText(String.valueOf(request.getOwnershipDate()));
       btnApprove.setEnabled(false);
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txtInsuranceAmount = new javax.swing.JTextField();
        txtValuation = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        txtLGD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdues = new javax.swing.JTextField();
        btnCalculatePDRating = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtssn = new javax.swing.JTextField();
        txtYearlyIncome = new javax.swing.JTextField();
        txtLoanType = new javax.swing.JTextField();
        txtLoanAmount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Decision = new javax.swing.JLabel();
        decComboBox = new javax.swing.JComboBox<>();
        txtPd = new javax.swing.JTextField();
        txtCollType = new javax.swing.JTextField();
        txtOwnerDate = new javax.swing.JTextField();
        txtHazards = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 57, 98));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Insurance Amount:");

        txtInsuranceAmount.setEnabled(false);
        txtInsuranceAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceAmountActionPerformed(evt);
            }
        });

        txtValuation.setEnabled(false);
        txtValuation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValuationActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enrironmental Hazards:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Type:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Collateral Details:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Current date Valuation:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Effective Ownership date");

        btnApprove.setBackground(new java.awt.Color(0, 0, 51));
        btnApprove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Submit");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LGD Rating(Loss Gain Default)");

        btnCalculate.setBackground(new java.awt.Color(0, 0, 51));
        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate Rating");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Yearly Income");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Loan Type");

        txtdues.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtduesKeyPressed(evt);
            }
        });

        btnCalculatePDRating.setBackground(new java.awt.Color(0, 0, 51));
        btnCalculatePDRating.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalculatePDRating.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculatePDRating.setText("Calculate Rating");
        btnCalculatePDRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatePDRatingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer SSN");

        txtssn.setEnabled(false);

        txtYearlyIncome.setEnabled(false);

        txtLoanType.setEnabled(false);

        txtLoanAmount.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Loan Amount");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Earlier Loan Dues");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("PD (Probability Of Default)");

        Decision.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Decision.setForeground(new java.awt.Color(255, 255, 255));
        Decision.setText("Decision");

        decComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Risk Manager - Approved", "Risk Manager - Declined" }));

        txtPd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPdActionPerformed(evt);
            }
        });

        txtCollType.setEnabled(false);

        txtOwnerDate.setEnabled(false);

        txtHazards.setEnabled(false);

        backJButton.setBackground(new java.awt.Color(2, 27, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtValuation, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                            .addComponent(txtCollType)
                                            .addComponent(txtOwnerDate)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLGD, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Decision)
                                        .addGap(46, 46, 46)
                                        .addComponent(decComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnApprove)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtInsuranceAmount)
                                    .addComponent(txtHazards, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnCalculate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtYearlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdues, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(43, 43, 43)
                                .addComponent(txtPd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnCalculatePDRating))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(backJButton)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtdues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtYearlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalculatePDRating))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCollType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOwnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHazards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInsuranceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValuation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decision)
                    .addComponent(decComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtInsuranceAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuranceAmountActionPerformed

    private void txtValuationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValuationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValuationActionPerformed

    private void txtPdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPdActionPerformed

    private void btnCalculatePDRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatePDRatingActionPerformed
        // TODO add your handling code here:
        String dues=txtdues.getText();
        double income=Double.parseDouble(txtYearlyIncome.getText());
        double loanAmount=Double.parseDouble(txtLoanAmount.getText());
        if(dues.equalsIgnoreCase("No") && (loanAmount<=(0.7*income)))
        {
            txtPd.setText("Low");
            txtPd.setBackground(Color.GREEN);
        }
        else
        {
            
            txtPd.setText("High");
            txtPd.setBackground(Color.red);
        }
        
    }//GEN-LAST:event_btnCalculatePDRatingActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        String result=(String)decComboBox.getSelectedItem();
        request.setTestResult(result);
        request.setStatus(result);
        //request.setStatus("Completed");
        request.setResolveDate(new Date());
        if(request.getStatus().equalsIgnoreCase("Risk Manager - Approved"))
        {
            Loan loan=request.getSender().getCustomer().getLoanDirectory().createAndAddLoan();
            loan.setAmortization(request.getAmortization());
            loan.setDisbursementDate(request.getDisbursementDate());
            loan.setNoOfTakedown(request.getNoOfTakedown());
            loan.setIndexRate(request.getIndexRate());
            loan.setInstallment(request.getInstallment());
            loan.setLoanAmount(request.getLoanAmount());
            loan.setLoanTerm(request.getLoanTerm());
            loan.setLoanType(request.getLoanType());
            loan.setNoOfInstallments(request.getNoOfInstallments());
            loan.setRepaymentEndDAte(request.getRepaymentEndDAte());
            loan.setRepaymentStartDate(request.getRepaymentStartDate());
           loan.setStatus(request.getStatus());
           Collateral collateral=loan.getCollateralDirectory().createAndAddCollateral();
           collateral.setCollateralType(request.getCollateralType());
           
           collateral.setHazard(request.getHazard());
           collateral.setHazardDesciption(request.getHazardDesciption());
           collateral.setInsuranceAmount(request.getInsuranceAmount());
           collateral.setOwnershipDate(request.getOwnershipDate());
           collateral.setValuation(request.getValuation());
            
            Department org = null;
        for (Department department : enterprise.getDepartmentDirectory().getDepartmentList()){
            if (department instanceof LoanProcessingDepartment){
                org = department;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Loan request sent to loan processing department successfully","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        
        }
        else if (request.getStatus().equalsIgnoreCase("Risk Manager - Declined"))
        {
            JOptionPane.showConfirmDialog(null, "Loan request is declined !!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        btnApprove.setEnabled(true);
        String hazards=txtHazards.getText();
        double loanAmount=Double.parseDouble(txtLoanAmount.getText());
        double valuation=Double.parseDouble(txtValuation.getText());
        double insurance=Double.parseDouble(txtInsuranceAmount.getText());
        if(hazards.equalsIgnoreCase("No") && (loanAmount<=(valuation + insurance)))
        {
            txtLGD.setText("Low");
            txtLGD.setBackground(Color.GREEN);
        }
        else
        {
            txtLGD.setText("High");
            txtLGD.setBackground(Color.red);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtduesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduesKeyPressed
        // TODO add your handling code here:
        int event =evt.getKeyCode();
        if((event>=evt.VK_A && event<=evt.VK_Z) || event ==evt.VK_BACK_SPACE || event>=evt.VK_CAPS_LOCK || event<=evt.VK_SHIFT)
        {
            txtdues.setEditable(true);
            
        }
        else
        {
            txtdues.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter valid cost price","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtduesKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Decision;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCalculatePDRating;
    private javax.swing.JComboBox<String> decComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCollType;
    private javax.swing.JTextField txtHazards;
    private javax.swing.JTextField txtInsuranceAmount;
    private javax.swing.JTextField txtLGD;
    private javax.swing.JTextField txtLoanAmount;
    private javax.swing.JTextField txtLoanType;
    private javax.swing.JTextField txtOwnerDate;
    private javax.swing.JTextField txtPd;
    private javax.swing.JTextField txtValuation;
    private javax.swing.JTextField txtYearlyIncome;
    private javax.swing.JTextField txtdues;
    private javax.swing.JTextField txtssn;
    // End of variables declaration//GEN-END:variables
}
