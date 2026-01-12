package model;

public class Employee extends Person{

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    private double salary;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showPerson() {
        super.showPerson();
        System.out.println("Salary : "+salary);
    }
}
