/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.MacAddress.MacAddressDirectory;
import Business.Network.CustomerDirectory;
import Business.Role.Role;
import Business.UserAccount.SessionTimeDirectory;
import Business.UserAccount.UseraccountDirectory;
import Business.Workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public abstract class Department {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UseraccountDirectory userAccountDirectory;
    private MacAddressDirectory macAddressDirectory;
    //private SessionTimeDirectory sessionTimeDirectory;
   // private CustomerDirectory customerDirectory;
    private int departmentID;
    private static int counter;
    
    public enum Type{
       CustomerService("Customer Service Department"), RiskAssessment("Risk Assessment Department"), LoanProcessing("Loan Processing Department"), SecurityOperation("Security Operation Department") ,HR("HR Department");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Department(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UseraccountDirectory();
        macAddressDirectory= new  MacAddressDirectory();
        //sessionTimeDirectory=new SessionTimeDirectory();
       // customerDirectory=new CustomerDirectory();
        departmentID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

//    public SessionTimeDirectory getSessionTimeDirectory() {
//        return sessionTimeDirectory;
//    }
//
//    public void setSessionTimeDirectory(SessionTimeDirectory sessionTimeDirectory) {
//        this.sessionTimeDirectory = sessionTimeDirectory;
//    }
     
    public UseraccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UseraccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public MacAddressDirectory getMacAddressDirectory() {
        return macAddressDirectory;
    }

    public void setMacAddressDirectory(MacAddressDirectory macAddressDirectory) {
        this.macAddressDirectory = macAddressDirectory;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    //public CustomerDirectory getCustomerDirectory() {
   //     return customerDirectory;
   // }

  //  public void setCustomerDirectory(CustomerDirectory customerDirectory) {
   //     this.customerDirectory = customerDirectory;
   // }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
