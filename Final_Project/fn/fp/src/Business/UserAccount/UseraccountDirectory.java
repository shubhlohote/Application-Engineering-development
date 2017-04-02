/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Network.Customer;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class UseraccountDirectory {
    private ArrayList<Useraccount> userAccountList;

    public UseraccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<Useraccount> getUserAccountList() {
        return userAccountList;
    }

    public Useraccount authenticateUser(String username, String password,long vpn)
    {
        for (Useraccount ua:userAccountList)
        {
            if(ua.getUsername().equals(username) && ua.getPassword().equals(password) && ua.getMacAddress().getVpnCode()== vpn)
            {
                return ua;
            }
        }
        return null;
    }
    
    public Useraccount createUserAccount(String username, String password, Employee employee, Role role)
    {
        Useraccount ua=new Useraccount();
        ua.setEmployee(employee);
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(role);
        //ua.setMacAddress(macAddress);
        
        userAccountList.add(ua);
        return ua;
    }
    public Useraccount createCustomerUserAccount(String username, String password, Customer customer)
    {
        Useraccount ua=new Useraccount();
        ua.setCustomer(customer);
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(new CustomerRole());
        userAccountList.add(ua);
        return ua;
    }
    public boolean checkIfUsernameIsUnique(String username)
    {
        for(Useraccount ua :userAccountList)
        {
            if(ua.getUsername().equals(username))
            {
                return false;
            }
        }
        return true;
    }
    
    
}
