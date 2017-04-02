/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Role.LoanProcessingManager;
import Business.Role.Role;
import Business.Role.SecurityOperationManager;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class SecurityOperationDepartment extends Department {

    SecurityOperationDepartment() {
         super(Department.Type.SecurityOperation.getValue());
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SecurityOperationManager());
        return roles;
    }
    
}
