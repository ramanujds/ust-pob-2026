package com.ust.empapp.model;

public abstract class Employee implements Comparable<Employee> {

    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println(this.getClass().getSimpleName() + " Details:");
        System.out.println("ID : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Salary "+salary);
    }


    @Override
    public int compareTo(Employee e) {
        return Double.compare(salary,e.salary);
    }
}
