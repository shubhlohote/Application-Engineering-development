/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.CustomerServiceDepartment;
import Business.Department.Department;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import UserInterface.CustomerServiceManagerRole.CustomerServiceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class CustomerServiceManager extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Useraccount account, Department department, Enterprise enterprise, Ecosystem business) {
        return new CustomerServiceWorkAreaJPanel(userProcessContainer, account, (CustomerServiceDepartment)department, enterprise);
    }
    
}
