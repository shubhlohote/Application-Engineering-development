/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.MacAddress.MacAddress;
import Business.Network.Customer;
import Business.Role.Role;
import Business.Workqueue.WorkQueue;

/**
 *
 * @author admin01
 */
public class Useraccount {
    private String username;
    private String password;
    private Employee employee;
    private Customer customer;
    private Role role;
    private WorkQueue workQueue;
    private MacAddress macAddress;
    private SessionTimeDirectory sessionTimeDirectory;
    
    
    public Useraccount() {
        workQueue = new WorkQueue();
        sessionTimeDirectory=new SessionTimeDirectory();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MacAddress getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(MacAddress macAddress) {
        this.macAddress = macAddress;
    }

//    public SessionTime getSessionTime() {
//        return sessionTime;
//    }
//
//    public void setSessionTime(SessionTime sessionTime) {
//        this.sessionTime = sessionTime;
//    }

    public SessionTimeDirectory getSessionTimeDirectory() {
        return sessionTimeDirectory;
    }

    public void setSessionTimeDirectory(SessionTimeDirectory sessionTimeDirectory) {
        this.sessionTimeDirectory = sessionTimeDirectory;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    @Override
    public String toString() {
        return username;
    }
    
}
