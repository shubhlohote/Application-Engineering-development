/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String fname,String lname,double income,long phno,String emailid,long ssn){
        Employee employee = new Employee();
        employee.setFirstName(fname);
        employee.setLastName(lname);
        employee.setPhNo(phno);
        employee.setEmailId(emailid);
        employee.setYearlyIncome(income);
        employee.setSSN(ssn);
        //employee.setLastName(name);
        employeeList.add(employee);
        return employee;
    }
    
}
