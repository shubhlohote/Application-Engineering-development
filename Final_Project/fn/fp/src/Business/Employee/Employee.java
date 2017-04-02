/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author admin01
 */
public class Employee extends Person {
    private static int count =1;
    private int employeeId;
    private int violationCounter=0;
    
    public Employee()
    {
        employeeId=count++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public  String toString()
    {
        return  this.getFirstName();
    }

    public int getViolationCounter() {
        return violationCounter;
    }

    public void setViolationCounter(int violationCounter) {
        this.violationCounter = violationCounter;
    }
    public void incrementCounter()
    {
        violationCounter= violationCounter+1;
    }
    

    
    
}
