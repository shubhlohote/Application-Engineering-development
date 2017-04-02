/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.Department;
import Business.Department.HRDepartment;
import Business.Department.LoanProcessingDepartment;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import UserInterface.BranchAdminRole.BranchAdminWorkAreaJPanel;
import UserInterface.HRManager.HRManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class HRManager extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Useraccount account, Department department, Enterprise enterprise, Ecosystem business) {
        return new HRManagerWorkAreaJPanel(userProcessContainer,account, (HRDepartment)department, enterprise);
    }
    
}
