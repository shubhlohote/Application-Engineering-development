/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import Business.Enterprise.Enterprise;
import Business.Loan.Loan;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class BankAccountDirectory {
    private ArrayList<BankAccount> bankAccountList;
    public BankAccountDirectory() {
        bankAccountList = new ArrayList<>();
    }

    public ArrayList<BankAccount> getbankAccountList() {
        return bankAccountList;
    }
    public BankAccount createAndAddAccount(){
      // Enterprise enterprise = null;
      // if (type == Enterprise.EnterpriseType.Bank){
            BankAccount account  = new BankAccount();
            bankAccountList.add(account);
            System.out.println("hi");
       //
       
      //}
        return account;
    }
    
}
