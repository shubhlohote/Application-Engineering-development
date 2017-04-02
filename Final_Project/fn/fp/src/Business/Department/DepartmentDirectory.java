/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Department.Department.Type;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class DepartmentDirectory {
    private ArrayList<Department> departmentList;

    public DepartmentDirectory() {
        departmentList = new ArrayList<>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public Department createDepartment(Type type)
    {
      Department department=null;
      if(type.getValue().equals(Type.CustomerService.getValue()))
      {
          department=new CustomerServiceDepartment();
          departmentList.add(department);
          
      }
      else if(type.getValue().equals(Type.RiskAssessment.getValue()))
      {
          department = new RiskAssessmentDepartment();
          departmentList.add(department);
       }
       else if(type.getValue().equals(Type.LoanProcessing.getValue()))
      {
          department = new LoanProcessingDepartment();
          departmentList.add(department);
       }
       else if(type.getValue().equals(Type.SecurityOperation.getValue()))
      {
          department = new SecurityOperationDepartment();
          departmentList.add(department);
       }
      else if(type.getValue().equals(Type.HR.getValue()))
      {
          department = new HRDepartment();
          departmentList.add(department);
       }
      
      return  department;
    }
    
    
}
