package com.ust.empapp.model;

public class Manager extends Employee {

    private int teamSize;

    public Manager(int employeeId, String name, double salary, int teamSize) {
        super(employeeId, name, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+teamSize);
    }


}
