/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;


import Business.Role.RiskAssessmentManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class RiskAssessmentDepartment extends Department{

    RiskAssessmentDepartment() {
        super(Department.Type.RiskAssessment.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RiskAssessmentManager());
        return roles;
    }
    
}
