/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin01
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(String fname,String lname,long SSN,long phNo,double yearlyIncome){
        Customer customer = new Customer();
        customer.setFirstName(fname);
        customer.setLastName(lname);
        customer.setPhNo(phNo);
        customer.setSSN(SSN);
       // customer.setDOB(DOB);
        customer.setYearlyIncome(yearlyIncome);
        
        customerList.add(customer);
        return customer;
    }
    
    
}
