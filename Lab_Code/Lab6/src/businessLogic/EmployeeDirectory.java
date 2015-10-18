/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.ArrayList;

/**
 *
 * @author Bala
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        employeeList = new ArrayList<Employee>();
    }

    /**
     * @return the employeeList
     */
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * @param employeeList the employeeList to set
     */
    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee AddEmployee(){
        Employee e = new Employee();
        employeeList.add(e);
        return e;
    }
    
    public void deleteEmployee(Employee employee){
        employeeList.remove(employee);
    }
            
}
