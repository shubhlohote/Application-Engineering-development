/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Loan;

import Business.Collateral.CollateralDirectory;
import java.util.Date;

/**
 *
 * @author admin01
 */
public class Loan {
    private String borrowerType;
    private int noOfTakedown;
    private int loanId;
    private static int count=1;
    private String loanType;
    private String loanTerm;
    private double loanAmount;
    private double indexRate;
    private double interestRate;
    private String installment;
    private  String amortization;
    private  Date disbursementDate;
    private  Date repaymentStartDate;
    private  Date repaymentEndDAte;
    private int noOfInstallments;
    private int noOfInstallmentsPaid;
    private int noOfInstallmentsUnpaid;
    private String status;
    private CollateralDirectory collateralDirectory;
    
    public Loan()
    {
        loanId=count++;
        collateralDirectory=new CollateralDirectory();
    }
    
    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
    
    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getBorrowerType() {
        return borrowerType;
    }

    public void setBorrowerType(String borrowerType) {
        this.borrowerType = borrowerType;
    }

    public int getNoOfInstallmentsPaid() {
        return noOfInstallmentsPaid;
    }

    public void setNoOfInstallmentsPaid(int noOfInstallmentsPaid) {
        this.noOfInstallmentsPaid = noOfInstallmentsPaid;
    }

    public int getNoOfInstallmentsUnpaid() {
        return noOfInstallmentsUnpaid;
    }

    public void setNoOfInstallmentsUnpaid(int noOfInstallmentsUnpaid) {
        this.noOfInstallmentsUnpaid = noOfInstallmentsUnpaid;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getIndexRate() {
        return indexRate;
    }

    public void setIndexRate(double indexRate) {
        this.indexRate = indexRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getInstallment() {
        return installment;
    }

    public void setInstallment(String installment) {
        this.installment = installment;
    }

    public String getAmortization() {
        return amortization;
    }

    public void setAmortization(String amortization) {
        this.amortization = amortization;
    }

    public Date getDisbursementDate() {
        return disbursementDate;
    }

    public void setDisbursementDate(Date disbursementDate) {
        this.disbursementDate = disbursementDate;
    }

    public Date getRepaymentStartDate() {
        return repaymentStartDate;
    }

    public void setRepaymentStartDate(Date repaymentStartDate) {
        this.repaymentStartDate = repaymentStartDate;
    }

    public Date getRepaymentEndDAte() {
        return repaymentEndDAte;
    }

    public void setRepaymentEndDAte(Date repaymentEndDAte) {
        this.repaymentEndDAte = repaymentEndDAte;
    }

    public int getNoOfInstallments() {
        return noOfInstallments;
    }

    public void setNoOfInstallments(int noOfInstallments) {
        this.noOfInstallments = noOfInstallments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CollateralDirectory getCollateralDirectory() {
        return collateralDirectory;
    }

    public void setCollateralDirectory(CollateralDirectory collateralDirectory) {
        this.collateralDirectory = collateralDirectory;
    }
    @Override
    public  String toString()
    {
        return String.valueOf(this.getLoanId());
    }

    public int getNoOfTakedown() {
        return noOfTakedown;
    }

    public void setNoOfTakedown(int noOfTakedown) {
        this.noOfTakedown = noOfTakedown;
    }
    
    
    
}
