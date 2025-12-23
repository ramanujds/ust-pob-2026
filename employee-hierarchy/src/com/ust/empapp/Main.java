package com.ust.empapp;


import com.ust.empapp.model.Developer;
import com.ust.empapp.model.Employee;
import com.ust.empapp.model.Manager;
import com.ust.empapp.repository.EmployeeRepository;
import com.ust.empapp.repository.EmployeeRepositoryImpl;

public class Main {
    public static void main(String []args) {
        Employee employee1 = new Manager(101,"Harsh",25000,10);
        Employee employee2 = new Developer(105,"Karan",65000,"Java");

        EmployeeRepository employeeRepo = new EmployeeRepositoryImpl();

        employeeRepo.saveEmployee(employee1);
        employeeRepo.saveEmployee(employee2);

        employeeRepo.deleteEmployee(101);

        var emps = employeeRepo.getAllEmployees();

        for(int i=0; i<EmployeeRepositoryImpl.current; i++){
            if (emps[i]!=null) {
                emps[i].displayDetails();
            }
        }







    }
}
