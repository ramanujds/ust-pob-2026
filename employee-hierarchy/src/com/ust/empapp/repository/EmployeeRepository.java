package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    void saveEmployee(Employee employee);

    Employee findEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> getAllEmployees();

    Employee findEmployeeByName(String name);

    List<Employee> findEmployeeInSalaryRange(double min, double max);

    List<Employee> sortBySalary();

    Employee findHighestPaidEmployee();



}
