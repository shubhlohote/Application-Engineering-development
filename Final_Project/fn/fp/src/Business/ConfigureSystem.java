    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.MacAddress.MacAddress;
import Business.Role.AdminRole;
import Business.UserAccount.Useraccount;

/**
 *
 * @author admin01
 */
public class ConfigureSystem {
    public static Ecosystem configure(){
        Ecosystem system = Ecosystem.getInstance();
        Employee employee =system.getEmployeeDirectory().createEmployee("Shubhangi","Lohote",100000,1617991,"shubh123",1234);
        Useraccount ua=system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new AdminRole());
        MacAddress macAddress=system.getMacAddressDirectory().createMacAddress("server123", 12346);
        ua.setMacAddress(macAddress);
        return system;
        
       
    }
    
    
}
