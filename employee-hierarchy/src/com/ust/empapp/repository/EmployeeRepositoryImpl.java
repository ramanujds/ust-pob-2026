package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {


    List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee) {

        employees.add(employee);
    }

    public Employee findEmployee(int id) {

        for (Employee emp : employees) {
            if (emp.getEmployeeId() == id) {
                return emp;
            }
        }

        return null;

//        return employees.stream().filter(e->e.getEmployeeId()==id).findFirst().orElse(null);


    }

    public void deleteEmployee(int id) {

        Employee emp = findEmployee(id);
        employees.remove(emp);

//        employees.removeIf(e->e.getEmployeeId()==id);


    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

}
