/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.BankAccount.BankAccountDirectory;
import Business.Collateral.CollateralDirectory;
import Business.Employee.Person;
import Business.Loan.LoanDirectory;

/**
 *
 * @author admin01
 */
public class Customer extends Person {
    private static int count =1;
    private  int customerId;
    private LoanDirectory loanDirectory;
    private BankAccountDirectory bankAccountDirectory;
    private CollateralDirectory collateralDirectory;
    private String earlierDues;
    private String status;
    
    
    public Customer()
    {
        customerId=count++;
        loanDirectory=new LoanDirectory();
        bankAccountDirectory=new BankAccountDirectory();
    }

    public String getEarlierDues() {
        return earlierDues;
    }

    public void setEarlierDues(String earlierDues) {
        this.earlierDues = earlierDues;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LoanDirectory getLoanDirectory() {
        return loanDirectory;
    }

    public void setLoanDirectory(LoanDirectory loanDirectory) {
        this.loanDirectory = loanDirectory;
    }

    public CollateralDirectory getCollateralDirectory() {
        return collateralDirectory;
    }

    public void setCollateralDirectory(CollateralDirectory collateralDirectory) {
        this.collateralDirectory = collateralDirectory;
    }

    public BankAccountDirectory getBankAccountDirectory() {
        return bankAccountDirectory;
    }

    public void setBankAccountDirectory(BankAccountDirectory bankAccountDirectory) {
        this.bankAccountDirectory = bankAccountDirectory;
    }
    public  String toString()
    {
        return String.valueOf(this.getSSN());
    }
    
    
}
