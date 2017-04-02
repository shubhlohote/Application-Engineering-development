/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import java.util.Date;

/**
 *
 * @author admin01
 */
public class BankAccount {
    private long accountNo;
    private String accountType;
    private long routingNo;
    private String branchName;
    private double balance;
    private Date openDate;
    private String status;
    public BankAccount()
    {
        openDate=new Date();
    }

    public long getAccountNo() {
        return accountNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(long routingNo) {
        this.routingNo = routingNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
    
    
}
