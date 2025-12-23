package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

public interface EmployeeRepository {

    void saveEmployee(Employee employee);

    Employee findEmployee(int id);

    void deleteEmployee(int id);

    Employee[] getAllEmployees();


}
