/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.Loan.Loan;
import java.util.Date;

/**
 *
 * @author admin01
 */
public class RiskAssessmentWorkRequest extends WorkRequest {
    private String testResult;
    private String borrowerType;
    private Loan loan;
    private int loanId;
    //private  static int count=1;
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
    private String status;
    private String dues;
    private String collateralType;
    private double valuation;
    private String hazard;
    private String hazardDesciption;
    private double insuranceAmount;
    private Date ownershipDate;
    private int noOfTakedown;
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public double getValuation() {
        return valuation;
    }

    public void setValuation(double valuation) {
        this.valuation = valuation;
    }

    public String getHazard() {
        return hazard;
    }

    public void setHazard(String hazard) {
        this.hazard = hazard;
    }

    public String getHazardDesciption() {
        return hazardDesciption;
    }

    public void setHazardDesciption(String hazardDesciption) {
        this.hazardDesciption = hazardDesciption;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    
    public Date getOwnershipDate() {
        return ownershipDate;
    }

    public void setOwnershipDate(Date ownershipDate) {
        this.ownershipDate = ownershipDate;
    }

    public String getDues() {
        return dues;
    }

    public void setDues(String dues) {
        this.dues = dues;
    }

    public String getBorrowerType() {
        return borrowerType;
    }

    public void setBorrowerType(String borrowerType) {
        this.borrowerType = borrowerType;
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

    public int getNoOfTakedown() {
        return noOfTakedown;
    }

    public void setNoOfTakedown(int noOfTakedown) {
        this.noOfTakedown = noOfTakedown;
    }
    
    
    
}
