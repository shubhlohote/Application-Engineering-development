/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import java.util.Date;

/**
 *
 * @author admin01
 */
public class CustomerAccountWorkRequest extends WorkRequest {
    private String testResult;
    private long accountNo;
    private String accountType;
    private long routingNo;
    private String branchName;
    private double balance;
    private Date openDate;

    public long getAccountNo() {
        return accountNo;
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
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
}
