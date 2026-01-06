package com.ust.empapp.repository;

import com.ust.empapp.exception.EmployeeNotFoundException;
import com.ust.empapp.model.Employee;

import java.util.*;


public class EmployeeRepositoryImpl implements EmployeeRepository {


    List<Employee> employees = new LinkedList<>();

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployee(int id) {

//        for (Employee emp : employees) {
//            if (emp.getEmployeeId() == id) {
//                return emp;
//            }
//        }
//
//        throw new EmployeeNotFoundException("Employee with id : "+id+ " Not Found");


     return employees.stream().filter(e->e.getEmployeeId()==id)
                                .findFirst()
                                .orElseThrow(()->new EmployeeNotFoundException("Employee with id : "+id+ " Not Found"));


    }

    public void deleteEmployee(int id) {

//        Employee emp = findEmployee(id);
//        employees.remove(emp);

        employees.removeIf(e->e.getEmployeeId()==id);


    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee findEmployeeByName(String name) {
//        for (Employee emp : employees) {
//            if (emp.getName().equalsIgnoreCase(name)) {
//                return emp;
//            }
//        }
//
//        return null;

        return employees.stream()
                .filter(e->e.getName().equalsIgnoreCase(name)).findFirst()
                .orElseThrow(()->new EmployeeNotFoundException("Employee with name : "+name+ " Not Found"));
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
        return employees.stream().sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).toList();
    }

    public List<Employee> sortByName() {
        return employees.stream().sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).toList();
    }

    public Employee findHighestPaidEmployee() {
//       // Comparator<Employee> comp = new EmployeeCompareBySalary();
//       //  return employees.stream().max(comp).orElse(null);
//        Employee high = null;
//        if (!employees.isEmpty()) {
//            high = employees.get(0);
//            for(Employee emp : employees) {
//                if(emp.getSalary() > high.getSalary()) {
//                    high = emp;
//                }
//            }
//        }
//        return high;
        return employees.stream().max((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).get();

    }

}
