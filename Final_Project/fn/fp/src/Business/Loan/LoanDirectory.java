/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Loan;

import Business.Enterprise.BankEnterprise;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class LoanDirectory {
    private ArrayList<Loan> loanList;
    public LoanDirectory() {
        loanList = new ArrayList<>();
    }

    public ArrayList<Loan> getLoanList() {
        return loanList;
    }
    public Loan createAndAddLoan(){
       // Enterprise enterprise = null;
       // if (type == Enterprise.EnterpriseType.Bank){
            Loan loan  = new Loan();
            loanList.add(loan);
       // }
        return loan;
    }
    
}
