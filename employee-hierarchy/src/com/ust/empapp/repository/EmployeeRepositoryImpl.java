package com.ust.empapp.repository;

import com.ust.empapp.model.Employee;

import java.util.*;


class EmployeeCompareByName implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class EmployeeCompareBySalary implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

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

    public Employee findEmployeeByName(String name) {
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                return emp;
            }
        }

        return null;
    }

    public List<Employee> findEmployeeInSalaryRange(double min, double max) {
        List<Employee> list = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getSalary() >= min && emp.getSalary() <= max) {
                list.add(emp);
            }
        }
        return list;
    }

    public List<Employee> sortBySalary() {
        Comparator<Employee> comp = new EmployeeCompareBySalary();
        employees.sort(comp);
        return employees;
    }

    public List<Employee> sortByName() {
        Comparator<Employee> comp = new EmployeeCompareByName();
        employees.sort(comp);
        return employees;
    }

    public Employee findHighestPaidEmployee() {
       // Comparator<Employee> comp = new EmployeeCompareBySalary();
       //  return employees.stream().max(comp).orElse(null);
        Employee high = null;
        if (!employees.isEmpty()) {
            high = employees.get(0);
            for(Employee emp : employees) {
                if(emp.getSalary() > high.getSalary()) {
                    high = emp;
                }
            }
        }
        return high;

    }

}
