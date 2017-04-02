/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.Department;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public abstract class Role {
    public enum RoleType{
       CustomerService("Customer Service Department"), RiskAssessment("Risk Assessment Department"), LoanProcessing("Loan Processing Department"), 
       SecurityOperation("Security Operation Department");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Useraccount account, 
            Department department, 
            Enterprise enterprise, 
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
