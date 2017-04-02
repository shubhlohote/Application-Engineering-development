/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Role.CustomerServiceManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class CustomerServiceDepartment extends Department {
    public CustomerServiceDepartment()
    {
        super(Department.Type.CustomerService.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerServiceManager());
        return roles;
    }
    
}
